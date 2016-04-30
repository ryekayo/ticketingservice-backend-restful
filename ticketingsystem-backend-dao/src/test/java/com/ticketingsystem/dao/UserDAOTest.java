package com.ticketingsystem.dao;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.UserEntity;

public class UserDAOTest extends BaseDAOTests {

	final Logger logger = LoggerFactory.getLogger(UserDAOTest.class);
	
	@Autowired
	private UserDAO userDao;
	
	private long _userId = 1;
	private String _userName = "rkahil";
	private String _name = "RYAN KAHIL";
	private String _userEmail = "rkahil@test.com";
	private String _title = "VP";
	private String _phoneNumber = "555-555-5555";
	
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
    
    private HashSet<UserEntity> createUser(UserEntity userEntity)
    {
    	HashSet<UserEntity> user = new HashSet<UserEntity>();
    	logger.debug("createUserOne : STARTING");
    	UserEntity userEntityOne = null;
    	long _userId = 1;
    	String _userName = "rkahil";
    	String _name = "RYAN KAHIL";
    	String _userEmail = "rkahil@test.com";
    	String _title = "VP";
    	String _phoneNumber = "555-555-5555";
    	userEntityOne.setUserId(_userId);
    	userEntityOne.setUserName(_userName);
    	userEntityOne.setName(_name);
    	userEntityOne.setEmailAddress(_userEmail);
    	userEntityOne.setTitle(_title);
    	userEntityOne.setPhoneNumber(_phoneNumber);
    	user.add(userEntityOne);
    	//------------------------------------------------------------------------------------------------
    	logger.debug("createUserTwo : STARTING");
    	UserEntity userEntityTwo = null;
    	long _userIdTwo = 2;
    	String _userNameTwo = "tholmes";
    	String _nameTwo = "TOM HOLMES";
    	String _emailTwo = "tholmes@test.com";
    	String _titleTwo = "VP";
    	String _phoneNumberTwo = "666-666-6666";
    	userEntityTwo.setUserId(_userIdTwo);
    	userEntityTwo.setUserName(_userNameTwo);
    	userEntityTwo.setName(_nameTwo);
    	userEntityTwo.setEmailAddress(_emailTwo);
    	userEntityTwo.setTitle(_titleTwo);
    	userEntityTwo.setPhoneNumber(_phoneNumberTwo);
    	user.add(userEntityTwo);
    	//------------------------------------------------------------------------------------------------
    	logger.debug("createUserThree : STARTING");
    	UserEntity userEntityThree = null;
    	long _userIdThree = 3;
    	String _userNameThree = "drivers";
    	String _nameThree = "DOC RIVERS";
    	String _emailThree = "drivers@test.com";
    	String _titleThree = "TEST";
    	String _phoneNumberThree = "777-777-7777";
    	userEntityThree.setUserId(_userIdThree);
    	userEntityThree.setUserName(_userNameThree);
    	userEntityThree.setName(_nameThree);
    	userEntityThree.setEmailAddress(_emailThree);
    	userEntityThree.setTitle(_titleThree);
    	userEntityThree.setPhoneNumber(_phoneNumberThree);
    	user.add(userEntityThree);
    	//-----------------------------------------------------------------------------------------------
    	logger.debug("createUser : FINISHED");
    	return user;
    }
    
    @Test
    public void testUserEntitySave()
    {
    	System.out.println("testUserEntitySave : STARTING");
    	UserEntity userEntityOne = new UserEntity();
    	long _userIdOne = 5;
    	String _userNameOne = "testOne";
    	String _nameOne = "TEST ONE";
    	String _userEmailOne = "testOne@test.com";
    	String _titleOne = "VP";
    	String _phoneNumberOne = "999-999-9999";
    	//----------------------------------------------------------------------------------------------
    	userEntityOne.setUserId(_userIdOne);
    	userEntityOne.setUserName(_userNameOne);
    	userEntityOne.setName(_nameOne);
    	userEntityOne.setEmailAddress(_userEmailOne);
    	userEntityOne.setTitle(_titleOne);
    	userEntityOne.setPhoneNumber(_phoneNumberOne);
    	userEntityOne = userDao.saveUserEntity(userEntityOne);
    	System.out.println("userEntityOne : " + userEntityOne.toString());
    	//-----------------------------------------------------------------------------------------------
    	UserEntity userEntityTwo = new UserEntity();
    	long _userIdTwo = 6;
    	String _userNameTwo = "testTwo";
    	String _nameTwo = "TEST TWO";
    	String _userEmailTwo = "testTwo@test.com";
    	String _titleTwo = "TEST";
    	String _phoneNumberTwo = "19197238823";
    	//------------------------------------------------------------------------------------------------
    	userEntityTwo.setUserId(_userIdTwo);
    	userEntityTwo.setUserName(_userNameTwo);
    	userEntityTwo.setName(_nameTwo);
    	userEntityTwo.setEmailAddress(_userEmailTwo);
    	userEntityTwo.setTitle(_titleTwo);
    	userEntityTwo.setPhoneNumber(_phoneNumberTwo);
    	userEntityTwo = userDao.saveUserEntity(userEntityTwo);
    	System.out.println("userEntityTwo" + userEntityTwo.toString());
    	//--------------------------------------------------------------------------------------------------
    	UserEntity userEntityThree = new UserEntity();
    	long _userIdThree = 7;
    	String _userNameThree = "testThree";
    	String _nameThree = "TEST THREE";
    	String _userEmailThree = "testThree@test.com";
    	String _titleThree = "TEST";
    	String _phoneNumberThree = "37429497234";
    	//--------------------------------------------------------------------------------------------------
    	userEntityThree.setUserId(_userIdThree);
    	userEntityThree.setUserName(_userNameThree);
    	userEntityThree.setName(_nameThree);
    	userEntityThree.setEmailAddress(_userEmailThree);
    	userEntityThree.setTitle(_titleThree);
    	userEntityThree.setPhoneNumber(_phoneNumberThree);
    	userEntityThree = userDao.saveUserEntity(userEntityThree);
    	System.out.println("userEntityThree" + userEntityThree.toString());
    	//---------------------------------------------------------------------------------------------------
    	System.out.println("testUserEntitySave : FINISHED");
    }
    @Test
    public void testUserCreate()
    {
    	System.out.println("testUserCreate : STARTING");
    	UserEntity userEntity = new UserEntity();
    	long _userId = 10;
    	String _userName = "TESTING";
    	String _name = "TEST TEST";
    	String _email = "testingtest@test.com";
    	String _title = "tESt";
    	String _phoneNmber = "4204437023480243";
    	//--------------------------------------------------------------------------------------------------
    	userEntity.setUserId(_userId);
    	userEntity.setUserName(_userName);
    	userEntity.setName(_name);
    	userEntity.setEmailAddress(_email);
    	userEntity.setTitle(_title);
    	userEntity.setPhoneNumber(_phoneNmber);
    	userEntity = userDao.createUserEntity(userEntity);
    	assertNotNull(userEntity);
    	System.out.println("userEntity: " + userEntity.toString());
    	System.out.println("testUserCreate : FINISHED");
    }
    @Test
    public void testUserUpdate()
    {
    	System.out.println("testUserUpdate : STARTING");
    	UserEntity userEntity = new UserEntity();
    	long _userId = 1;
    	String _userName = "thisisatest";
    	String _name = "ThisIsATest";
    	String _email = "testingupdate@test.com";
    	String _title = "test";
    	String _phoneNumber = "3237032";
    	//---------------------------------------------------------------------------------------------------
    	userEntity.setUserId(_userId);
    	userEntity.setUserName(_userName);
    	userEntity.setName(_name);
    	userEntity.setEmailAddress(_email);
    	userEntity.setTitle(_title);
    	userEntity.setPhoneNumber(_phoneNumber);
    	userEntity = userDao.updateUserEntity(userEntity);
    	assertNotNull(userEntity);
    	System.out.println("userEntity: " + userEntity.toString());
    	System.out.println("testUserUpdate : FINISHED");
    }

}
