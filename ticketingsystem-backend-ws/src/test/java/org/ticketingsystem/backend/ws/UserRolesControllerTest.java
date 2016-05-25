package org.ticketingsystem.backend.ws;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ticketingsystem.entity.UserRolesEntity;
import com.ticketingsystem.entity.UserEntity;
import com.ticketingsystem.entity.RoleEntity;

public class UserRolesControllerTest extends BaseControllerTests {

	private final static Log logger = LogFactory.getLog(UserRolesControllerTest.class);
	
	private UserRolesEntity createUserRolesEntity()
	{
		UserRolesEntity userRole = new UserRolesEntity();
		UserEntity user = new UserEntity();
		RoleEntity role = new RoleEntity();
		//--------------------------------------------------------------------------------------
		long _id = 8;
		long _roleId = 6;
		long _userId = 1;
		user.setUserId(_userId);
		role.setRoleId(_roleId);
		userRole.setId(_id);
		userRole.setUserId(user);
		userRole.setRoleId(role);
		//---------------------------------------------------------------------------------------
		return userRole;
	}
	@Test
	public void testMockDeleteUserByUserId() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/userroles/delete/1");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
}
