package com.ticketingsystem.dao;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.CustomerInformationEntity;
import com.ticketingsystem.entity.UserTicketEntity;

public class UserTicketDAOTest extends BaseDAOTests
{

    final Logger logger = LoggerFactory.getLogger(UserTicketDAOTest.class);

    @Autowired
    private UserTicketDAO userTicketDao;

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
        long ticketOne = 1;
        String priorityOne = "LOW";
        String caseOwnerOne = "John Doe";
        userTicketEntity.setTicketId(ticketOne);
        userTicketEntity.setDateOpened(new Date());
        userTicketEntity.setPriorityType(priorityOne);
        userTicketEntity.setCaseOwner(caseOwnerOne);
        ticket.add(userTicketEntity);
        // ----------------------------------------------------------------------------
        logger.debug("creatingTicket2 STARTING");
        UserTicketEntity userTicketEntity2 = new UserTicketEntity();
        long ticketTwo = 2;
        String priorityTwo = "MEDIUM";
        String caseOwnerTwo = "Testing Again";
        userTicketEntity2.setTicketId(ticketTwo);
        userTicketEntity2.setDateOpened(new Date());
        userTicketEntity2.setPriorityType(priorityTwo);
        userTicketEntity2.setCaseOwner(caseOwnerTwo);
        ticket.add(userTicketEntity2);
        // -----------------------------------------------------------------------------
        logger.debug("creatingTicket3 STARTING");
        UserTicketEntity userTicketEntity3 = new UserTicketEntity();
        userTicketEntity = new UserTicketEntity();
        long ticketThree = 3;
        String priorityThree = "HIGH";
        String caseOwnerThree = "Last Test";
        userTicketEntity3.setTicketId(ticketThree);
        userTicketEntity3.setDateOpened(new Date());
        userTicketEntity3.setPriorityType(priorityThree);
        userTicketEntity3.setCaseOwner(caseOwnerThree);
        // -------------------------------------------------------------------------------
        logger.debug("creatingTicket3 STARTING");
        UserTicketEntity userTicketEntity4 = new UserTicketEntity();
        userTicketEntity = new UserTicketEntity();
        long ticketFour = 4;
        String priorityFour = "LOW";
        String caseOwnerFour = "Last Test";
        userTicketEntity4.setTicketId(ticketFour);
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
    	CustomerInformationEntity customer = new CustomerInformationEntity();
    	long _customerId=1;
    	customer.setCustomerId(_customerId);
    	//customer.setCustomerName("TEST1");
    	//customer.setCustomerEmail("test@test1.com");
    	//customer.setCustomerPhone("111111");
    	//customer.setCompanyName("TEST");
    	//customer.setPriorityLevel("HIGH");
    	
    	ticket.setCustomerId(customer);
        ticket.setTicketId(1);
        ticket.setOpen(true);
        ticket.setDateOpened(new Date());
        //ticket.setPriorityType(_priority);
        //ticket.setCaseOwner(_caseOwner);
        ticket.setLastModified(new Date());
        //ticket.setStatus("OPEN");
        
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
        CustomerInformationEntity customer = new CustomerInformationEntity();
        customer.setCustomerId(4);
        ticket.setCustomerId(customer);
        ticket.setTicketId(8);
        ticket.setDateOpened(new Date());
        ticket.setPriorityType("MEDIUM");
        ticket.setCaseOwner("THOLMES");
        ticket.setLastModified(new Date());
        ticket = userTicketDao.createUserTicketEntity(ticket);
        assertNotNull(ticket);
        long ticketId = 8;
        if (ticket != null)
        {
            ticketId = ticket.getTicketId();
        }

        // ------------------------------------------------------------------------------
        UserTicketEntity userTicket = userTicketDao.getUserTicketEntity(8);
        // ------------------------------------------------------------------------------
        assertEquals(userTicket.getPriorityType(), "HIGH");
        assertEquals(userTicket.getCaseOwner(), "THOLMES");
        // ------------------------------------------------------------------------------
        System.out.println("retreiveTicketById: userTicket = " + userTicket.toString());
        System.out.println("retreiveTicketById: retreiveTicketById: FINISH");
    }    
    @Test
    public void testDeleteTicket() throws Exception
    {
    	long _ticket=2;
        UserTicketEntity ticket = userTicketDao.getUserTicketEntity(_ticket);
        assertNotNull(ticket);
        System.out.println("testDeleteTicket: START");
        // ------------------------------------------------------------------------------
        userTicketDao.deleteUserTicketEntity(ticket);
        System.out.println("testDeleteTicket: ticket deleted");
        // ------------------------------------------------------------------------------
        System.out.println("testDeleteTicket: FINISHED");
        // ------------------------------------------------------------------------------
        long _ticketNumber = 1;
        UserTicketEntity ticketTwo = userTicketDao.getUserTicketEntity(_ticketNumber);
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
        int updateTicket = 3;
        String updatePriority = "HIGH";
        String updateCaseOwner = "RyanTest";
        // ------------------------------------------------------------------------------
        UserTicketEntity tickets = userTicketDao.getUserTicketEntity(Id);

        CustomerInformationEntity customer = new CustomerInformationEntity();
        customer.setCustomerId(4);
        assertNotNull(tickets);    
        tickets.setDateOpened(new Date());
        tickets.setTicketId(updateTicket);
        tickets.setCaseOwner(updateCaseOwner);
        tickets.setPriorityType(updatePriority);
        tickets.setCustomerId(customer);
        
        System.out.println("testTicketUpdate: " + tickets.toString());
        // -----------------------------------------------------------------------------
        // -----------------------------------------------------------------------------
        tickets = userTicketDao.updateUserTicketEntity(tickets);
        assertEquals(tickets.getTicketId(), updateTicket);
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
    @Test
    public void testFetchTicketEntitiesByCustomerId()
    {
    	CustomerInformationEntity customer = new CustomerInformationEntity();
    	long _customerId=4;
    	customer.setCustomerId(_customerId);
    	//userTicketDao.getUserTicketEntitiesByCustomerID(customer);
    	System.out.println("testFetchTicketEntitiesByCustomerId : START");
    	// -------------------------------------------------------------------------------------------
    	List<UserTicketEntity> customerId = userTicketDao.getUserTicketEntitiesByCustomerID(customer);
    	if(customerId != null)
    	{
    		System.out.println("testFetchTicketEntitiesByCustomerId : size=" + customerId.size());
    	}
    	assertNotNull(customer);
    	assertNotNull(_customerId);
    	System.out.println("tetFetchTicketEntitiesByCustomerId : FINISH");
    }
    @Test
    public void testSaveTicketEntity()
    {
    	System.out.println("testSaveTicketEntity : START");
    	String _testOwner = "AAA";
    	String _setPriorityTypeOne = "BBB";
    	long _ticketNumber = 6;
    	// ------------------------------------------------------------------------------------
    	UserTicketEntity userTicketOne = new UserTicketEntity();
    	userTicketOne.setCaseOwner(_testOwner);
    	userTicketOne.setDateOpened(new Date());
    	userTicketOne.setPriorityType(_setPriorityTypeOne);
    	userTicketOne.setTicketId(_ticketNumber);
    	userTicketOne = userTicketDao.saveUserTicketEntity(userTicketOne);
    	assertNotNull(userTicketOne);
    	System.out.println(userTicketOne.toString());
    	// ------------------------------------------------------------------------------------
    	String _testOwnerTwo = "TEST";
    	String _setPriorityTypeTwo = "LOW";
    	long _ticketNumberTwo = 7;
    	UserTicketEntity userTicketTwo = new UserTicketEntity();
    	userTicketTwo.setCaseOwner(_testOwnerTwo);
    	userTicketTwo.setDateOpened(new Date());
    	userTicketTwo.setPriorityType(_setPriorityTypeTwo);
    	userTicketTwo.setTicketId(_ticketNumberTwo);
    	userTicketTwo = userTicketDao.saveUserTicketEntity(userTicketTwo);
    	assertNotNull(userTicketTwo);
    	System.out.println(userTicketTwo.toString());
    	// ------------------------------------------------------------------------------------
    	String _testOwnerThree = "THOLMES";
    	String _setPriorityTypeThree = "HIGH";
    	long _ticketNumberThree = 8;
    	UserTicketEntity userTicketThree = new UserTicketEntity();
    	userTicketThree.setCaseOwner(_testOwnerThree);
    	userTicketThree.setDateOpened(new Date());
    	userTicketThree.setPriorityType(_setPriorityTypeThree);
    	userTicketThree.setTicketId(_ticketNumberThree);
    	userTicketThree = userTicketDao.saveUserTicketEntity(userTicketThree);
    	assertNotNull(userTicketThree);
    	System.out.println(userTicketThree.toString());
    	// -------------------------------------------------------------------------------------
    	System.out.println("testSaveTicketEntity : FINISH");
    }
}
