package org.ticketingsystem.backend.ws;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ticketingsystem.entity.RoleEntity;

public class RoleControllerTest extends BaseControllerTests {
	
	private final static Log logger = LogFactory.getLog(RoleControllerTest.class);
	
	private RoleEntity createRoleEntity()
	{
		RoleEntity role = new RoleEntity();
		//----------------------------------------------------------------------------------
		long _roleId = 6;
		boolean _adminAccess = true;
		boolean _moderatorAccess = false;
		boolean _observerAccess = false;
		String _roleName = "ADMIN";
		role.setRoleId(_roleId);
		role.setAdminAccess(_adminAccess);
		role.setModeratorAccess(_moderatorAccess);
		role.setObserverAccess(_observerAccess);
		role.setRoleName(_roleName);
		//----------------------------------------------------------------------------------
		return role;
	}
	@Test
	public void testMockGetRoleListOne() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/role/");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockGetRoleListTwo() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/role");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockDeleteRoleByRoleId() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/role/delete/1");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
}
