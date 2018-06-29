package org.ac.ads.adsapi.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService {
	
	private static String URI;
	
	@Autowired
	private void createUri(Environment env) {
		URI = env.getProperty("mule.uri") + "/customers/";
	}
	
	@Override
	public Boolean isValidAccountNumber(Long accountNumber) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		
		ResponseEntity<String> result = restTemplate.exchange(URI, HttpMethod.GET, entity, String.class);
		if(result.getStatusCode().value() == 404) {
			return false;
		}
		
		if(!result.getStatusCode().is2xxSuccessful()) {
			throw new IllegalStateException(result.getBody());
		}
		
		return true;
	}

}
