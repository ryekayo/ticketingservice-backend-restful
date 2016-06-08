package org.ticketingsystem.backend.ws;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ticketingsystem.entity.CaseDescriptionEntity;
import com.ticketingsystem.entity.UserTicketEntity;

public class CaseDescriptionControllerTest extends BaseControllerTests {
	
	private final static Log logger = LogFactory.getLog(CaseDescriptionControllerTest.class);
	
	private CaseDescriptionEntity createCaseDescription()
	{
		CaseDescriptionEntity description = new CaseDescriptionEntity();
		UserTicketEntity ticket = new UserTicketEntity();
		//-----------------------------------------------------------------------------------
		long _id = 1;
		long _ticketId = 1;
		String _descripton = "TESTING";
		String _openedBy = "RKAHIL";
		String _lastModBy = "RKAHIL";
		ticket.setTicketId(_ticketId);
		description.setId(_id);
		description.setTicketId(ticket);
		description.setDescription(_descripton);
		description.setLastModified(new Date());
		description.setOpenedBy(_openedBy);
		description.setLastModifiedBy(_lastModBy);
		//----------------------------------------------------------------------------------
		return description;
	}
	@Test
	public void testMockGetCaseDescriptionList() throws Exception
	{
	    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/casedescription");
            this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockGetCaseDescriptionListTwo() throws Exception
	{
	    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/casedescription/");
            this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
	@Test
	public void testMockDeleteCaseDecription() throws Exception
	{
	    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/casedescription/delete/1");
	    this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
	}
}
