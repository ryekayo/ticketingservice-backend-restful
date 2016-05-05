package com.ticketingsystem.backend.service;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.EmailHistoryEntity;
import com.ticketingsystem.entity.UserTicketEntity;
import com.ticketingsystem.entity.UserEntity;

public class EmailHistoryImplTest extends BaseServiceImplTests {

	private static final Log logger = LogFactory.getLog(EmailHistoryImplTest.class);
	
	@Autowired
	private EmailHistoryService service;

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
	
	private EmailHistoryEntity createEmailHistoryEntity()
	{
		EmailHistoryEntity history = new EmailHistoryEntity();
		UserTicketEntity ticket = new UserTicketEntity();
		UserEntity user = new UserEntity();
		long _emailHistoryId = 2;
		long _ticketId = 1;
		long _userId = 1;
		String _emailSent = "THISISATEST";
		String _fromEmail = "rkahil@test.com";
		String _toEmail = "mjordan@bulls.com";
		ticket.setTicketId(_ticketId);
		user.setUserId(_userId);
		history.setEmailHistoryId(_emailHistoryId);
		history.setTicketNumber(ticket);
		history.setUserId(user);
		history.setEmailTimestamp(new Date());
		history.setEmailSent(_emailSent);
		history.setFromEmail(_fromEmail);
		history.setToEmail(_toEmail);
		return history;
	}
	@Test
	public void testFetchGetAllEmailHistory()
	{
		System.out.println("testFetchGetAllEmailHistory : STARTING");
		List<EmailHistoryEntity> history = service.getAllEmailHistory();
		if(history != null)
		{
			System.out.println("testFetchGetAllEmailHistory: " + history.toString());
		}
		assertNotNull(history);
		System.out.println("testFetchGetAllEmailHistory : FINISHED");
	}
	@Test
	public void testFetchGetEmailHistoryById()
	{
		System.out.println("testFetchGetEmailHistoryById : STARTING");
		long _historyId = 2;
		assertNotNull(_historyId);
		service.getEmailHistoryById(_historyId);
		System.out.println("testFetchGetEmailHistoryById: " + _historyId);
		System.out.println("testFetchGetEmailHistoryById : FINISHED");
	}
	@Test
	public void testAddEmailHistoryEntity()
	{
		System.out.println("testAddEmailHistoryEntity : STARTING");
		EmailHistoryEntity email = new EmailHistoryEntity();
		UserTicketEntity ticket = new UserTicketEntity();
		UserEntity user = new UserEntity();
		long _emailHistoryId = 11;
		long _ticketId = 1;
		long _userId = 2;
		String _emailSent = "test";
		String _fromEmail = "test";
		String _toEmail = "test";
		ticket.setTicketId(_ticketId);
		user.setUserId(_userId);
		email.setEmailHistoryId(_emailHistoryId);
		email.setTicketNumber(ticket);
		email.setUserId(user);
		email.setEmailTimestamp(new Date());
		email.setEmailSent(_emailSent);
		email.setFromEmail(_fromEmail);
		email.setToEmail(_toEmail);
		assertNotNull(email);
		service.add(email);
		System.out.println("testAddEmailHistoryEntity: " + email.toString());
		System.out.println("testAddEmailHistoryEntity : FINISHED");
	}
	@Test
	public void testUpdateEmailHistoryEntity()
	{
		System.out.println("testUpdateEmailHistoryEntity : STARTING");
		EmailHistoryEntity email = new EmailHistoryEntity();
		UserTicketEntity ticket = new UserTicketEntity();
		UserEntity user = new UserEntity();
		long _emailHistoryId = 3;
		long _ticketId = 2;
		long _userId = 2;
		String _emailSent = "test";
		String _fromEmail = "test";
		String _toEmail = "test";
		ticket.setTicketId(_ticketId);
		user.setUserId(_userId);
		email.setEmailHistoryId(_emailHistoryId);
		email.setTicketNumber(ticket);
		email.setUserId(user);
		email.setEmailTimestamp(new Date());
		email.setEmailSent(_emailSent);
		email.setFromEmail(_fromEmail);
		email.setToEmail(_toEmail);
		assertNotNull(email);
		service.update(email);
		System.out.println("testUpdateEmailHistoryEntity: " + email.toString());
		System.out.println("testUpdateEmailHistoryEntity : FINISHED");		
	}
	@Test
	public void testDeleteEmailHistoryEntity()
	{
		System.out.println("testDeleteEmailHistoryEntity : STARTING");
		EmailHistoryEntity email = new EmailHistoryEntity();
		long _ticketHistoryIdOne = 3;
		email.setEmailHistoryId(_ticketHistoryIdOne);
		assertNotNull(email);
		//----------------------------------------------------------------------
		System.out.println("testDeleteEmailHistoryEntityOne : START");
		service.remove(email);
		System.out.println("testDeleteEmailHistoryEntityOne : DELETED");
		//----------------------------------------------------------------------
		System.out.println("testDeleteEmailHistoryEntityTwo : START");
		long _ticketHistoryIdTwo = 2;
		assertNotNull(_ticketHistoryIdTwo);
		service.remove(_ticketHistoryIdTwo);
		System.out.println("testDeleteEmailHistoryEntityTwo : DELETED");
		//----------------------------------------------------------------------
		System.out.println("testDeleteEmailHistoryEntity : FINISHED");
	}
}
