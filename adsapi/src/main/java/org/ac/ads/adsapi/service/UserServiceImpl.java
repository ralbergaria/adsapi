package org.ac.ads.adsapi.service;

import org.ac.ads.adsapi.endpoint.UserEndPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired UserEndPoint userEndPoint;
	
	@Override
	public Boolean isValidAccountNumber(Long accountNumber) {
		return userEndPoint.isValidAccountNumber(accountNumber);
	}

}
