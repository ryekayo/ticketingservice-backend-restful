package com.ticketingsystem.dao;

import java.util.HashSet;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.CustomerInformationEntity;

public class CustomerInformationDAOTest extends BaseDAOTests {

	final Logger logger = LoggerFactory.getLogger(UserTicketDAOTest.class);
	
	@Autowired
	private CustomerInformationDAO customerInformationDao;
	
	private long _customerId = 1;
	private String _customerName = "Michael Jordan";
	private String _customerEmail = "mjordan@bulls.com";
	private String _customerPhone = "111-111-1111";
	private String _customerCompany = "Chicago Bulls";
	private String _priority = "HIGH";
	private boolean isEscalated = false;
	
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
    private HashSet<CustomerInformationEntity> createCustomer(CustomerInformationEntity customerInformationEntiy)
    {
    	HashSet<CustomerInformationEntity> customer = new HashSet<CustomerInformationEntity>();
    	logger.debug("createCustomer STARTING");
    	CustomerInformationEntity customerInformationEntity = null;
    	long _customerIdTwo = 2;
    	String _customerNameTwo = "Larry Bird";
    	String _customerEmailTwo = "lbird@celtics.com";
    	String _customerPhoneTwo = "222-222-2222";
    	String _customerCompanyTwo = "Boston Celtics";
    	String _priorityTwo = "MEDIUM";
    	boolean _isEscalatedTwo = true;
    	//----------------------------------------------------------------------------------------------
    	customerInformationEntity.setCustomerId(_customerIdTwo);
    	customerInformationEntity.setCustomerName(_customerNameTwo);
    	customerInformationEntity.setCustomerEmail(_customerEmailTwo);
    	customerInformationEntity.setCustomerPhone(_customerPhoneTwo);
    	customerInformationEntity.setCompanyName(_customerCompanyTwo);
    	customerInformationEntity.setPriorityLevel(_priorityTwo);
    	customerInformationEntity.setEscalated(_isEscalatedTwo);
    	customer.add(customerInformationEntity);
    	//----------------------------------------------------------------------------------------------
    	logger.debug("createCustomerTwo STARTING");
    	CustomerInformationEntity customerInformationEntityTwo = null;
    	long _customerIdThree = 3;
    	String _customerNameThree = "Kobe Bryant";
    	String _customerEmailThree = "lbird@lakers.com";
    	String _customerPhoneThree = "333-333-3333";
    	String _customerCompanyThree = "LA Lakers";
    	String _priorityThree = "LOW";
    	boolean _isEscalatedThree = false;
    	//----------------------------------------------------------------------------------------------
    	customerInformationEntityTwo.setCustomerId(_customerIdThree);
    	customerInformationEntityTwo.setCustomerName(_customerNameThree);
    	customerInformationEntityTwo.setCustomerEmail(_customerEmailThree);
    	customerInformationEntityTwo.setCustomerPhone(_customerPhoneThree);
    	customerInformationEntityTwo.setCompanyName(_customerCompanyThree);
    	customerInformationEntityTwo.setPriorityLevel(_priorityThree);
    	customerInformationEntity.setEscalated(_isEscalatedThree);
    	customer.add(customerInformationEntityTwo);
    	//----------------------------------------------------------------------------------------------
    	logger.debug("createCustomerThree STARTING");
    	CustomerInformationEntity customerInformationEntityThree = null;
    	long _customerIdFour = 4;
    	String _customerNameFour = "Tom Brady";
    	String _customerEmailFour = "tbrady@patriots.com";
    	String _customerPhoneFour = "444-444-4444";
    	String _customerCompanyFour = "NE Patriots";
    	String _priorityFour = "HIGH";
    	boolean _isEscalatedFour = true;
    	//-----------------------------------------------------------------------------------------------
    	customerInformationEntityThree.setCustomerId(_customerIdFour);
    	customerInformationEntityThree.setCustomerName(_customerNameFour);
    	customerInformationEntityThree.setCustomerEmail(_customerEmailFour);
    	customerInformationEntityThree.setCustomerPhone(_customerPhoneFour);
    	customerInformationEntityThree.setCompanyName(_customerCompanyFour);
    	customerInformationEntityThree.setPriorityLevel(_priorityFour);
    	customerInformationEntityThree.setEscalated(_isEscalatedFour);
    	customer.add(customerInformationEntityThree);
    	logger.debug("FINISHED TESTING");
    	return customer;
    }
    @Test
    public void testCustomerEntitySave()
    {
    	System.out.println("testCustomerEntitySave : START");
    	long _customerIdTwo = 2;
    	String _customerNameTwo = "Larry Bird";
    	String _customerEmailTwo = "lbird@celtics.com";
    	String _customerPhoneTwo = "222-222-2222";
    	String _customerCompanyTwo = "Boston Celtics";
    	String _priorityTwo = "MEDIUM";
    	boolean _isEscalatedTwo = true;
    	//----------------------------------------------------------------------------------------------
    	CustomerInformationEntity customerInformationEntityOne = new CustomerInformationEntity();
    	customerInformationEntityOne.setCustomerId(_customerIdTwo);
    	customerInformationEntityOne.setCustomerName(_customerNameTwo);
    	customerInformationEntityOne.setCustomerEmail(_customerEmailTwo);
    	customerInformationEntityOne.setCompanyName(_customerCompanyTwo);
    	customerInformationEntityOne.setCustomerPhone(_customerPhoneTwo);
    	customerInformationEntityOne.setPriorityLevel(_priorityTwo);
    	customerInformationEntityOne.setEscalated(_isEscalatedTwo);
    	assertNotNull(customerInformationEntityOne);
    	customerInformationEntityOne = customerInformationDao.saveCustomerInformationEntity(customerInformationEntityOne);
    	System.out.println(customerInformationEntityOne.toString());
    	//----------------------------------------------------------------------------------------------
    	long _customerIdThree = 3;
    	String _customerNameThree = "Kobe Bryant";
    	String _customerEmailThree = "lbird@lakers.com";
    	String _customerPhoneThree = "333-333-3333";
    	String _customerCompanyThree = "LA Lakers";
    	String _priorityThree = "LOW";
    	boolean _isEscalatedThree = false;
    	//----------------------------------------------------------------------------------------------
    	CustomerInformationEntity customerInformationEntityTwo = new CustomerInformationEntity();
    	customerInformationEntityTwo.setCustomerId(_customerIdThree);
    	customerInformationEntityTwo.setCompanyName(_customerCompanyThree);
    	customerInformationEntityTwo.setCustomerName(_customerNameThree);
    	customerInformationEntityTwo.setCustomerEmail(_customerEmailThree);
    	customerInformationEntityTwo.setCustomerPhone(_customerPhoneThree);
    	customerInformationEntityTwo.setPriorityLevel(_priorityThree);
    	customerInformationEntityTwo.setEscalated(_isEscalatedThree);
    	assertNotNull(customerInformationEntityTwo);
    	customerInformationEntityTwo = customerInformationDao.saveCustomerInformationEntity(customerInformationEntityTwo);
    	System.out.println(customerInformationEntityTwo.toString());
    	//----------------------------------------------------------------------------------------------
    	long _customerIdFour = 4;
    	String _customerNameFour = "Tom Brady";
    	String _customerEmailFour = "tbrady@patriots.com";
    	String _customerPhoneFour = "444-444-4444";
    	String _customerCompanyFour = "NE Patriots";
    	String _priorityFour = "HIGH";
    	boolean _isEscalatedFour = true;
    	//-----------------------------------------------------------------------------------------------
    	CustomerInformationEntity customerInformationEntityThree = new CustomerInformationEntity();
    	customerInformationEntityThree.setCustomerId(_customerIdFour);
    	customerInformationEntityThree.setCustomerName(_customerNameFour);
    	customerInformationEntityThree.setCustomerEmail(_customerEmailFour);
    	customerInformationEntityThree.setCustomerPhone(_customerPhoneFour);
    	customerInformationEntityThree.setCompanyName(_customerCompanyFour);
    	customerInformationEntityThree.setPriorityLevel(_priorityFour);
    	customerInformationEntityThree.setEscalated(_isEscalatedFour);
    	assertNotNull(customerInformationEntityThree);
    	customerInformationEntityThree = customerInformationDao.saveCustomerInformationEntity(customerInformationEntityThree);
    	System.out.println(customerInformationEntityThree.toString());
    	//--------------------------------------------------------------------------------------------------
    	System.out.println("testSaveCustomerInformationEntity : FINISH");
    }
    @Test
    public void testCustomerEntityCreate()
    {
    	System.out.println("testCustomerEntityCreate : STARTING");
    	CustomerInformationEntity customerInformationEntity = new CustomerInformationEntity();
    	
    	long _customerId = 1;
    	String _customerName = "Michael Jay";
    	String _customerEmail = "mjordan@whitesox.com";
    	String _customerPhone = "555-555-5555";
    	String _customerCompany = "Chicago WhiteSox";
    	String _priority = "HIGH";
    	boolean isEscalated = false;
    	
    	customerInformationEntity.setCustomerId(_customerId);
    	customerInformationEntity.setCustomerName(_customerName);
    	customerInformationEntity.setCustomerEmail(_customerEmail);
    	customerInformationEntity.setCustomerPhone(_customerPhone);
    	customerInformationEntity.setCompanyName(_customerCompany);
    	customerInformationEntity.setPriorityLevel(_priority);
    	customerInformationEntity.setEscalated(isEscalated);
    	System.out.println("testCustomerEntityCreate : " + customerInformationEntity.toString());
    	System.out.println("testCustomerEntityCreate : START: CREATE");
    	//---------------------------------------------------------------------------------------------------------
    	assertNotNull(customerInformationEntity);
    	customerInformationEntity = customerInformationDao.createCustomerInformationEntity(customerInformationEntity);
    	System.out.println("testCustomerEntityCreate : FINISHED");
    }
    @Test
    public void testUpdateCustomer()
    {
    	System.out.println("testUpdateCustomer : START");
    	CustomerInformationEntity customerInformationEntity = new CustomerInformationEntity();
    	//------------------------------------------------------------------------------------------------------------
    	long _customerId = 1;
    	String _customerName = "Michael Jay";
    	String _customerEmail = "mjordan@whitesox.com";
    	String _customerPhone = "555-555-5555";
    	String _customerCompany = "Chicago WhiteSox";
    	String _priority = "HIGH";
    	boolean isEscalated = false;
    	//----------------------------------------------------------------------------------------------------
    	customerInformationEntity.setCustomerId(_customerId);
    	customerInformationEntity.setCustomerName(_customerName);
    	customerInformationEntity.setCustomerEmail(_customerEmail);
    	customerInformationEntity.setCustomerPhone(_customerPhone);
    	customerInformationEntity.setCompanyName(_customerCompany);
    	customerInformationEntity.setPriorityLevel(_priority);
    	customerInformationEntity.setEscalated(isEscalated);   	
    	System.out.println("testUpdateCustomer: " + customerInformationEntity.toString());
    	//-----------------------------------------------------------------------------------------------
    	customerInformationEntity = customerInformationDao.updateCustomerInformationEntity(customerInformationEntity);
    	System.out.println("testUpdateCustomer : FINISHED");   	   	
    }
}
