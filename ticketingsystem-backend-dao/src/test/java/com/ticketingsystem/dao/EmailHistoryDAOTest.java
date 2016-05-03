package com.ticketingsystem.dao;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.EmailHistoryEntity;
import com.ticketingsystem.entity.UserEntity;
import com.ticketingsystem.entity.UserTicketEntity;

public class EmailHistoryDAOTest extends BaseDAOTests {

	final Logger logger = LoggerFactory.getLogger(EmailHistoryDAOTest.class);
	
	@Autowired
	private EmailHistoryDAO emailHistoryDAO;
	
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
    private HashSet<EmailHistoryEntity> createEmailHistory(EmailHistoryEntity emailHistoryEntity)
    {
    	HashSet<EmailHistoryEntity> history = new HashSet<EmailHistoryEntity>();
    	logger.debug("createEmailHistoryOne : STARTING");
    	UserEntity userOne = new UserEntity();
    	UserTicketEntity userTicketOne = new UserTicketEntity();
    	EmailHistoryEntity emailHistoryEntityOne = null;
    	long _userId = 1;
    	long _ticketId = 1;
    	long _emailHistoryId = 2;
    	String _emailSent = "THISISATEST";
    	String _fromEmail = "rkahil@test.com";
    	String _toEmail = "mjordan@bulls.com";
    	userTicketOne.setTicketId(_ticketId);
    	userOne.setUserId(_userId);
    	//---------------------------------------------------------------------------------------------
    	emailHistoryEntityOne.setEmailHistoryId(_emailHistoryId);
    	emailHistoryEntityOne.setTicketNumber(userTicketOne);
    	//emailHistoryEntityOne.setUserId(userOne);
    	emailHistoryEntityOne.setEmailSent(_emailSent);
    	emailHistoryEntityOne.setFromEmail(_fromEmail);
    	emailHistoryEntityOne.setToEmail(_toEmail);
    	emailHistoryEntityOne.setEmailTimestamp(new Date());
    	history.add(emailHistoryEntityOne);
    	//---------------------------------------------------------------------------------------------
    	logger.debug("createEmailHistoryTwo : STARTING");
    	UserEntity userTwo = new UserEntity();
    	UserTicketEntity userTicketTwo = new UserTicketEntity();
    	EmailHistoryEntity emailHistoryEntityTwo = null;
    	long _userIdTwo = 2;
    	long _ticketIdTwo = 2;
    	long _emailHistoryIdTwo = 3;
    	String _emailSentTwo = "THISISATEST2";
    	String _fromEmailTwo = "drivers@test.com";
    	String _toEmailTwo = "lbird@celtics.com";
    	userTicketTwo.setTicketId(_ticketIdTwo);
    	userTwo.setUserId(_userIdTwo);
    	//---------------------------------------------------------------------------------------------
    	emailHistoryEntityTwo.setEmailHistoryId(_emailHistoryIdTwo);
    	//emailHistoryEntityTwo.setUserId(userTwo);
    	emailHistoryEntityTwo.setTicketNumber(userTicketTwo);
    	emailHistoryEntityTwo.setEmailSent(_emailSentTwo);
    	emailHistoryEntityTwo.setFromEmail(_fromEmailTwo);
    	emailHistoryEntityTwo.setToEmail(_toEmailTwo);
    	emailHistoryEntityTwo.setEmailTimestamp(new Date());
    	history.add(emailHistoryEntityTwo);
    	//----------------------------------------------------------------------------------------------
    	logger.debug("createEmailHistoryThree : STARTING");
    	UserEntity userThree = new UserEntity();
    	UserTicketEntity userTicketThree = new UserTicketEntity();
    	EmailHistoryEntity emailHistoryEntityThree = null;
    	long _userIdThree = 1;
    	long _ticketIdThree = 1;
    	long _emailHistoryIdThree = 5;
    	String _emailSentThree = "I AM TESTING THIS";
    	String _fromEmailThree = "mjordan@bulls.com";
    	String _toEmailThree = "rkahil@test.com";
    	userTicketThree.setTicketId(_ticketIdThree);
    	userThree.setUserId(_userIdThree);
    	//-----------------------------------------------------------------------------------------------
    	emailHistoryEntityThree.setEmailHistoryId(_emailHistoryIdThree);
    	//emailHistoryEntityThree.setUserId(userThree);
    	emailHistoryEntityThree.setTicketNumber(userTicketThree);
    	emailHistoryEntityThree.setEmailSent(_emailSentThree);
    	emailHistoryEntityThree.setFromEmail(_fromEmailThree);
    	emailHistoryEntityThree.setToEmail(_toEmailThree);
    	emailHistoryEntityThree.setEmailTimestamp(new Date());
    	history.add(emailHistoryEntityThree);
    	//------------------------------------------------------------------------------------------------
    	logger.debug("createEmailHistory : FINISHED");
    	return history;
    }
    @Test
    public void testEmailHistoryEntitySave()
    {
    	System.out.println("testEmailHistoryEntitySave : STARTING");
    	EmailHistoryEntity emailHistoryOne = new EmailHistoryEntity();
    	UserEntity userOne = new UserEntity();
    	UserTicketEntity userTicketOne = new UserTicketEntity();
    	long _userId = 1;
    	long _ticketId = 1;
    	long _emailHistoryId = 2;
    	String _emailSent = "THISISATEST";
    	String _fromEmail = "rkahil@test.com";
    	String _toEmail = "mjordan@bulls.com";
    	userTicketOne.setTicketId(_ticketId);
    	userOne.setUserId(_userId);
    	System.out.println("emailHistoryOne : SAVE : STARTING");
    	//-----------------------------------------------------------------------------------------------
    	emailHistoryOne.setEmailHistoryId(_emailHistoryId);
    	//emailHistoryOne.setUserId(userOne);
    	emailHistoryOne.setTicketNumber(userTicketOne);
    	emailHistoryOne.setEmailSent(_emailSent);
    	emailHistoryOne.setFromEmail(_fromEmail);
    	emailHistoryOne.setToEmail(_toEmail);
    	emailHistoryOne.setEmailTimestamp(new Date());
    	assertNotNull(emailHistoryOne);
    	emailHistoryOne = emailHistoryDAO.saveEmailHistoryEntity(emailHistoryOne);
    	System.out.println("emailHistoryOne: " + emailHistoryOne.toString());  	
    	//------------------------------------------------------------------------------------------------
    	System.out.println("emailHistoryTwo : SAVE : STARTING");
    	EmailHistoryEntity emailHistoryTwo = new EmailHistoryEntity();
    	UserEntity userTwo = new UserEntity();
    	UserTicketEntity userTicketTwo = new UserTicketEntity();
    	long _userIdTwo = 2;
    	long _ticketIdTwo = 2;
    	long _emailHistoryIdTwo = 3;
    	String _emailSentTwo = "THISISATEST2";
    	String _fromEmailTwo = "drivers@test.com";
    	String _toEmailTwo = "lbird@celtics.com";
    	userTicketTwo.setTicketId(_ticketIdTwo);
    	userTwo.setUserId(_userIdTwo);
    	//--------------------------------------------------------------------------------------------------
    	emailHistoryTwo.setEmailHistoryId(_emailHistoryIdTwo);
    	//emailHistoryTwo.setUserId(userTwo);
    	emailHistoryTwo.setTicketNumber(userTicketTwo);
    	emailHistoryTwo.setEmailSent(_emailSentTwo);
    	emailHistoryTwo.setFromEmail(_fromEmailTwo);
    	emailHistoryTwo.setToEmail(_toEmailTwo);
    	emailHistoryTwo.setEmailTimestamp(new Date());
    	assertNotNull(emailHistoryTwo);
    	emailHistoryTwo = emailHistoryDAO.saveEmailHistoryEntity(emailHistoryTwo);
    	System.out.println("emailHistoryTwo: " + emailHistoryTwo.toString());
    	//----------------------------------------------------------------------------------------------------
    	System.out.println("emailHistoryThree : SAVE : STARTING");
    	EmailHistoryEntity emailHistoryThree = new EmailHistoryEntity();
    	UserEntity userThree = new UserEntity();
    	UserTicketEntity userTicketThree = new UserTicketEntity();
    	long _userIdThree = 3;
    	long _ticketIdThree = 8;
    	long _emailHistoryIdThree = 6;
    	String _emailSentThree = "TESTING4";
    	String _fromEmailThree = "rkahil@test.com";
    	String _toEmailThree = "tholmes@test.com";
    	userTicketThree.setTicketId(_ticketIdThree);
    	userThree.setUserId(_userIdThree);
    	//----------------------------------------------------------------------------------------------------
    	emailHistoryThree.setEmailHistoryId(_emailHistoryIdThree);
    	//emailHistoryThree.setUserId(userThree);
    	emailHistoryThree.setTicketNumber(userTicketThree);
    	emailHistoryThree.setEmailSent(_emailSentThree);
    	emailHistoryThree.setFromEmail(_fromEmailThree);
    	emailHistoryThree.setToEmail(_toEmailThree);
    	emailHistoryThree.setEmailTimestamp(new Date());
    	assertNotNull(emailHistoryThree);
    	emailHistoryThree = emailHistoryDAO.saveEmailHistoryEntity(emailHistoryThree);
    	System.out.println("emailHistoryThree" + emailHistoryThree.toString());
    	//------------------------------------------------------------------------------------------------------
    	System.out.println("testEmailHistoryEntitySave : FINISHED");
    }
    @Test
    public void testCreateEmailHistoryEntity()
    {
    	System.out.println("testCreateEmailHistoryEntity : STARTING");
    	EmailHistoryEntity emailHistory = new EmailHistoryEntity();
    	UserTicketEntity userTicket = new UserTicketEntity();
    	UserEntity user = new UserEntity();
    	long _ticketId = 2;
    	long _userId = 2;
    	long _emailHistoryId = 9;
    	String _emailSent = "YET ANOTHER TEST";
    	String _fromEmail = "testing@test.com";
    	String _toEmail = "test@testing.com";
    	userTicket.setTicketId(_ticketId);
    	user.setUserId(_userId);
    	//-------------------------------------------------------------------------------------------------------
    	emailHistory.setEmailHistoryId(_emailHistoryId);
    	emailHistory.setUserId(user);
    	emailHistory.setTicketNumber(userTicket);
    	emailHistory.setEmailSent(_emailSent);
    	emailHistory.setFromEmail(_fromEmail);
    	emailHistory.setToEmail(_toEmail);
    	emailHistory.setEmailTimestamp(new Date());
    	assertNotNull(emailHistory);
    	emailHistory = emailHistoryDAO.createEmailHistoryEntity(emailHistory);
    	System.out.println("emailHistory: " + emailHistory.toString());
    	//--------------------------------------------------------------------------------------------------------
    	System.out.println("testCreateEmailHistoryEntity : FINISHED");
    }
    @Test
    public void testUpdateEmailHistoryEntity()
    {
    	System.out.println("testUpdateEmailHistoryEntity : STARTING");
    	EmailHistoryEntity emailHistory = new EmailHistoryEntity();
    	UserTicketEntity userTicket = new UserTicketEntity();
    	UserEntity user = new UserEntity();
    	long _emailHistoryId = 10;
    	long _ticketId = 6;
    	long _userId = 1;
    	String _emailSent = "TESTING UPDATE";
    	String _fromEMail = "test123";
    	String _toEmail = "321test";
    	userTicket.setTicketId(_ticketId);
    	user.setUserId(_userId);
    	//--------------------------------------------------------------------------------------------------------
    	emailHistory.setEmailHistoryId(_emailHistoryId);
    	emailHistory.setUserId(user);
    	emailHistory.setTicketNumber(userTicket);
    	emailHistory.setEmailSent(_emailSent);
    	emailHistory.setFromEmail(_fromEMail);
    	emailHistory.setToEmail(_toEmail);
    	emailHistory.setEmailTimestamp(new Date());
    	assertNotNull(emailHistory);
    	emailHistory = emailHistoryDAO.updateEmailHistoryEntity(emailHistory);
    	System.out.println("emailHistory: " + emailHistory.toString());
    	//---------------------------------------------------------------------------------------------------------
    	System.out.println("testUpdateEmailHistoryEntity : FINISHED");   	
    }
    @Test
    public void testDeleteEmailHistoryEntity()
    {
    	System.out.println("testDeleteEmailHistoryEntity : STARTING");
    	long _historyId = 2;
    	EmailHistoryEntity emailHistory = emailHistoryDAO.getAllEmailHistoryEntities(_historyId);
    	assertNotNull(emailHistory);
    	//---------------------------------------------------------------------------------------------------------
    	System.out.println("testDeleteEmailHistoryEntityOne : START");
    	emailHistoryDAO.deleteEmailHistoryEntity(_historyId);
    	System.out.println("testDeleteEmailHistoryEntityOne : DELETED");
    	//----------------------------------------------------------------------------------------------------------
    	long _historyIdTwo = 6;
    	EmailHistoryEntity emailHistoryTwo  = emailHistoryDAO.getAllEmailHistoryEntities(_historyIdTwo);
    	assertNotNull(emailHistoryTwo);
    	//-----------------------------------------------------------------------------------------------------------
    	System.out.println("testDeleteEmailHistoryEntityTwo : START");
    	emailHistoryDAO.deleteEmailHistoryEntity(emailHistoryTwo);
    	System.out.println("testDeleteEmailHistoryEntityTwo : DELETED");
    	//------------------------------------------------------------------------------------------------------------
    	System.out.println("testDeleteEmailHistoryEntity : FINISHED");
    }
    @Test
    public void testFetchGetAllEmailHistoryEntities()
    {
    	System.out.println("testFetchGetAllEmailHistoryEntities : STARTING");
    	List<EmailHistoryEntity> history = emailHistoryDAO.getAllEmailHistoryEntities();
    	if(history != null)
    	{
    		System.out.println("testFetchGetAllEmailHistoryEntities size: " + history.size());
    	}
    	assertNotNull(history);
    	System.out.println("testFetchGetAllEmailHistoryEntities : FINISHED");
    }
    @Test
    public void testFetchGetAllEmailHistoryEntitiesByUserTicketId()
    {
    	System.out.println("testFetchGetAllEmailHistoryEntitiesByUserTicketId : STARTING");
    	long _ticketId = 1;
    	UserTicketEntity userTicket = new UserTicketEntity();
    	userTicket.setTicketId(_ticketId);
    	List<EmailHistoryEntity> history = emailHistoryDAO.getAllEmailHistoryEntitiesByTicketId(userTicket);
    	if(history != null)
    	{
    		System.out.println("testFetchGetAllEmailHistoryEntitiesByUserTicketId size: " + history.size());
    	}
    	assertNotNull(history);
    	emailHistoryDAO.getAllEmailHistoryEntitiesByTicketId(userTicket);
    	System.out.println("testFetchGetAllEmailHistoryEntitiesByUserTicketId : FINISHED");
    }
    @Test
    public void testFetchGetAllEmailHistoryEntitiesByUserId()
    {
    	System.out.println("testFetchGetAllEmailHistoryEntitiesByUserId : STARTING");
    	long _userId = 1;
    	UserEntity user = new UserEntity();
    	user.setUserId(_userId);
    	List<EmailHistoryEntity> history = emailHistoryDAO.getAllEmailHistoryEntitiesByUserId(user);
    	if(history != null)
    	{
    		System.out.println("testFetchGetAllEmailHistoryEntitiesByUserId size: " + history.size());
    	}
    	assertNotNull(history);
    	emailHistoryDAO.getAllEmailHistoryEntitiesByUserId(user);
    	System.out.println("testFetchGetAllEmailHistoryEntitiesByUserId : FINISHED");
    }
    @Test
    public void testFetchGetAllEmailHistoryEntitiesByEmailHistoryId()
    {
    	System.out.println("testFetchGetAllEmailHistoryEntitiesByEmailHistoryId : STARTING");
    	long _emailHistoryId = 10;
    	List<EmailHistoryEntity> history = emailHistoryDAO.getAllEmailHistoryEntitiesByEmailHistoryId(_emailHistoryId);
    	if(history != null)
    	{
    		System.out.println("testFetchGetAllEmailHistoryEntitiesByEmailHistoryId: " + history.toString());
    	}
    	assertNotNull(history);
    	emailHistoryDAO.getAllEmailHistoryEntitiesByEmailHistoryId(_emailHistoryId);
    	System.out.println("testFetchGetAllEmailHistoryEntitiesByEmailHistoryId : FINISHED");
    }
    @Test
    public void testFetchGetAllEmailHistoryEntitiesByEmailSent()
    {
    	System.out.println("testFetchGetAllEmailHistoryEntitiesByEmailSent : STARTING");
    	String _fromEmail = "rkahil@test.com";
    	List<EmailHistoryEntity> history = emailHistoryDAO.getAllEmailHistoryEntitiesByFromEmail(_fromEmail);
    	if(history != null)
    	{
    		System.out.println("testFetchGetAllEmailHistoryEntitiesByEmailSent: " + history.toString());
    	}
    	assertNotNull(history);
    	emailHistoryDAO.getAllEmailHistoryEntitiesByFromEmail(_fromEmail);
    	System.out.println("testFetchGetAllEmailHistoryEntitiesByEmailSent : FINISHED");
    }
}
