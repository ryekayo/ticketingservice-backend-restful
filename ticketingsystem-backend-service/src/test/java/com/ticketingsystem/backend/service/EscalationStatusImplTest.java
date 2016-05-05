package com.ticketingsystem.backend.service;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.EscalationStatusEntity;
import com.ticketingsystem.entity.UserTicketEntity;

public class EscalationStatusImplTest extends BaseServiceImplTests {
	
	private static final Log logger = LogFactory.getLog(EscalationStatusImplTest.class);
	
	@Autowired
	private EscalationStatusService service;
	
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
	
	private EscalationStatusEntity createEscalationStatusEntity()
	{
		EscalationStatusEntity escalation = new EscalationStatusEntity();
		UserTicketEntity userTicket = new UserTicketEntity();
		long _id = 1;
		long _ticketId = 6;
		boolean _isEscalated = true;
		String _assignedTo = "RKAHIL";
		String _notes = "TEST1";
		userTicket.setTicketId(_ticketId);
		escalation.setId(_id);
		escalation.setTicketId(userTicket);
		escalation.setEscalated(_isEscalated);
		escalation.setDateEscalated(new Date());
		escalation.setAssignedTo(_assignedTo);
		escalation.setNotes(_notes);
		return escalation;
	}
	@Test
	public void testFetchGetAllEscalationStatus()
	{
		System.out.println("getAllEscalationStatus : STARTING");
		List<EscalationStatusEntity> escalation = service.getAllEscalationStatus();
		if(escalation != null)
		{
			System.out.println("getAllEscalationStatus: " + escalation.toString());
		}
		assertNotNull(escalation);
		System.out.println("getAllEscalationStatus : FINISHED");
	}
	@Test
	public void testFetchGetTicketById()
	{
		System.out.println("testFetchGetTicketById : STARTING");
		long _id = 1;
		assertNotNull(_id);
		service.getTicketById(_id);
		System.out.println("testFetchGetTicketById: " + _id);
		System.out.println("testFetchGetTicketById : FINISHED");
	}
	@Test
	public void testAddEscalationStatusEntity()
	{
		System.out.println("testAddEscalationStatusEntity : STARTING");
		EscalationStatusEntity escalation = new EscalationStatusEntity();
		UserTicketEntity ticket = new UserTicketEntity();
		long _id = 4;
		long _ticketId = 5;
		boolean _isEscalated = true;
		String _assignedTo = "TEST";
		String _notes = "TEST";
		ticket.setTicketId(_ticketId);
		escalation.setId(_id);
		escalation.setTicketId(ticket);
		escalation.setDateEscalated(new Date());
		escalation.setEscalated(_isEscalated);
		escalation.setAssignedTo(_assignedTo);
		escalation.setNotes(_notes);
		assertNotNull(escalation);
		service.add(escalation);
		System.out.println("testAddEscalationStatusEntity: " + escalation.toString());
		System.out.println("testAddEscalationStatusEntity : FINISHED");
	}
	@Test
	public void testUpdateEscalationStatusEntity()
	{
		System.out.println("testUpdateEscalationStatusEntity : STARTING");
		EscalationStatusEntity escalation = new EscalationStatusEntity();
		UserTicketEntity ticket = new UserTicketEntity();
		long _id = 2;
		long _ticketId = 2;
		boolean _isEscalated = false;
		String _assignedTo = "TEST";
		String _notes = "test";
		ticket.setTicketId(_ticketId);
		escalation.setId(_id);
		escalation.setTicketId(ticket);
		escalation.setDateEscalated(new Date());
		escalation.setEscalated(_isEscalated);
		escalation.setAssignedTo(_assignedTo);
		escalation.setNotes(_notes);
		assertNotNull(escalation);
		service.update(escalation);
		System.out.println("testUpdateEscalationStatusEntity: " + escalation.toString());
		System.out.println("testUpdateEscalationStatusEntity : FINISHED");
	}
	@Test
	public void testRemoveEscalationStatusEntity()
	{
		System.out.println("testRemoveEscalationStatusEntity : STARTING");
		EscalationStatusEntity escalation = new EscalationStatusEntity();
		long _id = 2;
		escalation.setId(_id);
		assertNotNull(escalation);
		//----------------------------------------------------------------------
		System.out.println("testRemoveEscalationStatusEntityOne : START");
		service.remove(escalation);
		System.out.println("testRemoveEscalationStatusEntityOne : DELETED");
		//----------------------------------------------------------------------
		long _idTwo = 1;
		assertNotNull(_idTwo);
		System.out.println("testRemoveEscalationStatusEntityTwo : START");
		service.remove(_idTwo);
		System.out.println("testRemoveEscalationStatusEntityTwo : DELETED");
		//----------------------------------------------------------------------
		System.out.println("testRemoveEscalationStatusEntity : FINISHED");
	}
}
