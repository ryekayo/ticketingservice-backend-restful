package com.ticketingsystem.dao;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.UserTicketEntity;

public class UserTicketDAOTest extends BaseDAOTests
{

    final Logger logger = LoggerFactory.getLogger(UserTicketDAOTest.class);

    @Autowired
    private UserTicketDAO userTicketDao;

    private long _id = 2;
    private int _ticketNumber = 111111;
    // private String _opened = "04/08/2016";
    private String _priority = "HIGH";
    private String _caseOwner = "Ryan Kahil";

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

    private HashSet<UserTicketEntity> createTickets(UserTicketEntity userTicket)
    {
        HashSet<UserTicketEntity> ticket = new HashSet<UserTicketEntity>();
        logger.debug("creatingTicket STARTING");
        UserTicketEntity userTicketEntity = null;
        int ticketOne = 222222;
        String priorityOne = "LOW";
        String caseOwnerOne = "John Doe";
        UserTicketEntity userTicketEntity1 = new UserTicketEntity();
        userTicketEntity1.setId(1);
//        userTicketEntity = new UserTicketEntity();
        userTicketEntity1.setTicketNumber(ticketOne);
        userTicketEntity1.setDateOpened(new Date());
        userTicketEntity1.setPriorityType(priorityOne);
        userTicketEntity1.setCaseOwner(caseOwnerOne);
        ticket.add(userTicketEntity1);
        // ----------------------------------------------------------------------------
        logger.debug("creatingTicket2 STARTING");
        UserTicketEntity userTicketEntity2 = new UserTicketEntity();
        int ticketTwo = 33333;
        String priorityTwo = "MEDIUM";
        String caseOwnerTwo = "Testing Again";
        userTicketEntity2.setId(2);
        userTicketEntity2.setTicketNumber(ticketTwo);
        userTicketEntity2.setDateOpened(new Date());
        userTicketEntity2.setPriorityType(priorityTwo);
        userTicketEntity2.setCaseOwner(caseOwnerTwo);
        ticket.add(userTicketEntity2);
        // -----------------------------------------------------------------------------
        logger.debug("creatingTicket3 STARTING");
        UserTicketEntity userTicketEntity3 = new UserTicketEntity();
        userTicketEntity = new UserTicketEntity();
        int ticketThree = 44444;
        String priorityThree = "HIGH";
        String caseOwnerThree = "Last Test";
        userTicketEntity3.setId(3);
        userTicketEntity3.setTicketNumber(ticketThree);
        userTicketEntity3.setDateOpened(new Date());
        userTicketEntity3.setPriorityType(priorityThree);
        userTicketEntity3.setCaseOwner(caseOwnerThree);
        // -------------------------------------------------------------------------------
        logger.debug("creatingTicket3 STARTING");
        UserTicketEntity userTicketEntity4 = new UserTicketEntity();
        userTicketEntity = new UserTicketEntity();
        int ticketFour = 555655;
        String priorityFour = "LOW";
        String caseOwnerFour = "Last Test";
        userTicketEntity4.setId(6);
        userTicketEntity4.setTicketNumber(ticketFour);
        userTicketEntity4.setDateOpened(new Date());
        userTicketEntity4.setPriorityType(priorityFour);
        userTicketEntity4.setCaseOwner(caseOwnerFour);
        // -------------------------------------------------------------------------------
        logger.debug("FINISHED TESTING");
        return ticket;
    }

    @Test
    public void testTicketListFetch() throws Exception
    {
        System.out.println("STARTING TEST TO GET TICKET LIST");
        UserTicketEntity userTicketEntity = new UserTicketEntity();
        userTicketEntity.setId(3);

        List<UserTicketEntity> ticket = userTicketDao.getAllUserTicketEntities();
        if (ticket != null)
        {
            System.out.println("testTicketListFetch : size = " + ticket.size());
        }
        assertNotNull(ticket);
        System.out.println("testTicketListFetch : FINISHED");
    }

    @Test
    public void testCreateTicket() throws Exception
    {
        System.out.println("testCreateTicket: STARTING");
        // -----------------------------------------------------------------------------
        UserTicketEntity ticket = new UserTicketEntity();
        ticket.setId(3);
        ticket.setTicketNumber(_ticketNumber);
        ticket.setDateOpened(new Date());
        ticket.setPriorityType(_priority);
        ticket.setCaseOwner(_caseOwner);
        // ------------------------------------------------------------------------------
        System.out.println("testCreateTicket: " + ticket.toString());
        // ------------------------------------------------------------------------------
        System.out.println("testCreateTicket: START: CREATE");
        ticket = userTicketDao.createUserTicketEntity(ticket);
        assertNotNull(ticket);
        System.out.println("testCreateTicket: FINISH: CREATE");
    }

    @Test
    public void retreiveTicketById() throws Exception
    {
        System.out.println("retreiveTicketById: START");

        // Create new ticket first
        UserTicketEntity ticket = new UserTicketEntity();
        ticket.setId(4);
        ticket.setTicketNumber(_ticketNumber);
        ticket.setDateOpened(new Date());
        ticket.setPriorityType(_priority);
        ticket.setCaseOwner(_caseOwner);
        ticket = userTicketDao.createUserTicketEntity(ticket);
        assertNotNull(ticket);
        long ticketId = 0;
        if (ticket != null)
        {
            ticketId = ticket.getId();
        }

        // ------------------------------------------------------------------------------
        long ticketNumber = ticketId;
        // ------------------------------------------------------------------------------
        UserTicketEntity userTicket = userTicketDao.getUserTicketEntity(ticketNumber);
        assertNotNull(userTicket.getId());
        // ------------------------------------------------------------------------------
        assertEquals(userTicket.getPriorityType(), _priority);
        assertEquals(userTicket.getCaseOwner(), _caseOwner);
        // ------------------------------------------------------------------------------
        System.out.println("retreiveTicketById: userTicket = " + userTicket.toString());
        System.out.println("retreiveTicketById: retreiveTicketById: FINISH");
    }

    @Test
    public void testDeleteTicket() throws Exception
    {
        long Id = 4;
        long _Id = 87;
        UserTicketEntity ticket = userTicketDao.getUserTicketEntity(Id);
        assertNotNull(ticket);
        System.out.println("testDeleteTicket: START");
        // ------------------------------------------------------------------------------
        userTicketDao.deleteUserTicketEntity(ticket);
        System.out.println("testDeleteTicket: ticket deleted");
        // ------------------------------------------------------------------------------
        System.out.println("testDeleteTicket: FINISHED");
        // ------------------------------------------------------------------------------
        long _ticketNumber = 1;
        UserTicketEntity ticketTwo = userTicketDao.getUserTicketEntity(_Id);
        assertNotNull(ticketTwo);
        assertNotNull(_ticketNumber);
        System.out.println("testDeleteUserTicketEntity: START");
        userTicketDao.deleteUserTicketEntity(_ticketNumber);
        System.out.println("testDeleteUserTicketEntity: ticket deleted");
        // ------------------------------------------------------------------------------
        System.out.println("testDeleteUserTicketEntity: FINISHED");
    }
    @Test
    public void testTicketUpdateByPriority() throws Exception
    {
        System.out.println("testTicketUpdate: START");
        long Id = 3;
        // ------------------------------------------------------------------------------
        int updateTicket = 111;
        String updatePriority = "HIGH";
        String updateCaseOwner = "RyanTest";
        // ------------------------------------------------------------------------------
        UserTicketEntity tickets = userTicketDao.getUserTicketEntity(Id);

        assertNotNull(tickets);    
        tickets.setDateOpened(new Date());
        tickets.setTicketNumber(updateTicket);
        tickets.setCaseOwner(updateCaseOwner);
        tickets.setPriorityType(updatePriority);

        System.out.println("testTicketUpdate: " + tickets.toString());
        // -----------------------------------------------------------------------------
        // -----------------------------------------------------------------------------
        tickets = userTicketDao.updateUserTicketEntity(tickets);
        assertEquals(tickets.getTicketNumber(), updateTicket);
        //assertEquals(tickets.getDateOpened(), new Date());
        assertEquals(tickets.getPriorityType(), updatePriority);
        assertEquals(tickets.getCaseOwner(), updateCaseOwner);
        System.out.println("testTicketUpdate: FINISH: CREATE");
    }
    @Test
    public void testFetchTicketEntitiesByOwner()
    {
    	String _caseOwner = "RKAHIL";
    	System.out.println("testFetchTicketEntitiesByOwner : START");
    	// -----------------------------------------------------------------------------
    	List<UserTicketEntity> ticketOwner = userTicketDao.getUserTicketEntitiesByOwner(_caseOwner);
    	if(ticketOwner != null)
    	{
    		System.out.println("testFetchTicketEntitiesByOwner: size=" + ticketOwner.size());
    	}
    	assertNotNull(_caseOwner);
    	System.out.println("testFetchTicketEntitiesByOwner : FINISH");
    }
    @Test
    public void testFetchTicketEntitiesByPriority()
    {
    	String _priority = "HIGH";
    	System.out.println("testFetchTicketEntitiesByPriority : START");
    	// -----------------------------------------------------------------------------------
    	List<UserTicketEntity> ticketPriority = userTicketDao.getUserTicketEntitiyesByPriority(_priority);
    	if(ticketPriority != null)
    	{
    		System.out.println("testFetchTicketEntitiesByPriority : size=" + ticketPriority.size());
    	}
    	assertNotNull(_priority);
    	System.out.println("testFetchTicketEntitiesByPriority : FINISH");
    }
}
