package org.ticketingsystem.backend.ws;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ticketingsystem.entity.EmailHistoryEntity;
import com.ticketingsystem.entity.UserTicketEntity;
import com.ticketingsystem.entity.UserEntity;

public class EmailHistoryControllerTest extends BaseControllerTests {

	private final static Log logger = LogFactory.getLog(EmailHistoryControllerTest.class);
	
	private EmailHistoryEntity createEmailHistoryEntity()
	{
		EmailHistoryEntity history = new EmailHistoryEntity();
		UserTicketEntity ticket = new UserTicketEntity();
		UserEntity user = new UserEntity();
		//---------------------------------------------------------------------------------
		long _emailHistoryId = 2;
		long _ticketId = 1;
		long _userId = 1;
		String _emailSent = "THISISATEST";
		String _fromEmail = "rkahil@test.com";
		String _toEmail = "mjordan@bulls.com";
		ticket.setTicketId(_ticketId);
		user.setUserId(_userId);
		history.setEmailHistoryId(_emailHistoryId);
		history.setTicketNumber(ticket);
		history.setUserId(user);
		history.setEmailTimestamp(new Date());
		history.setEmailSent(_emailSent);
		history.setFromEmail(_fromEmail);
		history.setToEmail(_toEmail);
		//---------------------------------------------------------------------------------
		return history;
	}
	@Test
	public void testMockGetEmailHistoryListOne() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/emailhistory/");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockGetEmailHistoryListTwo() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/emailhistory");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockGetEmailHistoryByEmailHistoryId() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/emailhistory/emailhistoryid/2");
	    this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockDeleteEmailHistoryByEmailHistoryId() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/emailhistory/delete/2");
		this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
}
