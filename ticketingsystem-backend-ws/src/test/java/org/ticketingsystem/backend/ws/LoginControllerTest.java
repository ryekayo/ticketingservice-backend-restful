package org.ticketingsystem.backend.ws;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class LoginControllerTest extends BaseControllerTests {
	
	private final static Log logger = LogFactory.getLog(LoginControllerTest.class);
	
	@Test
	public void testMockGetUserByUserNameAndPassword()
	{
		MockHttpServletRequestBuilder requestBuilder = new MockMvcRequestBuilders.get("/login/user/{username}/pwd/{password}");
		requestBuilder.param("username", "RKAHIL");
		requestBuilder.param("password", "TEST1");
	}
}


