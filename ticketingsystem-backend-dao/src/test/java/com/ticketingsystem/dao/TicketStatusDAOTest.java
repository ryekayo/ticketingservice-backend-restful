package com.ticketingsystem.dao;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.TicketStatusEntity;
import com.ticketingsystem.entity.UserTicketEntity;

public class TicketStatusDAOTest extends BaseDAOTests {

	final Logger logger = LoggerFactory.getLogger(TicketStatusDAOTest.class);
	
	@Autowired
	private TicketStatusDAO ticketStatusDao;
	
	private UserTicketEntity userTicketEntity;
	
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
    private HashSet<TicketStatusEntity> createTicketStatus(UserTicketEntity ticketStatus)
    {
    	HashSet<TicketStatusEntity> status = new HashSet<TicketStatusEntity>();
    	logger.debug("STARTING TESTING");
    	TicketStatusEntity ticketStatusEntity = null;
    	String _statusOne = "OPEN";
    	boolean _isOpenOne = true;
    	TicketStatusEntity ticketStatusEntityOne = new TicketStatusEntity();
    	// ------------------------------------------------------------------------------------
    	ticketStatusEntityOne.setId(1);
    	//ticketStatusEntityOne.setTicketNumber(ticketStatus);
    	ticketStatusEntityOne.setDateOpened(new Date());
    	ticketStatusEntityOne.setLastModified(new Date());
    	ticketStatusEntityOne.setStatus(_statusOne);
    	ticketStatusEntityOne.setOpen(_isOpenOne);
    	status.add(ticketStatusEntity);
    	// ------------------------------------------------------------------------------------
    	String _statusTwo = "PENDING";
    	boolean _isOpenTwo = true;
    	TicketStatusEntity ticketStatusEntityTwo = new TicketStatusEntity();
    	// ------------------------------------------------------------------------------------
    	ticketStatusEntityTwo.setId(2);
    	//ticketStatusEntityTwo.setTicketNumber(ticketStatus);
    	ticketStatusEntityTwo.setDateOpened(new Date());
    	ticketStatusEntityTwo.setLastModified(new Date());
    	ticketStatusEntityTwo.setStatus(_statusTwo);
    	ticketStatusEntityTwo.setOpen(_isOpenTwo);
    	status.add(ticketStatusEntity);
    	// -----------------------------------------------------------------------------------
    	String _statusThree = "CLOSED";
    	boolean _isOpenThree = false;
    	TicketStatusEntity ticketStatusEntityThree = new TicketStatusEntity();
    	// ------------------------------------------------------------------------------------
    	ticketStatusEntityThree.setId(3);
    	//ticketStatusEntityThree.setTicketNumber(ticketStatus);
    	ticketStatusEntityThree.setDateOpened(new Date());
    	ticketStatusEntityThree.setLastModified(new Date());
    	ticketStatusEntityThree.setStatus(_statusThree);
    	ticketStatusEntityThree.setOpen(_isOpenThree);
    	status.add(ticketStatusEntity);
    	// -------------------------------------------------------------------------------------
    	logger.debug("FINISHED TESTING");
    	return status;
    }
    @Test
    public void testFetchTicketStatusList() throws Exception
    {
    	System.out.println("STARTING TEST TO GET TICKET LIST");
    	TicketStatusEntity ticketStatusEntity = new TicketStatusEntity();
    	ticketStatusEntity.setId(3);
    	List<TicketStatusEntity> status = ticketStatusDao.getAllTicketStatusEntitys();
    	System.out.println(status);
    	if(status != null)
    	{
    		System.out.println("testfetchTicketStatusList : size = " + status.size());
    	}
    	assertNotNull(status);
    	System.out.println("testfetchTicketStatusList : FINISHED");
    }
    @Test
    public void testCreateTicketStatus() throws Exception
    {
    	String _openStatus = "CLOSED";
    	boolean _isOpen = false;
    	System.out.println("testCreateTicketStatus : START");
    	// ----------------------------------------------------------------------------
    	TicketStatusEntity ticketStatusEntity = new TicketStatusEntity();
    	ticketStatusEntity.setId(3);
    	ticketStatusEntity.setTicketNumber(ticketStatusEntity.getTicketNumber());
    	ticketStatusEntity.setDateOpened(new Date());
    	ticketStatusEntity.setLastModified(new Date());
    	ticketStatusEntity.setStatus(_openStatus);
    	// ------------------------------------------------------------------------------
    	System.out.println("testCreateTicketStatus: " + ticketStatusEntity.toString());
    	// -----------------------------------------------------------------------------
    	System.out.println("testCreateTicketStatus : START CREATE");
    	ticketStatusEntity = ticketStatusDao.createTicketStatusEntity(ticketStatusEntity);
    	assertNotNull(ticketStatusEntity);
    	// -------------------------------------------------------------------------------
    	System.out.println("testCreateTicketStatus : FINISHED");    	
    }
}
