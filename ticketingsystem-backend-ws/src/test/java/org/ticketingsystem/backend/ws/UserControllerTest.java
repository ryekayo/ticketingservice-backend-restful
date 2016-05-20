package org.ticketingsystem.backend.ws;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ticketingsystem.entity.UserEntity;

public class UserControllerTest extends BaseControllerTests {

	private final static Log logger = LogFactory.getLog(UserControllerTest.class);
	
	private UserEntity createUserEntity()
	{
		UserEntity user = new UserEntity();
		//---------------------------------------------------------------------------------
		long _userId = 1;
		String _userName = "RKAHIL";
		String _password = "TEST";
		String _name = "RYAN KAHIL";
		String _email = "rkahil@test.com";
		String _title = "VP";
		String _phone = "555-555-5555";
		user.setUserId(_userId);
		user.setUserName(_userName);
		user.setPassword(_password);
		user.setName(_name);
		user.setEmailAddress(_email);
		user.setTitle(_title);
		user.setPhoneNumber(_phone);
		//----------------------------------------------------------------------------------
		return user;
	}
	@Test
	public void testMockGetUserListOne() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/user/");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockGetUserListTwo() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/user");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockGetUserByUserId() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/user/userid/1");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockDeleteUserByUserId() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/user/delete/1");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
}
