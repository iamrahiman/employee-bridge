package com.employee.bridge.config;

import java.io.IOException;
import java.time.Duration;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.employee.bridge.security.config.interceptor.UserInterceptor;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

/**
 * configuration class
 * @author abdul.rahimanshaik
 *
 */
@Configuration
public class EmployeeBridgeConfig {
	/**
	 * method to define rest template
	 * @param builder
	 * @return RestTemplate
	 */
	
	/*
	 * @Bean public RestTemplate restTemplate(RestTemplateBuilder builder) { return
	 * builder.setConnectTimeout(Duration.ofSeconds(180)).setReadTimeout(Duration.
	 * ofSeconds(500)).build(); }
	 */
	
	
	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		//restTemplate.setInterceptors(Collections.singletonList(new UserInterceptor()));
		  restTemplate.getInterceptors().add(new ClientHttpRequestInterceptor() {

			@Override
			public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
					throws IOException {
				
				 request.getHeaders().set("appID", "200");//Set the header for each request
				 request.getHeaders().set("CommonKey", "Conciese");//Set the header for each request
				 request.getHeaders().setDate("Date", System.currentTimeMillis());
		        return execution.execute(request, body);
			}
		  }); 
			   
		return restTemplate;
		
	} 	
	
	
	 

}
