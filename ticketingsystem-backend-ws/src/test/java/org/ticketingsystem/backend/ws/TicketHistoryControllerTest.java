package org.ticketingsystem.backend.ws;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ticketingsystem.entity.TicketHistoryEntity;
import com.ticketingsystem.entity.UserTicketEntity;

public class TicketHistoryControllerTest extends BaseControllerTests {

	private final static Log logger = LogFactory.getLog(TicketHistoryControllerTest.class);
	
	private TicketHistoryEntity createTicketHistoryEntity()
	{
		TicketHistoryEntity history = new TicketHistoryEntity();
		UserTicketEntity ticket = new UserTicketEntity();
		//---------------------------------------------------------------------------
		long _historyId = 1;
		long _ticketId = 1;
		String _caseOwner = "RKAHIL";
		String _lastModBy = "RKAHIL";
		String _status = "OPEN";
		boolean _isClosed = false;
		boolean _isEscalated = false;
		ticket.setTicketId(_ticketId);
		history.setTicketHistoryId(_historyId);
		history.setTicketNumber(ticket);
		history.setCaseOwner(_caseOwner);
		history.setDateOpened(new Date());
		history.setLastModified(new Date());
		history.setLastModBy(_lastModBy);
		history.setStatusChange(_status);
		history.setClosed(_isClosed);
		history.setEmailTimestamp(new Date());
		history.setDateClosed(new Date());
		history.setEscalated(_isEscalated);
		history.setDateEscalated(new Date());
		//----------------------------------------------------------------------------
		return history;
	}
	@Test
	public void testMockGetTicketHistoryListOne() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/tickethistory/");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockGetTicketHistoryListTwo() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/tickethistory");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockGetTicketHistoryByTicketHistoryId() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/tickethistory/tickethistoryid/1");
		this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockDeleteTicketHistoryByTicketHistoryId() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/tickethistory/delete/1");
		this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
}
