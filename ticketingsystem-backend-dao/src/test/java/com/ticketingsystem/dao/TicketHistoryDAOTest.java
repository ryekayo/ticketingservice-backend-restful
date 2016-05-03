package com.ticketingsystem.dao;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.TicketHistoryEntity;
import com.ticketingsystem.entity.UserTicketEntity;

public class TicketHistoryDAOTest extends BaseDAOTests {
	
	final Logger logger = LoggerFactory.getLogger(TicketHistoryDAOTest.class);
	
	@Autowired
	private TicketHistoryDAO ticketHistoryDAO;
	
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
    private HashSet<TicketHistoryEntity> createTicketHistory(TicketHistoryEntity ticketHistoryEntity)
    {
    	HashSet<TicketHistoryEntity> history = new HashSet<TicketHistoryEntity>();
    	logger.debug("createTicketHistory : STARTING");
    	TicketHistoryEntity ticketHistoryEntityOne = null;
    	UserTicketEntity userTicketOne = new UserTicketEntity();
    	long _ticketHistoryOne = 1;
    	long _ticketIdOne = 1;
    	String _caseOwnerOne = "RKAHIL";
    	String _lastModByOne = "RKAHIL";
    	String _statusChangeOne = "OPEN";
    	boolean _isClosedOne = false;
    	boolean _isEscalatedOne = false;
    	userTicketOne.setTicketId(_ticketIdOne);
    	//-------------------------------------------------------------------------------------------------------
    	logger.debug("createTicketHistoryOne : START");
    	ticketHistoryEntityOne.setTicketHistoryId(_ticketHistoryOne);
    	ticketHistoryEntityOne.setTicketNumber(userTicketOne);
    	ticketHistoryEntityOne.setCaseOwner(_caseOwnerOne);
    	ticketHistoryEntityOne.setDateOpened(new Date());
    	ticketHistoryEntityOne.setLastModified(new Date());
    	ticketHistoryEntityOne.setLastModBy(_lastModByOne);
    	ticketHistoryEntityOne.setStatusChange(_statusChangeOne);
    	ticketHistoryEntityOne.setClosed(_isClosedOne);
    	ticketHistoryEntityOne.setEmailTimestamp(new Date());
    	ticketHistoryEntityOne.setDateClosed(new Date());
    	ticketHistoryEntityOne.setEscalated(_isEscalatedOne);
    	ticketHistoryEntityOne.setDateEscalated(new Date());
    	history.add(ticketHistoryEntityOne);
    	//-------------------------------------------------------------------------------------------------------
    	logger.debug("createTicketHistoryTwo : START");
    	TicketHistoryEntity ticketHistoryEntityTwo = null;
    	UserTicketEntity userTicketTwo = new UserTicketEntity();
    	long _ticketHistoryTwo = 4;
    	long _ticketIdTwo = 1;
    	String _caseOwnerTwo = "RKAHIL";
    	String _lastModByTwo = "RKAHIL";
    	String _statusChangeTwo = "PENDING";
    	boolean _isClosedTwo = false;
    	boolean _isEscalatedTwo = false;
    	userTicketTwo.setTicketId(_ticketIdTwo);
    	//---------------------------------------------------------------------------------------------------------
    	ticketHistoryEntityTwo.setTicketHistoryId(_ticketHistoryTwo);
    	ticketHistoryEntityTwo.setTicketNumber(userTicketTwo);
    	ticketHistoryEntityTwo.setCaseOwner(_caseOwnerTwo);
    	ticketHistoryEntityTwo.setDateClosed(new Date());
    	ticketHistoryEntityTwo.setLastModified(new Date());
    	ticketHistoryEntityTwo.setLastModBy(_lastModByTwo);
    	ticketHistoryEntityTwo.setStatusChange(_statusChangeTwo);
    	ticketHistoryEntityTwo.setClosed(_isClosedTwo);
    	ticketHistoryEntityTwo.setEmailTimestamp(new Date());
    	ticketHistoryEntityTwo.setDateClosed(new Date());
    	ticketHistoryEntityTwo.setEscalated(_isEscalatedTwo);
    	ticketHistoryEntityTwo.setDateEscalated(new Date());
    	history.add(ticketHistoryEntityTwo);
    	//----------------------------------------------------------------------------------------------------------
    	logger.debug("createTicketHistoryThree : START");
    	TicketHistoryEntity ticketHistoryEntityThree = null;
    	UserTicketEntity userTicketThree = new UserTicketEntity();
    	long _ticketHistoryThree = 5;
    	long _ticketIdThree = 2;
    	String _caseOwnerThree = "THOLMES";
    	String _lastModByThree = "THOLMES";
    	String _statusChangeThree = "CLOSED";
    	boolean _isClosedThree = true;
    	boolean _isEscalatedThree = false;
    	userTicketThree.setTicketId(_ticketIdThree);
    	//-----------------------------------------------------------------------------------------------------------
    	ticketHistoryEntityThree.setTicketHistoryId(_ticketHistoryThree);
    	ticketHistoryEntityThree.setTicketNumber(userTicketThree);
    	ticketHistoryEntityThree.setCaseOwner(_caseOwnerThree);
    	ticketHistoryEntityThree.setDateClosed(new Date());
    	ticketHistoryEntityThree.setLastModified(new Date());
    	ticketHistoryEntityThree.setLastModBy(_lastModByThree);
    	ticketHistoryEntityThree.setStatusChange(_statusChangeThree);
    	ticketHistoryEntityThree.setClosed(_isClosedThree);
    	ticketHistoryEntityThree.setEmailTimestamp(new Date());
    	ticketHistoryEntityThree.setDateClosed(new Date());
    	ticketHistoryEntityThree.setEscalated(_isEscalatedThree);
    	ticketHistoryEntityThree.setDateEscalated(new Date());
    	history.add(ticketHistoryEntityThree);
    	//---------------------------------------------------------------------------------------------------------
    	logger.debug("createTicketHistory : FINISHED");
    	return history;
    }
    @Test
    public void testSaveTicketHistoryEntity()
    {
    	System.out.println("testSaveTicketHistoryEntity : STARTING");
    	TicketHistoryEntity ticketHistoryEntityOne = new TicketHistoryEntity();
    	UserTicketEntity userTicketOne = new UserTicketEntity();
    	long _ticketHistoryOne = 1;
    	long _ticketIdOne = 1;
    	String _caseOwnerOne = "RKAHIL";
    	String _lastModByOne = "RKAHIL";
    	String _statusChangeOne = "OPEN";
    	boolean _isClosedOne = false;
    	boolean _isEscalatedOne = false;
    	userTicketOne.setTicketId(_ticketIdOne);
    	//-------------------------------------------------------------------------------------------------------
    	System.out.println("ticketHistoryEntityOne : SAVE");
    	ticketHistoryEntityOne.setTicketHistoryId(_ticketHistoryOne);
    	ticketHistoryEntityOne.setTicketNumber(userTicketOne);
    	ticketHistoryEntityOne.setCaseOwner(_caseOwnerOne);
    	ticketHistoryEntityOne.setDateOpened(new Date());
    	ticketHistoryEntityOne.setLastModified(new Date());
    	ticketHistoryEntityOne.setLastModBy(_lastModByOne);
    	ticketHistoryEntityOne.setStatusChange(_statusChangeOne);
    	ticketHistoryEntityOne.setClosed(_isClosedOne);
    	ticketHistoryEntityOne.setEmailTimestamp(new Date());
    	ticketHistoryEntityOne.setDateClosed(new Date());
    	ticketHistoryEntityOne.setEscalated(_isEscalatedOne);
    	ticketHistoryEntityOne.setDateEscalated(new Date());
    	ticketHistoryEntityOne = ticketHistoryDAO.saveTicketHistoryEntity(ticketHistoryEntityOne);
    	System.out.println("ticketHistoryEntityOne: " + ticketHistoryEntityOne.toString());
    	//--------------------------------------------------------------------------------------------------------
    	TicketHistoryEntity ticketHistoryEntityTwo = new TicketHistoryEntity();
    	UserTicketEntity userTicketTwo = new UserTicketEntity();
    	long _ticketHistoryTwo = 4;
    	long _ticketIdTwo = 1;
    	String _caseOwnerTwo = "RKAHIL";
    	String _lastModByTwo = "RKAHIL";
    	String _statusChangeTwo = "PENDING";
    	boolean _isClosedTwo = false;
    	boolean _isEscalatedTwo = false;
    	userTicketTwo.setTicketId(_ticketIdTwo);
    	//---------------------------------------------------------------------------------------------------------
    	System.out.println("ticketHistoryEntityTwo : SAVE");
    	ticketHistoryEntityTwo.setTicketHistoryId(_ticketHistoryTwo);
    	ticketHistoryEntityTwo.setTicketNumber(userTicketTwo);
    	ticketHistoryEntityTwo.setCaseOwner(_caseOwnerTwo);
    	ticketHistoryEntityTwo.setDateClosed(new Date());
    	ticketHistoryEntityTwo.setLastModified(new Date());
    	ticketHistoryEntityTwo.setLastModBy(_lastModByTwo);
    	ticketHistoryEntityTwo.setStatusChange(_statusChangeTwo);
    	ticketHistoryEntityTwo.setClosed(_isClosedTwo);
    	ticketHistoryEntityTwo.setEmailTimestamp(new Date());
    	ticketHistoryEntityTwo.setDateClosed(new Date());
    	ticketHistoryEntityTwo.setEscalated(_isEscalatedTwo);
    	ticketHistoryEntityTwo.setDateEscalated(new Date());
    	ticketHistoryEntityTwo = ticketHistoryDAO.saveTicketHistoryEntity(ticketHistoryEntityTwo);
    	System.out.println("ticketHistoryEntityTwo: " + ticketHistoryEntityTwo.toString());
    	//--------------------------------------------------------------------------------------------------------
    	TicketHistoryEntity ticketHistoryEntityThree = new TicketHistoryEntity();
    	UserTicketEntity userTicketThree = new UserTicketEntity();
    	long _ticketHistoryThree = 5;
    	long _ticketIdThree = 2;
    	String _caseOwnerThree = "THOLMES";
    	String _lastModByThree = "THOLMES";
    	String _statusChangeThree = "CLOSED";
    	boolean _isClosedThree = true;
    	boolean _isEscalatedThree = false;
    	userTicketThree.setTicketId(_ticketIdThree);
    	//-----------------------------------------------------------------------------------------------------------
    	System.out.println("ticketHistoryEntityThree : SAVE");
    	ticketHistoryEntityThree.setTicketHistoryId(_ticketHistoryThree);
    	ticketHistoryEntityThree.setTicketNumber(userTicketThree);
    	ticketHistoryEntityThree.setCaseOwner(_caseOwnerThree);
    	ticketHistoryEntityThree.setDateClosed(new Date());
    	ticketHistoryEntityThree.setLastModified(new Date());
    	ticketHistoryEntityThree.setLastModBy(_lastModByThree);
    	ticketHistoryEntityThree.setStatusChange(_statusChangeThree);
    	ticketHistoryEntityThree.setClosed(_isClosedThree);
    	ticketHistoryEntityThree.setEmailTimestamp(new Date());
    	ticketHistoryEntityThree.setDateClosed(new Date());
    	ticketHistoryEntityThree.setEscalated(_isEscalatedThree);
    	ticketHistoryEntityThree.setDateEscalated(new Date());
    	ticketHistoryEntityThree = ticketHistoryDAO.saveTicketHistoryEntity(ticketHistoryEntityThree);
    	System.out.println("ticketHistoryEntityThree: " + ticketHistoryEntityThree.toString());
    	//----------------------------------------------------------------------------------------------------------
    	System.out.println("testSaveTicketHistoryEntity : FINISHED");
    }
    @Test
    public void testCreateTicketHistoryEntity()
    {
    	System.out.println("createTicketHistoryEntity : STARTING");
    	TicketHistoryEntity ticketHistoryEntity = new TicketHistoryEntity();
    	UserTicketEntity userTicket = new UserTicketEntity();
    	long _ticketHistory = 7;
    	long _ticketId = 2;
    	String _caseOwner = "THOLMES";
    	String _lastModBy = "RKAHIL";
    	String _statusChange = "OPEN";
    	boolean _isClosed = false;
    	boolean _isEscalated = true;
    	userTicket.setTicketId(_ticketId);
    	//---------------------------------------------------------------------------------------------------------
    	ticketHistoryEntity.setTicketHistoryId(_ticketHistory);
    	ticketHistoryEntity.setTicketNumber(userTicket);
    	ticketHistoryEntity.setCaseOwner(_caseOwner);
    	ticketHistoryEntity.setDateClosed(new Date());
    	ticketHistoryEntity.setLastModified(new Date());
    	ticketHistoryEntity.setLastModBy(_lastModBy);
    	ticketHistoryEntity.setStatusChange(_statusChange);
    	ticketHistoryEntity.setClosed(_isClosed);
    	ticketHistoryEntity.setEmailTimestamp(new Date());
    	ticketHistoryEntity.setDateClosed(new Date());
    	ticketHistoryEntity.setEscalated(_isEscalated);
    	ticketHistoryEntity.setDateEscalated(new Date());
    	ticketHistoryEntity = ticketHistoryDAO.createTicketHistoryEntity(ticketHistoryEntity);
    	System.out.println("ticketHistoryEntity: " + ticketHistoryEntity.toString());
    	//---------------------------------------------------------------------------------------------------------
    	System.out.println("ticketHistoryEntity : FINISHED");
    }
    @Test
    public void testUpdateTicketHistoryEntity()
    {
    	System.out.println("testUpdateTicketHistoryEntity : STARTING");
    	TicketHistoryEntity ticketHistoryEntity = new TicketHistoryEntity();
    	UserTicketEntity userTicket = new UserTicketEntity();
    	long _ticketHistoryId = 6;
    	long _ticketId = 3;
    	String _caseOwner = "test";
    	String _lastModBy = "test";
    	String _statusChange = "CLOSED";
    	boolean _isClosed = true;
    	boolean _isEscalated = true;
    	userTicket.setTicketId(_ticketId);
    	//------------------------------------------------------------------------------------------------------------
    	ticketHistoryEntity.setTicketHistoryId(_ticketHistoryId);
    	ticketHistoryEntity.setTicketNumber(userTicket);
    	ticketHistoryEntity.setCaseOwner(_caseOwner);
    	ticketHistoryEntity.setDateClosed(new Date());
    	ticketHistoryEntity.setLastModified(new Date());
    	ticketHistoryEntity.setLastModBy(_lastModBy);
    	ticketHistoryEntity.setStatusChange(_statusChange);
    	ticketHistoryEntity.setClosed(_isClosed);
    	ticketHistoryEntity.setEmailTimestamp(new Date());
    	ticketHistoryEntity.setDateClosed(new Date());
    	ticketHistoryEntity.setEscalated(_isEscalated);
    	ticketHistoryEntity.setDateEscalated(new Date());
    	ticketHistoryEntity = ticketHistoryDAO.updateTicketHistoryEntity(ticketHistoryEntity);
    	System.out.println("testUpdateTicketHistoryEntity: " + ticketHistoryEntity.toString());
    	//-----------------------------------------------------------------------------------------------------------
    	System.out.println("testUpdateTicketHistoryEntity : FINISHED");
    }  
    @Test
    public void testDeleteTicketHistoryEntity()
    {
    	System.out.println("testDeleteteTicketHistoryEntity : STARTING");
    	long _ticketHistoryIdOne = 1;
    	TicketHistoryEntity ticketHistoryEntityOne = ticketHistoryDAO.getTicketHistoryEntityByHistoryId(_ticketHistoryIdOne);
    	assertNotNull(ticketHistoryEntityOne);
    	//-----------------------------------------------------------------------------------------------------------
    	System.out.println("ticketHistoryEntityOne : START");
    	ticketHistoryDAO.deleteTicketHistoryEntity(_ticketHistoryIdOne);
    	System.out.println("ticketHistoryEntityOne : DELETED");
    	//-----------------------------------------------------------------------------------------------------------
    	long _ticketHistoryIdTwo = 4;
    	TicketHistoryEntity ticketHistoryEntityTwo = ticketHistoryDAO.getTicketHistoryEntityByHistoryId(_ticketHistoryIdTwo);
    	assertNotNull(ticketHistoryEntityTwo);
    	//-------------------------------------------------------------------------------------------------------------------
    	System.out.println("ticketHistoryEntityTwo : START");
    	ticketHistoryDAO.deleteTicketHistoryEntity(ticketHistoryEntityTwo);
    	System.out.println("ticketHistoryEntityTwo : FINISHED");
    	//-------------------------------------------------------------------------------------------------------------------
    	System.out.println("testDeleteteTicketHistoryEntity : FINISHED");
    }
    @Test
    public void testFetchGetAllTicketHistoryEntities()
    {
    	System.out.println("testFetchGetAllTicketHistoryEntities : STARTING");
    	List<TicketHistoryEntity> history = ticketHistoryDAO.getAllTicketHistoryEntities();
    	if(history != null)
    	{
    		System.out.println("testFetchGetAllTicketHistoryEntities size: " + history.size());
    	}
    	assertNotNull(history);
    	System.out.println("testFetchGetAllTicketHistoryEntities : FINISHED");
    }
    @Test
    public void testFetchGetAllTicketHistoryEntitiesByTicketHistoryId()
    {
    	System.out.println("testFetchGetAllTicketHistoryEntitiesByTicketHistoryId : STARTING");
    	long _ticketHistoryId = 5;
    	List<TicketHistoryEntity> history = ticketHistoryDAO.getAllTicketHistoryEntitiesByTicketHistoryId(_ticketHistoryId);
    	if(history != null)
    	{
    		System.out.println("testFetchGetAllTicketHistoryEntitiesByTicketHistoryId: " + history.toString());
    	}
    	assertNotNull(history);
    	System.out.println("testFetchGetAllTicketHistoryEntitiesByTicketHistoryId : FINISHED");
    }
    @Test
    public void testFetchGetTicketHistoryEntityByTicketId()
    {
    	System.out.println("testFetchGetTicketHistoryEntityByTicketId : STARTING");
    	long _ticketId = 1;
    	UserTicketEntity userTicketEntity = new UserTicketEntity();
    	userTicketEntity.setTicketId(_ticketId);
    	List<TicketHistoryEntity> history = ticketHistoryDAO.getTicketHistoryEntityByTicketId(userTicketEntity);
    	if(history != null)
    	{
    		System.out.println("testFetchGetTicketHistoryEntityByTicketId size: " + history.size());
    	}
    	assertNotNull(history);
    	System.out.println("testFetchGetTicketHistoryEntityByTicketId : FINISHED");
    }
    @Test
    public void testFetchGetTicketHistoryEntityByCaseOwner()
    {
    	System.out.println("testFetchGetTicketHistoryEntityByCaseOwner : STARTING");
    	String _caseOwner = "RKAHIL";
    	List<TicketHistoryEntity> history = ticketHistoryDAO.getTicketHistoryEntityByCaseOwner(_caseOwner);
    	if(history != null)
    	{
    		System.out.println("testFetchGetTicketHistoryEntityByCaseOwner: " + history.toString());
    	}
    	assertNotNull(history);
    	System.out.println("testFetchGetTicketHistoryEntityByCaseOwner : FINISHED");
    }
    @Test
    public void testFetchGetTicketHistoryEntityByStatusChange()
    {
    	System.out.println("testFetchGetTicketHistoryEntityByStatusChange : STARTING");
    	String _statusChange = "CLOSED";
    	List<TicketHistoryEntity> history = ticketHistoryDAO.getTicketHistoryEntityByStatusChange(_statusChange);
    	if(history != null)
    	{
    		System.out.println("testFetchGetTicketHistoryEntityByStatusChange: " + history.toString());
    	}
    	assertNotNull(history);
    	System.out.println("testFetchGetTicketHistoryEntityByStatusChange : FINISHED");
    }
}
