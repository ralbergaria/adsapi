package org.ac.ads.adsapi.controller;

import java.util.HashMap;
import java.util.Map;

import org.ac.ads.adsapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired UserService userService;
	
	@RequestMapping(value = "/isValidAccountNumber/{idAccountNumber}", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<?> isValidAccountNumber(@PathVariable String accountNumber){
		Map<String, Boolean> success = new HashMap<String, Boolean>();
	    success.put("success", userService.isValidAccountNumber(new Long(accountNumber)));
	    return new ResponseEntity<>(success, HttpStatus.OK);
	}
}
