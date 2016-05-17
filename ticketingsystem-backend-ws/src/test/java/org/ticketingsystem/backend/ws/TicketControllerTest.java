package org.ticketingsystem.backend.ws;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ticketingsystem.entity.UserTicketEntity;
import com.ticketingsystem.entity.CustomerInformationEntity;

public class TicketControllerTest extends BaseControllerTests {

	private final static Log logger = LogFactory.getLog(TicketControllerTest.class);
	
	private UserTicketEntity createUserTicketEntity()
	{
		UserTicketEntity userTicket = new UserTicketEntity();
		CustomerInformationEntity customerInfo = new CustomerInformationEntity();
		//-------------------------------------------------------------------------------------
		long _ticketId = 1;
		long _customerId = 1;
		String _priority = "HIGH";
		String _caseOwner = "RKAHIL";
		String _status = "OPEN";
		boolean _isOpen = true;
		customerInfo.setCustomerId(_customerId);
		userTicket.setTicketId(_ticketId);
		userTicket.setCustomerId(customerInfo);
		userTicket.setDateOpened(new Date());
		userTicket.setLastModified(new Date());
		userTicket.setCaseOwner(_caseOwner);
		userTicket.setStatus(_status);
		userTicket.setPriorityType(_priority);
		userTicket.setOpen(_isOpen);
		//-------------------------------------------------------------------------------------
		return userTicket;
	}
	@Test
	public void testMockGetTicketListOne() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/tickets/");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockGetTicketListTwo() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/tickets");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockGetTicketByTicketId() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/tickets/ticketId/1");
		this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockDeleteTicketByTicketId() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/tickets/delete/1");
		this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
}
