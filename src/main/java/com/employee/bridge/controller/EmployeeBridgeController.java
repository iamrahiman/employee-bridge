package com.employee.bridge.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.bridge.annotations.Logging;
import com.employee.bridge.dto.EmployeeBridgeDTO;
import com.employee.bridge.service.EmployeeBridgeService;

/**
 * controller class to get employee details
 * 
 * @author abdul.rahimanshaik
 *
 */
@RestController
@RequestMapping("dashboard")
public class EmployeeBridgeController {
	
	
	private EmployeeBridgeService employeeBridgeService;
	
	
	public EmployeeBridgeController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public EmployeeBridgeController(EmployeeBridgeService employeeBridgeService) {
		this();
		this.employeeBridgeService=employeeBridgeService;
		
	}

	/**
	 * to get employee details based on id
	 * @param iEmployeeID
	 * @return
	 */
	@GetMapping
	@RequestMapping("/fetchemp/{iEmployeeID}")
	@Logging
	public EmployeeBridgeDTO fetchEmployeeById(@PathVariable Long iEmployeeID){
			return employeeBridgeService.fetchEmployeeById(iEmployeeID);
	}

	/**
	 * method to get employee details
	 * 
	 * @return list
	 */
	@GetMapping
	@RequestMapping("/fetchemp/all")
	@Logging
	public List<EmployeeBridgeDTO> fetchEmployees(){
		return employeeBridgeService.fetchEmployees();
	}
	@GetMapping
	@RequestMapping(path="/health")
	@Logging
	public String getHealth() {
		return employeeBridgeService.getHealth();
		
	}
}
