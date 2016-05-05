package com.ticketingsystem.backend.service;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.UserTicketEntity;
import com.ticketingsystem.entity.CustomerInformationEntity;

public class UserTicketImplTest extends BaseServiceImplTests {

	private static final Log logger = LogFactory.getLog(UserTicketImplTest.class);

	@Autowired
	private UserTicketService service;

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

	private UserTicketEntity createUserTicketEntity()

	{
		UserTicketEntity userTicket = new UserTicketEntity();
		CustomerInformationEntity custInfo = new CustomerInformationEntity();

		long _userTicket = 3;
		long _customerId = 3;
		String _priority = "LOW";
		String _caseOwner = "THOLMES";
		String _status = "CLOSED";
		boolean _isOpen = false;
		custInfo.setCustomerId(_customerId);
		userTicket.setTicketId(_userTicket);
		userTicket.setCustomerId(custInfo);
		userTicket.setDateOpened(new Date());
		userTicket.setLastModified(new Date());
		userTicket.setPriorityType(_priority);
		userTicket.setStatus(_status);
		userTicket.setCaseOwner(_caseOwner);
		userTicket.setOpen(_isOpen);
		return userTicket;
	}
	@Test
	public void testFetchGetAllTickets()
	{
		System.out.println("testFetchGetAllTickets : STARTING");
		List<UserTicketEntity> tickets = service.getAllTickets();
		if(tickets != null)
		{
			System.out.println("testFetchGetAllTickets: " + tickets.toString());
		}
		assertNotNull(tickets);
		System.out.println("testFetchGetAllTickets : FINISHED");
	}
	@Test
	public void testFetchGetUserTicketByTicketId()
	{
		System.out.println("testFetchGetUserTicketByTicketId : STARTING");
		long _userTicket = 3;
		UserTicketEntity userTicket = service.getUserByTicketId(_userTicket);
		if(userTicket != null)
		{
			System.out.println("testFetchGetUserTicketByTicketId: " + userTicket.toString());
		}
		assertNotNull(userTicket);
		System.out.println("testFetchGetUserTicketByTicketId : FINISHED");
	}
	@Test
	public void testUserEntityAdd()
	{
		System.out.println("testUserEntityAdd : STARTING");
		UserTicketEntity userTicket = new UserTicketEntity();
		CustomerInformationEntity custInfo = new CustomerInformationEntity();
		long _ticketId = 9;
		long _customerId = 2;
		String _priority = "HIGH";
		String _caseOwner = "RKAHIL";
		String _status = "PENDING RESPONSE";
		boolean _isOpen = true;
		custInfo.setCustomerId(_customerId);
		userTicket.setTicketId(_ticketId);
		userTicket.setCustomerId(custInfo);
		userTicket.setDateOpened(new Date());
		userTicket.setLastModified(new Date());
		userTicket.setPriorityType(_priority);
		userTicket.setCaseOwner(_caseOwner);
		userTicket.setStatus(_status);
		userTicket.setOpen(_isOpen);
		userTicket = service.add(userTicket);
		assertNotNull(userTicket);
		System.out.println("testUserEntityAdd: " + userTicket.toString());
		System.out.println("testUserEntityAdd : FINISHED");
	}
	@Test
	public void testUserEntityRemove()
	{
		System.out.println("testUserEntityRemove : STARTING");
		UserTicketEntity userTicketOne = new UserTicketEntity();
		long _ticketId = 3;
		userTicketOne.setTicketId(_ticketId);
		//-------------------------------------------------------------------------
		System.out.println("testUserEntityRemoveOne : START");
		assertNotNull(userTicketOne);
		service.remove(userTicketOne);
		System.out.println("testUserEntityRemoveOne : DELETED");
		//-------------------------------------------------------------------------
		System.out.println("testUserEntityRemoveTwo : START");
		long _ticketIdTwo = 4;
		assertNotNull(_ticketIdTwo);
		service.remove(_ticketIdTwo);
		System.out.println("testUserEntityRemoveTwo : DELETED");
		//-------------------------------------------------------------------------
		System.out.println("testUserEntityRemove : FINISHED");
	}
	@Test
	public void testUserTicketEntityUpdate()
	{
		System.out.println("testUserTicketEntityUpdate : STARTING");
		UserTicketEntity userTicket = new UserTicketEntity();
		CustomerInformationEntity custInfo = new CustomerInformationEntity();
		long _ticketId = 3;
		long _customerId = 3;
		String _priority = "CRITICAL";
		String _caseOwner = "RKAHIL";
		String _status = "ESCALATED";
		boolean _isOpen = true;
		//--------------------------------------------------------------------------
		custInfo.setCustomerId(_customerId);
		userTicket.setTicketId(_ticketId);
		userTicket.setCustomerId(custInfo);
		userTicket.setDateOpened(new Date());
		userTicket.setLastModified(new Date());
		userTicket.setPriorityType(_priority);
		userTicket.setCaseOwner(_caseOwner);
		userTicket.setStatus(_status);
		userTicket.setOpen(_isOpen);
		assertNotNull(userTicket);
		userTicket = service.update(userTicket);
		System.out.println("testUserTicketEntityUpdate: " + userTicket.toString());
		//--------------------------------------------------------------------------
		System.out.println("testUserTicketEntityUpdate : FINISHED");
	}
}
