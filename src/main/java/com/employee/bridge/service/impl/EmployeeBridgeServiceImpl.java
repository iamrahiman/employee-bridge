package com.employee.bridge.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.employee.bridge.annotations.Logging;
import com.employee.bridge.constants.EmployeeBridgeConstants;
import com.employee.bridge.dto.EmployeeBridgeDTO;
import com.employee.bridge.exception.EmployeeNotfoundException;
import com.employee.bridge.service.EmployeeBridgeService;

@Service
public class EmployeeBridgeServiceImpl implements EmployeeBridgeService {


	
	private RestTemplate restTemplate;
	
	public EmployeeBridgeServiceImpl() {
	}
	@Autowired
	public EmployeeBridgeServiceImpl(RestTemplate restTemplate) {
		this();
		this.restTemplate=restTemplate;
	}
	

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	@Logging
	public List<EmployeeBridgeDTO> fetchEmployees() {

		ParameterizedTypeReference<List<EmployeeBridgeDTO>> responseType = new ParameterizedTypeReference<List<EmployeeBridgeDTO>>() {
		};
		ResponseEntity<List<EmployeeBridgeDTO>> response = null;
		System.out.println("----------------------------");
		restTemplate.getInterceptors().forEach(System.out::println);
		System.out.println("----------------------------");
		
		List<EmployeeBridgeDTO> aEmployeeBridgeDTO =new ArrayList<EmployeeBridgeDTO>();
		EmployeeBridgeDTO[] employeeBridgeDTO= restTemplate.exchange(EmployeeBridgeConstants.EMPLOYEE_FETCH_ALL_SERVICE_URL, HttpMethod.GET,null, EmployeeBridgeDTO[].class).getBody();
			aEmployeeBridgeDTO = Arrays.asList(employeeBridgeDTO);
		return aEmployeeBridgeDTO;
		

		/*
		 * try { response =
		 * restTemplate.exchange(EmployeeBridgeConstants.EMPLOYEE_FETCH_ALL_SERVICE_URL,
		 * HttpMethod.GET, null, responseType); } catch (Exception e) { throw new
		 * EmployeeNotfoundException("Employee Details Not Available"); } return
		 * response.getBody();
		 */
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	@Logging
	public EmployeeBridgeDTO fetchEmployeeById(Long iEmployeeID) {

		ResponseEntity<EmployeeBridgeDTO> response;

		try {
			response = restTemplate.getForEntity(EmployeeBridgeConstants.EMPLOYEE_FIND_SERVICE_URL + "/" + iEmployeeID, EmployeeBridgeDTO.class);
		} catch (Exception e) {
			throw new EmployeeNotfoundException("Employee Details Not Available for iEmployeeID : " + iEmployeeID);
		}

		return response.getBody();
	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	@Logging
	public String getHealth() {
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8585/employee/health", String.class);
		return response.getBody();

	}

}
