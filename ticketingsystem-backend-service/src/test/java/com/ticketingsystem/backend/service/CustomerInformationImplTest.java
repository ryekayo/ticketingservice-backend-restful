package com.ticketingsystem.backend.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.CustomerInformationEntity;

public class CustomerInformationImplTest extends BaseServiceImplTests {
	
	private static final Log logger = LogFactory.getLog(CustomerInformationImplTest.class);
	
	@Autowired
	private CustomerInformationService service;
	
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
	
	private CustomerInformationEntity createCustomerInformationEntity()
	{
		CustomerInformationEntity customer = new CustomerInformationEntity();
		long _customerId = 1;
		String _customerName = "Michael Jordan";
		String _emailAddress = "mjordan@bulls.com";
		String _customerPhone = "111-111-1111";
		String _companyName = "Chicago Bulls";
		String _priority = "HIGH";
		boolean _escalated = false;
		customer.setCustomerId(_customerId);
		customer.setCustomerName(_customerName);
		customer.setCustomerEmail(_emailAddress);
		customer.setCustomerPhone(_customerPhone);
		customer.setCompanyName(_companyName);
		customer.setPriorityLevel(_priority);
		customer.setEscalated(_escalated);
		return customer;
	}
	
	@Test
	public void testFetchGetAllCustomerInformation()
	{
		System.out.println("testFetchGetAllCustomerInformation : STARTING");
		List<CustomerInformationEntity> customer = service.getAllCustomerInformation();
		if(customer != null)
		{
			System.out.println("testFetchGetAllCustomerInformation: " + customer.toString());
		}
		assertNotNull(customer);
		System.out.println("testFetchGetAllCustomerInformation : FINISHED");
	}
	@Test
	public void testFetchGetEmailHistoryById()
	{
		System.out.println("testFetchGetEmailHistoryById : STARTING");
		long _customerId = 1;
		assertNotNull(_customerId);
		service.getEmailHistoryById(_customerId);
		System.out.println("testFetchGetEmailHistoryById: " + _customerId);
		System.out.println("testFetchGetEmailHistoryById : FINISHED");
	}
	@Test
	public void testAddCustomerInformationEntity()
	{
		System.out.println("testAddCustomerInformationEntity : STARTING");
		CustomerInformationEntity customer = new CustomerInformationEntity();
		long _customerId = 5;
		String _customerName = "test";
		String _customerEmail = "test";
		String _customerPhone = "test";
		String _companyName = "test";
		String _priority = "test";
		boolean _escalated = true;
		customer.setCustomerId(_customerId);
		customer.setCustomerName(_customerName);
		customer.setCustomerEmail(_customerEmail);
		customer.setCustomerPhone(_customerPhone);
		customer.setCompanyName(_companyName);
		customer.setPriorityLevel(_priority);
		customer.setEscalated(_escalated);
		assertNotNull(customer);
		System.out.println("testAddCustomerInformationEntity: " + customer.toString());
		System.out.println("testAddCustomerInformationEntity : FINISHED");
	}
	@Test
	public void testUpdateCustomerInformationEntity()
	{
		System.out.println("testUpdateCustomerInformationEntity : STARTING");
		CustomerInformationEntity customer = new CustomerInformationEntity();
		long _customerId = 1;
		String _customerName = "test";
		String _customerEmail = "test";
		String _customerPhone = "test";
		String _companyName = "test";
		String _priority = "test";
		boolean _escalated = true;
		customer.setCustomerId(_customerId);
		customer.setCustomerName(_customerName);
		customer.setCustomerEmail(_customerEmail);
		customer.setCustomerPhone(_customerPhone);
		customer.setCompanyName(_companyName);
		customer.setPriorityLevel(_priority);
		customer.setEscalated(_escalated);
		assertNotNull(customer);
		System.out.println("testUpdateCustomerInformationEntity: " + customer.toString());
		System.out.println("testUpdateCustomerInformationEntity : FINISHED");
	}
	@Test
	public void testDeleteCustomerInformationEntity()
	{
		System.out.println("testDeleteCustomerInformationEntity : STARTING");
		CustomerInformationEntity customer = new CustomerInformationEntity();
		long _customerIdOne = 1;
		customer.setCustomerId(_customerIdOne);
		assertNotNull(customer);
		//--------------------------------------------------------------------
		System.out.println("testDeleteCustomerInformationEntityOne : START");
		service.remove(customer);
		System.out.println("testDeleteCustomerInformationEntityOne : DELETED");
		//---------------------------------------------------------------------
		long _customerIdTwo = 2;
		assertNotNull(_customerIdTwo);
		//--------------------------------------------------------------------
		System.out.println("testDeleteCustomerInformationEntityTwo : START");
		service.remove(_customerIdTwo);
		System.out.println("testDeleteCustomerInformationEntityTwo : DELETED");
		//--------------------------------------------------------------------
		System.out.println("testDeleteCustomerInformationEntity : FINISHED");	
	}
}
