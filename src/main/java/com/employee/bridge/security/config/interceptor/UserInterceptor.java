package com.employee.bridge.security.config.interceptor;

import java.io.IOException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
/**
 * class to define intercept
 * @author abdul.rahimanshaik
 *
 */
@Component
public class UserInterceptor implements ClientHttpRequestInterceptor{

	/**
	 * method to define headers on each and every request
	 * {@inheritDoc}
	 */
	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		
		HttpHeaders httpHeaders=request.getHeaders();
		
		httpHeaders.add("appID", "200");
		httpHeaders.add("CommonKey", "Conciese");
		return execution.execute(request, body);
	}

}
