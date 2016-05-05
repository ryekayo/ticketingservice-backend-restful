package com.ticketingsystem.backend.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.RoleEntity;

public class RoleImplTest extends BaseServiceImplTests {
	
	private static final Log logger = LogFactory.getLog(RoleImplTest.class);
	
	@Autowired
	private RoleService service;
	
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
	
	private RoleEntity createRoleEntity()
	{
		RoleEntity roleEntity = new RoleEntity();
		long _roleId = 6;
		boolean _adminAccess = true;
		boolean _moderatorAccess = false;
		boolean _observerAccess = false;
		String _roleName = "ADMIN";
		roleEntity.setRoleId(_roleId);
		roleEntity.setAdminAccess(_adminAccess);
		roleEntity.setModeratorAccess(_moderatorAccess);
		roleEntity.setObserverAccess(_observerAccess);
		roleEntity.setRoleName(_roleName);
		return roleEntity;
	}
	@Test
	public void testFetchGetAllRole()
	{
		System.out.println("testFetchGetAllRole : STARTING");
		List<RoleEntity> role = service.getAllRole();
		if(role != null)
		{
			System.out.println("testFetchGetAllRole: " + role.toString());
		}
		assertNotNull(role);
		System.out.println("testFetchGetAllRole : FINISHED");
	}
	@Test
	public void testAddRoleEntity()
	{
		System.out.println("testAddRoleEntity : STARTING");
		RoleEntity role = new RoleEntity();
		long _roleId = 9;
		boolean _adminAccess = true;
		boolean _moderatorAccess = true;
		boolean _observerAccess = true;
		String _roleName = "test";
		role.setRoleId(_roleId);
		role.setAdminAccess(_adminAccess);
		role.setModeratorAccess(_moderatorAccess);
		role.setObserverAccess(_observerAccess);
		role.setRoleName(_roleName);
		assertNotNull(role);
		service.add(role);
		System.out.println("testAddRoleEntity: " + role.toString());
		System.out.println("testAddRoleEntity : FINISHED");
	}
	@Test
	public void testUpdateRoleEntity()
	{
		System.out.println("testUpdateRoleEntity : STARTING");
		RoleEntity role = new RoleEntity();
		long _roleId = 6;
		boolean _adminAccess = false;
		boolean _moderatorAccess = true;
		boolean _observerAccess = true;
		String _roleName = "test";
		role.setRoleId(_roleId);
		role.setAdminAccess(_adminAccess);
		role.setModeratorAccess(_moderatorAccess);
		role.setObserverAccess(_observerAccess);
		role.setRoleName(_roleName);
		assertNotNull(role);
		service.update(role);
		System.out.println("testUpdateRoleEntity: " + role.toString());
		System.out.println("testUpdateRoleEntity : FINISHED");
	}
	@Test
	public void testRemoveRoleEntity()
	{
		System.out.println("testRemoveRoleEntity : STARTING");
		RoleEntity role = new RoleEntity();
		long _roleId = 6;
		role.setRoleId(_roleId);
		assertNotNull(role);
		//---------------------------------------------------------------
		System.out.println("testRemoveRoleEntityOne : START");
		service.remove(role);
		System.out.println("testRemoveRoleEntityOne : DELETED");
		//---------------------------------------------------------------
		long _roleIdTwo = 7;
		System.out.println("testRemoveRoleEntityTwo : START");
		service.remove(_roleIdTwo);
		System.out.println("testRemoveRoleEntityTwo : DELETED");
		//---------------------------------------------------------------
		System.out.println("testRemoveRoleEntity : FINISHED");
	}
}
