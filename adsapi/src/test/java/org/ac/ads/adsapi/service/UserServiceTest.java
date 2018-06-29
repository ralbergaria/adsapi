package org.ac.ads.adsapi.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	
	static final Long ACCOUNT_NUMBER_1 =  new Long("12341234123412341234");
	static final Long ACCOUNT_NUMBER_2 = new Long("12341234123412341235");

	
	@Mock
    private UserService userService;
	
	@Test
	public void shouldReturnIfAccountNumberExists() throws Exception {
		
		Boolean result = userService.isValidAccountNumber(ACCOUNT_NUMBER_1);
		
	}

}
