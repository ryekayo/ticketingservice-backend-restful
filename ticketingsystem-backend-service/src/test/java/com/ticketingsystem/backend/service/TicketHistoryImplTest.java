package com.ticketingsystem.backend.service;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.TicketHistoryEntity;
import com.ticketingsystem.entity.UserTicketEntity;

public class TicketHistoryImplTest extends BaseServiceImplTests {
	
	private static final Log logger = LogFactory.getLog(TicketHistoryImplTest.class);
	
	@Autowired
	private TicketHistoryService service;
	
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
	
	public TicketHistoryEntity createTicketHistoryEntity()
	{
		TicketHistoryEntity ticketHistory = new TicketHistoryEntity();
		UserTicketEntity userTicket = new UserTicketEntity();
		long _ticketHistoryId = 1;
		long _ticketId = 1;
		String _caseOwner = "RKAHIL";
		String _lastModBy = "RKAHIL";
		String _statusChange = "OPEN";
		boolean _isClosed = false;
		boolean _isEscalated = false;
		userTicket.setTicketId(_ticketId);
		ticketHistory.setTicketHistoryId(_ticketHistoryId);
		ticketHistory.setTicketNumber(userTicket);
		ticketHistory.setCaseOwner(_caseOwner);
		ticketHistory.setDateOpened(new Date());
		ticketHistory.setLastModified(new Date());
		ticketHistory.setLastModBy(_lastModBy);
		ticketHistory.setStatusChange(_statusChange);
		ticketHistory.setClosed(_isClosed);
		ticketHistory.setEmailTimestamp(new Date());
		ticketHistory.setDateClosed(new Date());
		ticketHistory.setEscalated(_isEscalated);
		ticketHistory.setDateEscalated(new Date());
		return ticketHistory;
	}
	@Test
	public void testFetchGetAllTicketHistory()
	{
		System.out.println("testFetchGetAllTicketHistory : STARTING");
		List<TicketHistoryEntity> history = service.getAllTicketHistory();
		if(history != null)
		{
			System.out.println("testFetchGetAllTicketHistory: " + history.toString());
		}
		assertNotNull(history);
		System.out.println("testFetchGetAllTicketHistory : FINISHED");		
	}
	@Test
	public void testFetchGetTicketByTicketHistoryId()
	{
		System.out.println("testFetchGetTicketByTicketHistoryId : STARTING");
		long _ticketHistoryId = 3;
		assertNotNull(_ticketHistoryId);
		service.getTicketByTicketHistoryId(_ticketHistoryId);
		System.out.println("testFetchGetTicketByTicketHistoryId: " + _ticketHistoryId);
		System.out.println("testFetchGetTicketByTicketHistoryId : FINISHED");
	}
	@Test
	public void testAddTicketHistoryEntity()
	{
		System.out.println("testFetchGetTicketByTicketHistoryId : STARTING");
		TicketHistoryEntity ticketHistory = new TicketHistoryEntity();
		UserTicketEntity userTicket = new UserTicketEntity();
		long _ticketHistoryId = 7;
		long _ticketId = 3;
		String _caseOwner = "test";
		String _lastModBy = "test";
		String _status = "ESCALATED";
		boolean _isClosed = false;
		boolean _isEscalated = true;
		userTicket.setTicketId(_ticketId);
		ticketHistory.setTicketHistoryId(_ticketHistoryId);
		ticketHistory.setTicketNumber(userTicket);
		ticketHistory.setCaseOwner(_caseOwner);
		ticketHistory.setDateOpened(new Date());
		ticketHistory.setLastModified(new Date());
		ticketHistory.setLastModBy(_lastModBy);
		ticketHistory.setStatusChange(_status);
		ticketHistory.setClosed(_isClosed);
		ticketHistory.setEmailTimestamp(new Date());
		ticketHistory.setDateClosed(new Date());
		ticketHistory.setEscalated(_isEscalated);
		ticketHistory.setDateEscalated(new Date());
		assertNotNull(ticketHistory);
		service.add(ticketHistory);
		System.out.println("testFetchGetTicketByTicketHistoryId: " + ticketHistory.toString());
		System.out.println("testFetchGetTicketByTicketHistoryId : FINISHED");
	}
	@Test
	public void testUpdateTicketHistoryEntity()
	{
		System.out.println("testUpdateTicketHistoryEntity : STARTING");
		TicketHistoryEntity ticketHistory = new TicketHistoryEntity();
		UserTicketEntity userTicket = new UserTicketEntity();
		long _ticketHistoryId = 1;
		long _ticketId = 1;
		String _caseOwner = "test";
		String _lastModBy = "test";
		String _statusChange = "test";
		boolean _isClosed = true;
		boolean _isEscalated = true;
		userTicket.setTicketId(_ticketId);
		ticketHistory.setTicketHistoryId(_ticketHistoryId);
		ticketHistory.setTicketNumber(userTicket);
		ticketHistory.setCaseOwner(_caseOwner);
		ticketHistory.setDateOpened(new Date());
		ticketHistory.setLastModified(new Date());
		ticketHistory.setLastModBy(_lastModBy);
		ticketHistory.setStatusChange(_statusChange);
		ticketHistory.setClosed(_isClosed);
		ticketHistory.setEmailTimestamp(new Date());
		ticketHistory.setDateClosed(new Date());
		ticketHistory.setEscalated(_isEscalated);
		ticketHistory.setDateEscalated(new Date());
		assertNotNull(ticketHistory);
		service.update(ticketHistory);
		System.out.println("testUpdateTicketHistoryEntity: " + ticketHistory.toString());
		System.out.println("testUpdateTicketHistoryEntity : FINISHED");
	}
	public void testRemoveTicketHistoryEntity()
	{
		System.out.println("testRemoveTicketHistoryEntity : STARTING");
		TicketHistoryEntity ticketHistory = new TicketHistoryEntity();
		long _ticketHistoryId = 1;
		ticketHistory.setTicketHistoryId(_ticketHistoryId);
		assertNotNull(ticketHistory);
		//--------------------------------------------------------------------
		System.out.println("testRemoveTicketHistoryEntityOne : START");
		service.remove(ticketHistory);
		System.out.println("testRemoveTicketHistoryEntityOne : DELETED");
		//--------------------------------------------------------------------
		long _ticketHistoryIdTwo = 2;
		System.out.println("testRemoveTicketHistoryEntityTwo : START");
		service.remove(_ticketHistoryIdTwo);
		System.out.println("testRemoveTicketHistoryEntityTwo : DELETED");
		//--------------------------------------------------------------------
		System.out.println("testRemoveTicketHistoryEntity : FINISHED");
	}
}
