package com.ticketingsystem.dao;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.CustomerInformationEntity;
import com.ticketingsystem.entity.EscalationStatusEntity;
import com.ticketingsystem.entity.UserTicketEntity;

public class EscalationStatusDAOTest extends BaseDAOTests {

	final Logger logger = LoggerFactory.getLogger(EscalationStatusDAOTest.class);
	
	@Autowired
	private EscalationStatusDAO escalationStatusDAO;
	
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
    private HashSet<EscalationStatusEntity> createEscalationStatus(EscalationStatusEntity escalationStatusEntity)
    {
    	HashSet<EscalationStatusEntity> escalation = new HashSet<EscalationStatusEntity>();
    	logger.debug("createEscalationStatusOne : STARTING");
    	UserTicketEntity userTicketOne = new UserTicketEntity();
    	EscalationStatusEntity escalationStatusEntityOne = null;
    	long _idOne = 1;
    	long _userTicketOne = 6;
    	boolean _isEscalatedOne = true;
    	String _assignedToOne = "RKAHIL";
    	String _notesOne = "TEST1";
    	userTicketOne.setTicketId(_userTicketOne);
    	//-------------------------------------------------------------------------------------------------------
    	escalationStatusEntityOne.setId(_idOne);
    	escalationStatusEntityOne.setTicketId(userTicketOne);
    	escalationStatusEntityOne.setEscalated(_isEscalatedOne);
    	escalationStatusEntityOne.setDateEscalated(new Date());
    	escalationStatusEntityOne.setAssignedTo(_assignedToOne);
    	escalationStatusEntityOne.setNotes(_notesOne);
    	escalation.add(escalationStatusEntityOne);
    	//-------------------------------------------------------------------------------------------------------
    	logger.debug("createEscalationStatusTwo : STARTING");
    	UserTicketEntity userTicketTwo = new UserTicketEntity();
    	EscalationStatusEntity escalationStatusEntityTwo = null;
    	long _idTwo = 2;
    	long _userTicketTwo = 2;
    	boolean _isEscalatedTwo = true;
    	String _assignedToTwo = "THOLMES";
    	String _notesTwo = "TEST2";
    	userTicketTwo.setTicketId(_userTicketTwo);
    	//--------------------------------------------------------------------------------------------------------
    	escalationStatusEntityTwo.setId(_idTwo);
    	escalationStatusEntityTwo.setTicketId(userTicketTwo);
    	escalationStatusEntityTwo.setEscalated(_isEscalatedTwo);
    	escalationStatusEntityTwo.setAssignedTo(_assignedToTwo);
    	escalationStatusEntityTwo.setNotes(_notesTwo);
    	escalationStatusEntityTwo.setDateEscalated(new Date());
    	escalation.add(escalationStatusEntityTwo);
    	//--------------------------------------------------------------------------------------------------------
    	logger.debug("createEscalationStatusThree : STARTING");
    	UserTicketEntity userTicketThree = new UserTicketEntity();
    	EscalationStatusEntity escalationStatusEntityThree = null;
    	long _idThree = 3;
    	long _userTicketThree = 3;
    	boolean _isEscalatedThree = true;
    	String _assignedToThree = "THOLMES";
    	String _notesThree = "TEST3";
    	userTicketThree.setTicketId(_userTicketThree);
    	//---------------------------------------------------------------------------------------------------------
    	escalationStatusEntityThree.setId(_idThree);
    	escalationStatusEntityThree.setTicketId(userTicketThree);
    	escalationStatusEntityThree.setEscalated(_isEscalatedThree);
    	escalationStatusEntityThree.setAssignedTo(_assignedToThree);
    	escalationStatusEntityThree.setNotes(_notesThree);
    	escalationStatusEntityThree.setDateEscalated(new Date());
    	escalation.add(escalationStatusEntityThree);
    	logger.debug("createEscalationStatus : FINISHED");
    	return escalation;
    }
    @Test
    public void testEscalationStatusEntitySave()
    {
    	System.out.println("testEscalationStatusEntitySave : STARTING");
    	EscalationStatusEntity escalationStatusOne = new EscalationStatusEntity();
    	UserTicketEntity userTicketOne = new UserTicketEntity();
    	long _idOne = 3;
    	long _ticketId = 3;
    	boolean _isEscalatedOne = true;
    	String _assignedToOne = "THOLMES";
    	String _notesOne = "TEST3";
    	userTicketOne.setTicketId(_ticketId);
    	//--------------------------------------------------------------------------------------------------------
    	System.out.println("testEscalationStatusEntitySaveOne : SAVE");
    	escalationStatusOne.setId(_idOne);
    	escalationStatusOne.setTicketId(userTicketOne);
    	escalationStatusOne.setEscalated(_isEscalatedOne);
    	escalationStatusOne.setAssignedTo(_assignedToOne);
    	escalationStatusOne.setNotes(_notesOne);
    	escalationStatusOne.setDateEscalated(new Date());
    	assertNotNull(escalationStatusOne);
    	escalationStatusDAO.saveEscalationStatusEntity(escalationStatusOne);
    	System.out.println("escalationStatusOne: " + escalationStatusOne.toString());
    	//--------------------------------------------------------------------------------------------------------
    	System.out.println("testEscalationStatusEntitySaveTwo : SAVE");
    	EscalationStatusEntity escalationStatusTwo = new EscalationStatusEntity();
    	UserTicketEntity userTicketTwo = new UserTicketEntity();
    	long _idTwo = 2;
    	long _ticketIdTwo = 2;
    	boolean _isEscalatedTwo = true;
    	String _assignedToTwo = "THOLMES";
    	String _notesTwo = "TEST2";
    	userTicketTwo.setTicketId(_ticketIdTwo);
    	//--------------------------------------------------------------------------------------------------------
    	escalationStatusTwo.setId(_idTwo);
    	escalationStatusTwo.setTicketId(userTicketTwo);
    	escalationStatusTwo.setEscalated(_isEscalatedTwo);
    	escalationStatusTwo.setAssignedTo(_assignedToTwo);
    	escalationStatusTwo.setDateEscalated(new Date());
    	escalationStatusTwo.setNotes(_notesTwo);
    	assertNotNull(escalationStatusTwo);
    	escalationStatusDAO.saveEscalationStatusEntity(escalationStatusTwo);
    	System.out.println("escalationStatusTwo: " + escalationStatusTwo.toString());
    	//--------------------------------------------------------------------------------------------------------
    	System.out.println("testEscalationStatusEntitySaveThree : SAVE");
    	EscalationStatusEntity escalationStatusThree = new EscalationStatusEntity();
    	UserTicketEntity userTicketThree = new UserTicketEntity();
    	long _idThree = 1;
    	long _ticketIdThree = 1;
    	boolean _isEscalatedThree = true;
    	String _assignedToThree = "RKAHIL";
    	String _notesThree = "TEST1";
    	userTicketThree.setTicketId(_ticketIdThree);
    	//--------------------------------------------------------------------------------------------------------
    	escalationStatusThree.setId(_idThree);
    	escalationStatusThree.setTicketId(userTicketThree);
    	escalationStatusThree.setEscalated(_isEscalatedThree);
    	escalationStatusThree.setAssignedTo(_assignedToThree);
    	escalationStatusThree.setNotes(_notesThree);
    	escalationStatusThree.setDateEscalated(new Date());
    	assertNotNull(escalationStatusThree);
    	escalationStatusDAO.saveEscalationStatusEntity(escalationStatusThree);
    	System.out.println("escalationStatusThree: " + escalationStatusThree.toString());
    	//--------------------------------------------------------------------------------------------------------
    	System.out.println("testEscalationStatusEntitySave : FINISHED");
    }
    @Test
    public void testEscalationStatusEntityCreate()
    {
    	System.out.println("testEscalationStatusEntityCreate : STARTING");
    	EscalationStatusEntity escalationStatus = new EscalationStatusEntity();
    	UserTicketEntity userTicket = new UserTicketEntity();
    	CustomerInformationEntity customerEntity = new CustomerInformationEntity();
    	long _id = 11;
    	long _ticketId = 5;
    	boolean _isEscalated = true;
    	String _assignedTo = "TEST";
    	String _notes = "test";
    	//---------------------------------------------------------------------------------------------------------
    	userTicket.setTicketId(_ticketId);
    	userTicket.setCaseOwner("test");
    	customerEntity.setCustomerId(_id);
    	userTicket.setCustomerId(customerEntity);
    	userTicket.setDateOpened(new Date());
    	userTicket.setLastModified(new Date());
    	userTicket.setOpen(true);
    	userTicket.setPriorityType("LOW");
    	userTicket.setStatus("OPEN");
    	userTicket.setTicketId(_ticketId);   	
    	//--------------------------------------------------------------------------------------------------------
    	escalationStatus.setId(_id);
    	escalationStatus.setTicketId(userTicket);
    	escalationStatus.setAssignedTo(_assignedTo);
    	escalationStatus.setDateEscalated(new Date());
    	escalationStatus.setNotes(_notes);
    	escalationStatus.setEscalated(_isEscalated);
    	assertNotNull(escalationStatus);
    	escalationStatusDAO.createEscalationStatusEntity(escalationStatus);
    	System.out.println("escalationStatus: " + escalationStatus.toString());
    	//--------------------------------------------------------------------------------------------------------
    	System.out.println("testEscalationStatusEntityCreate : FINISHED");
    }
    @Test
    public void testEscalationStatusEntityUpdate()
    {
    	System.out.println("testEscalationStatusEntityUpdate : STARTING");
    	EscalationStatusEntity escalationStatus = new EscalationStatusEntity();
    	UserTicketEntity userTicket = new UserTicketEntity();
    	long _id = 2;
    	long _ticketId = 2;
    	boolean _isEscalated = false;
    	String _assignedTo = "test";
    	String _notes = "test";
    	userTicket.setTicketId(_ticketId);
    	//--------------------------------------------------------------------------------------------------------
    	escalationStatus.setId(_id);
    	escalationStatus.setTicketId(userTicket);
    	escalationStatus.setAssignedTo(_assignedTo);
    	escalationStatus.setDateEscalated(new Date());
    	escalationStatus.setEscalated(_isEscalated);
    	escalationStatus.setNotes(_notes);
    	assertNotNull(escalationStatus);
    	escalationStatusDAO.updateEscalationStatusEntity(escalationStatus);
    	System.out.println("escalationStatus: " + escalationStatus.toString());
    	//--------------------------------------------------------------------------------------------------------
    	System.out.println("testEscalationStatusEntityUpdate : FINISHED");
    }
    @Test
    public void testEscalationStatusEntityDelete()
    {
    	System.out.println("testEscalationStatusEntityDelete : STARTING");
    	long _id = 1;
    	EscalationStatusEntity escalationStatusOne = escalationStatusDAO.getEscalationStatusEntity(_id);
    	assertNotNull(escalationStatusOne);
    	//-------------------------------------------------------------------------------------------------------
    	System.out.println("escalationStatusOne : START");
    	escalationStatusDAO.deleteEscalationStatusEntity(_id);
    	System.out.println("escalationStatusOne : DELETED");
    	//--------------------------------------------------------------------------------------------------------
    	long _idTwo = 2;
    	EscalationStatusEntity escalationStatusTwo = escalationStatusDAO.getEscalationStatusEntity(_idTwo);
    	assertNotNull(escalationStatusTwo);
    	//--------------------------------------------------------------------------------------------------------
    	System.out.println("escalationStatusTwo : START");
    	escalationStatusDAO.deleteEscalatinStatusEntity(escalationStatusTwo);
    	System.out.println("escalationStatusTwo : DELETED");
    	//---------------------------------------------------------------------------------------------------------
    	System.out.println("testEscalationStatusEntityDelete : FINISHED");
    }
    @Test
    public void testFetchGetAllEscalationStatusEntities()
    {
    	System.out.println("testFetchGetAllEscalationStatusEntities : STARTING");
    	List<EscalationStatusEntity> escalation = escalationStatusDAO.getAllEscalationStatusEntities();
    	if(escalation != null)
    	{
    		System.out.println("testFetchGetAllEscalationStatusEntities size: " + escalation.size());
    	}
    	assertNotNull(escalation);
    	System.out.println("testFetchGetAllEscalationStatusEntities : FINISHED");
    }
    @Test
    public void testFetchGetAllEscalationStatusEntitiesByTicketId()
    {
    	System.out.println("testFetchGetAllEscalationStatusEntitiesByTicketId : STARTING");
    	UserTicketEntity userTicket = new UserTicketEntity();
    	long _ticketId = 2;
    	userTicket.setTicketId(_ticketId);
    	List<EscalationStatusEntity> escalation = escalationStatusDAO.getAllEscalationStatusEntitiesByTicketId(userTicket);
    	if(escalation != null)
    	{
    		System.out.println("testFetchGetAllEscalationStatusEntitiesByTicketId size: " + escalation.size());
    	}
    	assertNotNull(escalation);
    	System.out.println("testFetchGetAllEscalationStatusEntitiesByTicketId : FINISHED");
    }
    @Test
    public void testFetchGetAllEscalationStatusEntitiesById()
    {
    	System.out.println("testFetchGetAllEscalationStatusEntitiesById : STARTING");
    	long _id = 3;
    	List<EscalationStatusEntity> escalation = escalationStatusDAO.getAllEscalationStatusEntitiesById(_id);
    	if(escalation != null)
    	{
    		System.out.println("testFetchGetAllEscalationStatusEntitiesById size: " + escalation.toString());
    	}
    	assertNotNull(escalation);
    	System.out.println("testFetchGetAllEscalationStatusEntitiesById : FINISHED");
    }
    @Test
    public void testFetchGetAllEscalationStatusEntitiesByNotes()
    {
    	String _notes = "TEST1";
    	System.out.println("testFetchGetAllEscalationStatusEntitiesByNotes : STARTING");
    	List<EscalationStatusEntity> escalation = escalationStatusDAO.getAllEscalationStatusEntitiesByNotes(_notes);
    	if(escalation != null)
    	{
    		System.out.println("testFetchGetAllEscalationStatusEntitiesByNotes: " + escalation.toString());
    	}
    	assertNotNull(escalation);
    	System.out.println("testFetchGetAllEscalationStatusEntitiesByNotes : FINISHED");
    }
}
