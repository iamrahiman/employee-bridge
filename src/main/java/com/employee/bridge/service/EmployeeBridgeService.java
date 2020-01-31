package com.employee.bridge.service;

import java.util.List;

import com.employee.bridge.dto.EmployeeBridgeDTO;
import com.employee.bridge.exception.EmployeeNotfoundException;


public interface EmployeeBridgeService {
	
	/**
	 * to get employee details
	 * @return List<EmployeeBridgeDTO> 
	 */
    public List<EmployeeBridgeDTO> fetchEmployees() throws EmployeeNotfoundException;
    
    /**
     * to fetch employee details based on employee id
     * @param id
     * @return EmployeeBridgeDTO
     */
	public EmployeeBridgeDTO fetchEmployeeById(Long iEmployeeID) throws EmployeeNotfoundException;

	/**
	 * method to return health
	 * @return String
	 */
	public String getHealth();

}
