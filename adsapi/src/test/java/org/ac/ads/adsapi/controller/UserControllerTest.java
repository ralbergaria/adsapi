package org.ac.ads.adsapi.controller;

import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.ac.ads.adsapi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
	
	static final String USERS_PATH = "/api/users";
	static final Long ACCOUNT_NUMBER_1 =  new Long("12341234123412341234");
	static final Long ACCOUNT_NUMBER_2 = new Long("12341234123412341235");
	
	@Autowired
	private MockMvc mvc;
	
	@Mock
    private UserService userService;
	
	@Test
	public void shouldReturnIfAccountNumberExists() throws Exception {
		
		when(userService.isValidAccountNumber(eq(ACCOUNT_NUMBER_1))).thenReturn(true);
		when(userService.isValidAccountNumber(eq(ACCOUNT_NUMBER_2))).thenReturn(false);
		
		ResultActions result =
                mvc.perform(get(USERS_PATH + "/isValidAccountNumber/" + ACCOUNT_NUMBER_1).contentType(MediaType.APPLICATION_JSON))
                        .andExpect(status().isOk());
		
		result
        .andExpect(jsonPath("success", is(true)));
		
		result =
                mvc.perform(get(USERS_PATH + "/isValidAccountNumber/" + ACCOUNT_NUMBER_2).contentType(MediaType.APPLICATION_JSON))
                        .andExpect(status().isOk());
		
		result
        .andExpect(jsonPath("success", is(false)));		
		
	}

}
