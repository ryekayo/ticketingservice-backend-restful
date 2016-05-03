package com.ticketingsystem.dao;

import java.util.HashSet;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.RoleEntity;
import com.ticketingsystem.entity.UserEntity;
import com.ticketingsystem.entity.UserRolesEntity;

public class UserRolesDAOTest extends BaseDAOTests {
	
	final Logger logger = LoggerFactory.getLogger(UserRolesDAOTest.class);
	
	@Autowired
	private UserRolesDAO userRolesDAO;
	
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
    private HashSet<UserRolesEntity> createUserRolesEntity(UserRolesEntity userRolesEntity)
    {
    	HashSet<UserRolesEntity> role = new HashSet<UserRolesEntity>();
    	logger.debug("createUserRolesEntityOne : STARTING");
    	UserRolesEntity userRolesEntityOne = null;
    	RoleEntity roleEntityOne = new RoleEntity();
    	UserEntity userEntityOne = new UserEntity();
    	long _idOne = 8;
    	long _roleIdOne = 6;
    	long _userIdOne = 1;
    	roleEntityOne.setRoleId(_roleIdOne);
    	userEntityOne.setUserId(_userIdOne);
    	//----------------------------------------------------------------------------------------------
    	userRolesEntityOne.setId(_idOne);
    	userRolesEntityOne.setRoleId(roleEntityOne);
    	//userRolesEntityOne.setUserId(userEntityOne);
    	role.add(userRolesEntityOne);
    	//-----------------------------------------------------------------------------------------------
    	logger.debug("createUserRolesEntityTwo : STARTING");
    	UserRolesEntity userRolesEntityTwo = null;
    	RoleEntity roleEntityTwo = new RoleEntity();
    	UserEntity userEntityTwo = new UserEntity();
    	long _idTwo = 14;
    	long _roleIdTwo = 7;
    	long _userIdTwo = 1;
    	roleEntityTwo.setRoleId(_roleIdTwo);
    	userEntityTwo.setUserId(_userIdTwo);
    	//-----------------------------------------------------------------------------------------------
    	userRolesEntityTwo.setId(_idTwo);
    	userRolesEntityTwo.setRoleId(roleEntityTwo);
    	//userRolesEntityTwo.setUserId(userEntityTwo);
    	role.add(userRolesEntityTwo);
    	//-----------------------------------------------------------------------------------------------
    	logger.debug("createUserRoleEntityThree : STARTING");
    	UserRolesEntity userRolesEntityThree = null;
    	RoleEntity roleEntityThree = new RoleEntity();
    	UserEntity userEntityThree = new UserEntity();
    	long _idThree = 11;
    	long _roleIdThree = 8;
    	long _userIdThree = 3;
    	roleEntityThree.setRoleId(_roleIdThree);
    	userEntityThree.setUserId(_userIdThree);
    	//------------------------------------------------------------------------------------------------
    	userRolesEntityThree.setId(_idThree);
    	userRolesEntityThree.setRoleId(roleEntityThree);
    	//userRolesEntityThree.setUserId(userEntityThree);
    	role.add(userRolesEntityThree);
    	//-------------------------------------------------------------------------------------------------
    	logger.debug("createUserRoleEntity : FINISHED");
    	return role;   	
    }
    @Test
    public void testSaveUserRolesEntity()
    {
    	System.out.println("testSaveUserRolesEntity : STARTING");
    	UserRolesEntity userRolesOne = new UserRolesEntity();
    	RoleEntity roleEntityOne = new RoleEntity();
    	UserEntity userEntityOne = new UserEntity();
    	long _idOne = 8;
    	long _roleId = 6;
    	long _userId = 1;
    	roleEntityOne.setRoleId(_roleId);
    	userEntityOne.setUserId(_userId);
    	//--------------------------------------------------------------------------------------------------
    	System.out.println("testSaveUserRoleEntityOne : STARTING");
    	userRolesOne.setId(_idOne);
    	userRolesOne.setRoleId(roleEntityOne);
    	//userRolesOne.setUserId(userEntityOne);
    	userRolesOne = userRolesDAO.saveUserRolesEntity(userRolesOne);
    	System.out.println("userRolesOne: " + userRolesOne.toString());
    	//--------------------------------------------------------------------------------------------------
    	System.out.println("testSaveUserRoleEntityTwo : STARTING");
    	UserRolesEntity userRolesTwo = new UserRolesEntity();
    	RoleEntity roleEntityTwo = new RoleEntity();
    	UserEntity userEntityTwo = new UserEntity();
    	long _idTwo = 10;
    	long _roleIdTwo = 7;
    	long _userIdTwo = 2;
    	roleEntityTwo.setRoleId(_roleIdTwo);
    	userEntityTwo.setUserId(_userIdTwo);
    	//----------------------------------------------------------------------------------------------------
    	userRolesTwo.setId(_idTwo);
    	userRolesTwo.setRoleId(roleEntityTwo);
    	//userRolesTwo.setUserId(userEntityTwo);
    	userRolesTwo = userRolesDAO.saveUserRolesEntity(userRolesTwo);
    	System.out.println("userRolesTwo: " + userRolesTwo.toString());
    	//----------------------------------------------------------------------------------------------------
    	System.out.println("testSaveUserRoleEntityThree : STARTING");
    	UserRolesEntity userRolesThree = new UserRolesEntity();
    	RoleEntity roleEntityThree = new RoleEntity();
    	UserEntity userEntityThree = new UserEntity();
    	long _idThree = 11;
    	long _roleIdThree = 8;
    	long _userIdThree = 3;
    	roleEntityThree.setRoleId(_roleIdThree);
    	userEntityThree.setUserId(_userIdThree);
    	//-----------------------------------------------------------------------------------------------------
    	userRolesThree.setId(_idThree);
    	userRolesThree.setRoleId(roleEntityThree);
    	//userRolesThree.setUserId(userEntityThree);
    	userRolesThree = userRolesDAO.saveUserRolesEntity(userRolesThree);
    	System.out.println("userRolesThree: " + userRolesThree.toString());
    	//-----------------------------------------------------------------------------------------------------
    	System.out.println("testSaveUserRoleEntity : FINISHED");
    }
    @Test
    public void testCreateUserRolesEntity()
    {
    	System.out.println("testCreateUserRolesEntity : STARTING");
    	UserRolesEntity userRoles = new UserRolesEntity();
    	RoleEntity roleEntity = new RoleEntity();
    	UserEntity userEntity = new UserEntity();
    	long _id = 20;
    	long _roleId = 6;
    	long _userId = 2;
    	roleEntity.setRoleId(_roleId);
    	userEntity.setUserId(_userId);
    	//-----------------------------------------------------------------------------------------------------
    	userRoles.setId(_id);
    	userRoles.setRoleId(roleEntity);
    	userRoles.setUserId(userEntity);
    	userRoles = userRolesDAO.createUserRolesEntity(userRoles);
    	System.out.println("testCreateUserRolesEntity: " + userRoles.toString());
        //-------------------------------------------------------------------------------------------------------
    	System.out.println("testCreateUserRolesEntity : FINISHED");
    }
    @Test
    public void testUpdateUserRolesEntity()
    {
    	System.out.println("testUpdateUserRolesEntity : STARTING");
    	UserRolesEntity userRoles = new UserRolesEntity();
    	RoleEntity roleEntity = new RoleEntity();
    	UserEntity userEntity = new UserEntity();
    	long _id = 11;
    	long _roleId = 6;
    	long _userId = 2;
    	roleEntity.setRoleId(_roleId);
    	userEntity.setUserId(_userId);
    	//-------------------------------------------------------------------------------------------------------
    	userRoles.setId(_id);
    	userRoles.setRoleId(roleEntity);
    	userRoles.setUserId(userEntity);
    	userRoles = userRolesDAO.updateUserRolesEntity(userRoles);
    	System.out.println("testUpdateUserRolesEntity: " + userRoles.toString());
    	//--------------------------------------------------------------------------------------------------------
    	System.out.println("testUpdateUserRolesEntity : FINISHED"); 	
    }
    @Test
    public void testDeleteUserRolesEntity()
    {
    	System.out.println("testDeleteUserRolesEntity : STARTING");
    	long _id = 11;
    	UserRolesEntity userRolesOne = userRolesDAO.getUserRolesEntity(_id);
    	assertNotNull(userRolesOne);
    	//---------------------------------------------------------------------------------------------------------
    	System.out.println("userRolesOne : START");
    	userRolesDAO.deleteUserRolesEntity(_id);
    	System.out.println("userRolesOne : DELETED");
    	//------------------------------------------------------------------------------------------------------------
    	long _idTwo = 14;
    	UserRolesEntity userRolesTwo = userRolesDAO.getUserRolesEntity(_idTwo);
    	assertNotNull(userRolesTwo);
    	//------------------------------------------------------------------------------------------------------------
    	System.out.println("userRolesTwo : START");
    	userRolesDAO.deleteUserRolesEntity(userRolesTwo);
    	System.out.println("userRolesTwo : DELETED");
    	//------------------------------------------------------------------------------------------------------------
    	System.out.println("testDeleteUserRolesEntity : FINISHED");
    }
    @Test
    public void testFetchGetAllUserRolesEntities()
    {
    	System.out.println("testFetchGetAllUserRolesEntities : STARTING");
    	List<UserRolesEntity> roles = userRolesDAO.getAllUserRolesEntities();
    	if(roles != null)
    	{
    		System.out.println("testFetchGetAllUserRolesEntities size: " + roles.size());
    	}
    	assertNotNull(roles);
    	System.out.println("testFetchGetAllUserRolesEntities : FINISHED");
    }
    @Test
    public void testFetchGetUserRolesEntityByUserId()
    {
    	System.out.println("testFetchGetUserRolesEntityByUserId : STARTING");
    	long _userId = 1;
    	UserEntity userEntity = new UserEntity();
    	userEntity.setUserId(_userId);
    	List<UserRolesEntity> roles = userRolesDAO.getUserRolesEntityByUserId(userEntity);
    	if(roles != null)
    	{
    		System.out.println("testFetchGetUserRolesEntityByUserId size: " + roles.size());
    	}
    	assertNotNull(roles);
    	System.out.println("testFetchGetUserRolesEntityByUserId : FINISHED");
    }
    @Test
    public void testFetchGetUserRolesEntityByRoleId()
    {
    	System.out.println("testFetchGetUserRolesEntityByRoleId : STARTING");
    	long _roleId = 8;
    	RoleEntity roleEntity = new RoleEntity();
    	roleEntity.setRoleId(_roleId);
    	List<UserRolesEntity> roles = userRolesDAO.getUserRolesEntityByRoleId(roleEntity);
    	if(roles != null)
    	{
    		System.out.println("testFetchGetUserRolesEntityByRoleId size: " + roles.size());
    	}
    	assertNotNull(roles);
    	System.out.println("testFetchGetUserRolesEntityByRoleId : FINISHED");
    }
}
