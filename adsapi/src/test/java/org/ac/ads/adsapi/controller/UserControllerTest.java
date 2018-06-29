package org.ac.ads.adsapi.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {
	
//	static final String USERS_PATH = "/api/users";
//	static final Long ACCOUNT_NUMBER_1 =  new Long(34123412341234L);
//	static final Long ACCOUNT_NUMBER_2 = new Long(34123412341235L);
//	
//	@Autowired
//	private MockMvc mvc;
	
	@Test
	public void shouldReturnIfAccountNumberExists() throws Exception {
		
//		when(userService.isValidAccountNumber(eq(ACCOUNT_NUMBER_1))).thenReturn(true);
//		when(userService.isValidAccountNumber(eq(ACCOUNT_NUMBER_2))).thenReturn(false);
		
//		ResultActions result =
//                mvc.perform(get(USERS_PATH + "/isValidAccountNumber/" + ACCOUNT_NUMBER_1).contentType(MediaType.APPLICATION_JSON))
//                        .andExpect(status().isOk());
//		
//		result
//        .andExpect(jsonPath("success", is(true)));
//		
//		result =
//                mvc.perform(get(USERS_PATH + "/isValidAccountNumber/" + ACCOUNT_NUMBER_2).contentType(MediaType.APPLICATION_JSON))
//                        .andExpect(status().isOk());
//		
//		result
//        .andExpect(jsonPath("success", is(false)));		
		
	}

}
