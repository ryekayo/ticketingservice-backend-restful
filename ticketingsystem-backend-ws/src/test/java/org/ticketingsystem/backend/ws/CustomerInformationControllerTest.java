package org.ticketingsystem.backend.ws;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ticketingsystem.entity.CustomerInformationEntity;

public class CustomerInformationControllerTest extends BaseControllerTests {

	private final static Log logger = LogFactory.getLog(CustomerInformationControllerTest.class);
	
	private CustomerInformationEntity createCustomerEntity()
	{
		CustomerInformationEntity customer =  new CustomerInformationEntity();
		//---------------------------------------------------------------------------------------
		long _customerId = 1;
		String _customerName = "Michael Jordan";
		String _customerEmail = "mjordan@bulls.com";
		String _customerPhone = "111-111-1111";
		String _companyName = "Chicago Bulls";
		String _priority = "HIGH";
		boolean _isEscalated = false;
		customer.setCustomerId(_customerId);
		customer.setCustomerName(_customerName);
		customer.setCustomerEmail(_customerEmail);
		customer.setCompanyName(_companyName);
		customer.setPriorityLevel(_priority);
		customer.setCustomerPhone(_customerPhone);
		customer.setPriorityLevel(_priority);
		customer.setEscalated(_isEscalated);
		//---------------------------------------------------------------------------------------
		return customer;
	}
	@Test
	public void testMockGetCustomerListOne() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/customer/");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockGetCustomerListTwo() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/customer");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockGetCustomerById() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/customer/customerId/1");
		this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockDeleteCustomerById() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/customer/delete/1");
		this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
}
