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
import com.ticketingsystem.entity.EscalationStatusEntity;

public class EscalationStatusControllerTest extends BaseControllerTests {

	private final static Log logger = LogFactory.getLog(EscalationStatusControllerTest.class);
	
	private EscalationStatusEntity createEscalationStatusEntity()
	{
		EscalationStatusEntity escalation = new EscalationStatusEntity();
		UserTicketEntity ticket = new UserTicketEntity();
		//------------------------------------------------------------------------------------
		long _escalationId = 1;
		long _ticketId = 6;
		boolean _isEscalated = true;
		String _assignedTo = "RKAHIL";
		String _notes = "TEST1";
		ticket.setTicketId(_ticketId);
		escalation.setId(_escalationId);
		escalation.setTicketId(ticket);
		escalation.setEscalated(_isEscalated);
		escalation.setDateEscalated(new Date());
		escalation.setAssignedTo(_assignedTo);
		escalation.setNotes(_notes);
		//------------------------------------------------------------------------------------
		return escalation;
	}
	@Test
	public void testMockGetEscalationListOne() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/escalationstatus/");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockGetEscalationListTwo() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/escalationstatus");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockGetEscalatonStatusByEscalationId() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/escalationstatus/escalationid/1");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockDeleteEscalationStatusByEscalationId() throws Exception
	{
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/escalationstatus/delete/1");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
}
