package com.ticketingsystem.backend.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.UserEntity;

public class UserImplTest extends BaseServiceImplTests {
	
	private static final Log logger = LogFactory.getLog(UserImplTest.class);
	
	@Autowired
	private UserService service;
	
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
	
	private UserEntity createUserEntity()
	{
		UserEntity userEntity = new UserEntity();
		long _userId = 5;
		String _userName = "TEST";
		String _name = "TEST";
		String _password = "test";
		String _email = "test@test.com";
		String _title ="TEST";
		String _phoneNumber = "test";
		userEntity.setUserId(_userId);
		userEntity.setUserName(_userName);
		userEntity.setPassword(_password);
		userEntity.setName(_name);
		userEntity.setEmailAddress(_email);
		userEntity.setTitle(_title);
		userEntity.setPhoneNumber(_phoneNumber);
		return userEntity;
	}
	@Test
	public void testFetchGetAllUsers()
	{
		System.out.println("testFetchGetAllUsers : STARTING");
		List<UserEntity> users = service.getAllUsers();
		if(users != null)
		{
			System.out.println("testFetchGetAllUsers: " + users.toString());
		}
		assertNotNull(users);
		System.out.println("testFetchGetAllUsers : FINISHED");
	}
	@Test
	public void testFetchGetUserByUserId()
	{
		System.out.println("testFetchGetUserByUserId : STARTING");
		long _userId = 1;
		assertNotNull(_userId);
		service.getUserByUserId(_userId);
		System.out.println("testFetchGetUserByUserId: " + _userId);
		System.out.println("testFetchGetUserByUserId : FINISHED");
	}
	@Test
	public void testUserEntityAdd()
	{
		System.out.println("testUserEntityAdd : STARTING");
		UserEntity user = new UserEntity();
		long _userId = 5;
		String _userName = "test";
		String _name = "test";
		String _password = "test";
		String _email = "test";
		String _title = "test";
		String _phoneNumber = "test";
		user.setUserId(_userId);
		user.setUserName(_userName);
		user.setPassword(_password);
		user.setName(_name);
		user.setEmailAddress(_email);
		user.setTitle(_title);
		user.setPhoneNumber(_phoneNumber);
		assertNotNull(user);
		service.add(user);
		System.out.println("testUserEntityAdd: " + service.toString());
		System.out.println("testUserEntityAdd : FINISHED");
	}
	@Test
	public void testUserEntityUpdate()
	{
		System.out.println("testUserEntityUpdate : STARTING");
		UserEntity user = new UserEntity();
		long _userId = 1;
		String _userName = "test";
		String _name = "test";
		String _password = "test";
		String _email = "test";
		String _title = "test";
		String _phoneNumber = "test";
		user.setUserId(_userId);
		user.setName(_name);
		user.setPassword(_password);
		user.setUserName(_userName);
		user.setEmailAddress(_email);
		user.setTitle(_title);
		user.setPhoneNumber(_phoneNumber);
		assertNotNull(user);
		service.update(user);
		System.out.println("testUserEntityUpdate: " + service.toString());
		System.out.println("testUserEntityUpdate : FINISHED");
	}
	@Test
	public void testUserEntityRemove()
	{
		System.out.println("testUserEntityRemove : STARTING");
		UserEntity user = new UserEntity();
		long _userId = 1;
		user.setUserId(_userId);
		assertNotNull(user);
		//-----------------------------------------------------------------
		System.out.println("testUserEntityRemoveOne : START");
		service.remove(user);
		System.out.println("testUserEntityRemoveOne : DELETED");
		//-----------------------------------------------------------------
		System.out.println("testUserEntityRemoveTwo : START");
		long _userIdTwo = 2;
		assertNotNull(_userIdTwo);
		service.remove(_userIdTwo);
		System.out.println("testUserEntityRemoveTwo : DELETED");
		//-----------------------------------------------------------------
		System.out.println("testUserEntityRemoveTwo : FINISHED");
		
	}
}
