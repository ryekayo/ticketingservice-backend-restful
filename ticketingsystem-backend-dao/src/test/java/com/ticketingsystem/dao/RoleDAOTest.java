package com.ticketingsystem.dao;

import java.util.HashSet;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.RoleEntity;

public class RoleDAOTest extends BaseDAOTests {

	final Logger logger = LoggerFactory.getLogger(RoleDAOTest.class);
	
	@Autowired
	private RoleDAO roleDAO;
	
	protected void setUp() throws Exception
    {
        System.out.println("Loading application context");
        System.out.println("Done Loading application context");
    }
    protected void tearDown() throws Exception
    {
        super.tearDown();
        System.out.println("tearDown: STARTING");
        System.out.println("tearDown: FINISHING");
    }  
    private HashSet<RoleEntity> createRole(RoleEntity roleEntity)
    {
    	HashSet<RoleEntity> role = new HashSet<RoleEntity>();
    	logger.debug("createRoleOne : STARTING");
    	RoleEntity roleEntityOne = null;
    	long _roleIdOne = 6;
    	boolean _adminAccessOne = true;
    	boolean _moderatorAccessOne = false;
    	boolean _observerAccessOne = false;
    	String _roleNameOne = "ADMIN";
    	roleEntity.setRoleId(_roleIdOne);
    	roleEntity.setAdminAccess(_adminAccessOne);
    	roleEntity.setModeratorAccess(_moderatorAccessOne);
    	roleEntity.setObserverAccess(_observerAccessOne);
    	roleEntity.setRoleName(_roleNameOne);
    	role.add(roleEntityOne);
    	//------------------------------------------------------------------------------------------------
    	logger.debug("createRoleTwo : STARTING");
    	RoleEntity roleEntityTwo = null;
    	long _roleIdTwo = 7;
    	boolean _adminAccessTwo = false;
    	boolean _moderatorAccessTwo = true;
    	boolean _observerAccessTwo = false;
    	String _roleNameTwo = "MODERATOR";
    	roleEntityTwo.setRoleId(_roleIdTwo);
    	roleEntityTwo.setAdminAccess(_adminAccessTwo);
    	roleEntityTwo.setModeratorAccess(_moderatorAccessTwo);
    	roleEntityTwo.setObserverAccess(_observerAccessTwo);
    	roleEntityTwo.setRoleName(_roleNameTwo);
    	role.add(roleEntityTwo);
    	//-------------------------------------------------------------------------------------------------
    	logger.debug("createRoleThree : STARTING");
    	RoleEntity roleEntityThree = null;
    	long _roleIdThree = 8;
    	boolean _adminAccessThree = false;
    	boolean _moderatorAccessThree = false;
    	boolean _observerAccessThree = true;
    	String _roleNameThree = "OBSERVER";
    	roleEntityThree.setRoleId(_roleIdThree);
    	roleEntityThree.setAdminAccess(_adminAccessThree);
    	roleEntityThree.setModeratorAccess(_moderatorAccessThree);
    	roleEntityThree.setObserverAccess(_observerAccessThree);
    	roleEntityThree.setRoleName(_roleNameThree);
    	role.add(roleEntityThree);
    	//--------------------------------------------------------------------------------------------------
    	logger.debug("createRole : FINISHED");
    	return role;
    }
    @Test
    public void testSaveRoleEntity()
    {
    	System.out.println("testSaveRoleEntity : STARTING");
    	RoleEntity roleEntityOne = new RoleEntity();
    	long _roleIdOne = 6;
    	boolean _adminAccessOne = true;
    	boolean _moderatorAccessOne = false;
    	boolean _observerAccessOne = false;
    	String _roleNameOne = "test";
    	//---------------------------------------------------------------------------------------------------
    	roleEntityOne.setRoleId(_roleIdOne);
    	roleEntityOne.setAdminAccess(_adminAccessOne);
    	roleEntityOne.setModeratorAccess(_moderatorAccessOne);
    	roleEntityOne.setObserverAccess(_observerAccessOne);
    	roleEntityOne.setRoleName(_roleNameOne);
    	roleEntityOne = roleDAO.saveRoleEntity(roleEntityOne);
    	System.out.println("roleEntityOne: " + roleEntityOne.toString());
    	//-----------------------------------------------------------------------------------------------------
    	RoleEntity roleEntityTwo = new RoleEntity();
    	long _roleIdTwo = 7;
    	boolean _adminAccessTwo = false;
    	boolean _moderatorAccessTwo = true;
    	boolean _observerAccessTwo = false;
    	String _roleNameTwo = "testing";
    	//-----------------------------------------------------------------------------------------------------
    	roleEntityTwo.setRoleId(_roleIdTwo);
    	roleEntityTwo.setAdminAccess(_adminAccessTwo);
    	roleEntityTwo.setModeratorAccess(_moderatorAccessTwo);
    	roleEntityTwo.setObserverAccess(_observerAccessTwo);
    	roleEntityTwo.setRoleName(_roleNameTwo);
    	roleEntityTwo = roleDAO.saveRoleEntity(roleEntityTwo);
    	System.out.println("roleEntityTwo: " + roleEntityTwo.toString());
    	//-----------------------------------------------------------------------------------------------------
    	RoleEntity roleEntityThree = new RoleEntity();
    	long _roleIdThree = 8;
    	boolean _adminAccessThree = false;
    	boolean _moderatorAccessThree = false;
    	boolean _observerAccessThree = true;
    	String _roleNameThree = "testing124";
    	//-----------------------------------------------------------------------------------------------------
    	roleEntityThree.setRoleId(_roleIdThree);
    	roleEntityThree.setAdminAccess(_adminAccessThree);
    	roleEntityThree.setModeratorAccess(_moderatorAccessThree);
    	roleEntityThree.setObserverAccess(_observerAccessThree);
    	roleEntityThree.setRoleName(_roleNameThree);
    	roleEntityThree = roleDAO.saveRoleEntity(roleEntityThree);
    	System.out.println("roleEntityThree: " + roleEntityThree.toString());
    	//-----------------------------------------------------------------------------------------------------
    	System.out.println("testSaveRoleEntity : FINISHED");
    }
    @Test
    public void testCreateRoleEntity()
    {
    	System.out.println("testCreateRoleEntity : STARTING");
    	RoleEntity roleEntity = new RoleEntity();
    	long _roleId = 10;
    	boolean _adminAccess = true;
    	boolean _moderatorAccess = false;
    	boolean _observerAccess = false;
    	String _roleName = "test";
    	//-----------------------------------------------------------------------------------------------------
    	roleEntity.setRoleId(_roleId);
    	roleEntity.setAdminAccess(_adminAccess);
    	roleEntity.setModeratorAccess(_moderatorAccess);
    	roleEntity.setObserverAccess(_observerAccess);
    	roleEntity.setRoleName(_roleName);
    	roleEntity = roleDAO.createRoleEntity(roleEntity);
    	System.out.println("testCreateRoleEntity: " + roleEntity.toString());
    	//-----------------------------------------------------------------------------------------------------
    	System.out.println("testCreateRoleEntity : FINISHED");
    }
    @Test
    public void testUpdateRoleEntity()
    {
    	System.out.println("testUpdateRoleEntity : STARTING");
    	RoleEntity roleEntity = new RoleEntity();
    	long _roleId = 7;
    	boolean _adminAccess = false;
    	boolean _moderatorAccess = true;
    	boolean _observerAccess = false;
    	String _roleName = "TESTINGTESTING";
    	//-----------------------------------------------------------------------------------------------------
    	roleEntity.setRoleId(_roleId);
    	roleEntity.setAdminAccess(_adminAccess);
    	roleEntity.setModeratorAccess(_moderatorAccess);
    	roleEntity.setObserverAccess(_observerAccess);
    	roleEntity.setRoleName(_roleName);
    	roleEntity = roleDAO.updateRoleEntity(roleEntity);
    	System.out.println("testUpdateRoleEntity: " + roleEntity.toString());
    	//------------------------------------------------------------------------------------------------------
    	System.out.println("testUpdateRoleEntity : FINISHED");
    }
    @Test
    public void testDeleteRoleEntity()
    {
    	System.out.println("testDeleteRoleEntity : STARTING");
    	long _roleId = 8;
    	RoleEntity roleEntityOne = roleDAO.getRoleEntity(_roleId);
    	assertNotNull(roleEntityOne);
    	//------------------------------------------------------------------------------------------------------
    	System.out.println("testDeleteRoleEntityOne : START");
    	roleDAO.deleteRoleEntity(_roleId);
    	System.out.println("testDeleteRoleEntityOne : DELETED");
    	//------------------------------------------------------------------------------------------------------
    	long _roleIdTwo = 7;
    	RoleEntity roleEntityTwo = roleDAO.getRoleEntity(_roleIdTwo);
    	assertNotNull(roleEntityTwo);
    	//------------------------------------------------------------------------------------------------------
    	System.out.println("testDeleteRoleEntityTwo : START");
    	roleDAO.deleteRoleEntity(roleEntityTwo);
    	System.out.println("testDeleteRoleEntityTwo : DELETED");
    	//------------------------------------------------------------------------------------------------------
    	System.out.println("testDeleteRoleEntity : FINISHED");
    }
    @Test
    public void testGetAllRoleEntities()
    {
    	System.out.println("testGetAllRoleEntities : STARTING");
    	List<RoleEntity> role = roleDAO.getAllRoleEntities();
    	if(role != null)
    	{
    		System.out.println("testGetAllRoleEntities size: " + role.size());
    	}
    	assertNotNull(role);
    	System.out.println("testGetAllRoleEntities : FINISHED");
    }
    @Test
    public void testGetAllRoleEntitiesByRoleId()
    {
    	System.out.println("testGetAllRoleEntitiesByRoleId : STARTING");
    	long _roleId = 6;
    	List<RoleEntity> role = roleDAO.getAllRoleEntitiesByRoleId(_roleId);
    	if(role != null)
    	{
    		System.out.println("testGetAllRoleEntitiesByRoleId size: " + role.size());
    	}
    	assertNotNull(role);
    	System.out.println("testGetAllRoleEntitiesByRoleId : FINISHED");
    }
    @Test
    public void testGetAllRoleEntitiesByRoleName()
    {
    	System.out.println("testGetAllRoleEntitiesByRoleName : STARTING");
    	String _roleName = "ADMIN";
    	List<RoleEntity> role = roleDAO.getAllRoleEntitiesByRoleName(_roleName);
    	if(role != null)
    	{
    		System.out.println("testGetAllRoleEntitiesByRoleName: " + role.toString());
    	}
    	assertNotNull(role);
    	System.out.println("testGetAllRoleEntitiesByRoleName : FINISHED");
    }
}
