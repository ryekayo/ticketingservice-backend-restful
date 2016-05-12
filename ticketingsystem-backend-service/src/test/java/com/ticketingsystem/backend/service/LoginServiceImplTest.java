package com.ticketingsystem.backend.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.UserEntity;
import com.ticketingsystem.backend.service.LoginService;

public class LoginServiceImplTest extends BaseServiceImplTests {
	
	private static final Log logger = LogFactory.getLog(LoginServiceImplTest.class);
	
	@Autowired
	private LoginService service;
	
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
	public void testLogin()
	{
		System.out.println("testLogin : STARTING");
		String _userName = "RKAHIL";
		String _password = "TEST";
		service.login(_userName, _password);
		System.out.println("Login : SUCCESSFUL");
		System.out.println("testLogin : FINISHED");
	}
	@Test
	public void testLoginByUsername()
	{
		System.out.println("testLoginByUsername : STARTING");
		String _userName = "RKAHIL";
		service.loginByUserName(_userName);
		System.out.println("Login : SUCCESSFUL");
		System.out.println("testLoginByUsername : FINISHED");
	}

}
