package com.ticketingsystem.backend.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.RoleEntity;
import com.ticketingsystem.entity.UserRolesEntity;
import com.ticketingsystem.entity.UserEntity;

public class UserRolesImplTest extends BaseServiceImplTests {
	
	private static final Log logger = LogFactory.getLog(UserTicketImplTest.class);
	
	@Autowired
	private UserRolesService service;
	
	@Override
	@org.junit.Before
	public void setUp() throws Exception {
		System.out.println("setUp: service: " + service);
	}

	@Override
	@org.junit.After
	public void tearDown() {
		service = null;
		System.out.println("tearDown: context set null.");
	}
	
	private UserRolesEntity createUserRolesEntity()
	{
		UserRolesEntity userRoles = new UserRolesEntity();
		UserEntity user = new UserEntity();
		RoleEntity role = new RoleEntity();
		//-----------------------------------------------------------
		long _userRolesId = 12;
		long _userId = 8;
		long _roleId = 3;
		user.setUserId(_userId);
		role.setRoleId(_roleId);
		userRoles.setId(_userRolesId);
		userRoles.setRoleId(role);
		userRoles.setUserId(user);
		return userRoles;
	}
	@Test
	public void testAddUserRolesEntity()
	{
		System.out.println("testAddUserRolesEntity : STARTING");
		UserRolesEntity userRoles = new UserRolesEntity();
		UserEntity user = new UserEntity();
		RoleEntity role = new RoleEntity();
		//------------------------------------------------------------
		long _userRolesId = 12;
		long _userId = 3;
		long _roleId = 6;
		user.setUserId(_userId);
		role.setRoleId(_roleId);
	    userRoles.setId(_userRolesId);
		userRoles.setRoleId(role);
		userRoles.setUserId(user);
		assertNotNull(userRoles);
		//------------------------------------------------------------
		userRoles = service.add(userRoles);
		System.out.println("testAddUserRolesEntity: " + userRoles.toString());
		//------------------------------------------------------------
		System.out.println("testAddUserRolesEntity : FINISHED");
	}
	@Test
	public void testUpdateUserRolesEntity()
	{
		System.out.println("testUpdateUserRolesEntity : STARTING");
		UserRolesEntity userRoles = new UserRolesEntity();
		UserEntity user = new UserEntity();
		RoleEntity role = new RoleEntity();
		//------------------------------------------------------------
		long _userRolesId = 10;
		long _userId = 2;
		long _roleId = 8;
		user.setUserId(_userId);
		role.setRoleId(_roleId);
		userRoles.setId(_userRolesId);
		userRoles.setRoleId(role);
		userRoles.setUserId(user);
		assertNotNull(userRoles);
		//------------------------------------------------------------
		userRoles = service.update(userRoles);
		System.out.println("testUpdateUserRolesEntity: " + userRoles.toString());
		//------------------------------------------------------------
		System.out.println("testUpdateUserRolesEntity : FINISHED");
	}
	@Test
	public void testRemoveUserRolesEntity()
	{
		System.out.println("testUpdateUserRolesEntity : STARTING");
		UserRolesEntity userRoleOne = new UserRolesEntity();
		long _userRoleId = 8;
		userRoleOne.setId(_userRoleId);
		//-----------------------------------------------------------
		System.out.println("testUpdateUserRolesEntityOne : START");
		assertNotNull(userRoleOne);
		service.remove(userRoleOne);
		System.out.println("testUpdateUserRolesEntityOne : DELETED");
		//------------------------------------------------------------
		long _userRoleIdTwo = 11;
		System.out.println("testUpdateUserRolesEntityTwo : START");
		assertNotNull(_userRoleIdTwo);
		service.remove(_userRoleIdTwo);
		System.out.println("testUpdateUserRoleEntityTwo : DELETED");
		//------------------------------------------------------------
		System.out.println("testUpdateUserRolesEntity : FINISHED");
	}
}
