package com.employee.bridge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * class to start employee-bridge project
 * 
 * @author abdul.rahimanshaik
 *
 */
@SpringBootApplication
public class EmployeeBridgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeBridgeApplication.class, args);
	}
	
}
