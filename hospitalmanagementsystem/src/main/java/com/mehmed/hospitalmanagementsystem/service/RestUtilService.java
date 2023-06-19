package com.mehmed.hospitalmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestUtilService {

	@Autowired
	private RestTemplate restTemplate;
	
	public String post(String url, Object responseBody) {
		return restTemplate.postForObject(url, responseBody, String.class);
		
		/*String response = restTemplate.postForObject(url, responseBody, String.class);
		 * 
		 * if(response.equalsIgnoreCase("SUCCESS")
		 * {
		 * 		return new AppResponse("success" , "200" , "Email Send Successfully" , null);
		 * }
		 * 
		 * else
		 * {
		 * 		return "Failure" ;
		 * }
		 * 
		 */
	}
}
