package com.ticketingsystem.backend.service;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.CaseDescriptionEntity;
import com.ticketingsystem.entity.UserTicketEntity;

public class CaseDescriptionImplTest extends BaseServiceImplTests{

	private static final Log logger = LogFactory.getLog(CaseDescriptionImplTest.class);
	
	@Autowired
	private CaseDescriptionService service;
	
	private CaseDescriptionEntity createCaseDescriptionEntity()
	{
		CaseDescriptionEntity caseDescription = new CaseDescriptionEntity();
		UserTicketEntity ticket = new UserTicketEntity();
		long _caseId = 1;
		long _ticketId = 1;
		String _description = "TESTING1";
		String _openedBy = "RKAHIL";
		String _lastModifiedBy = "RKAHIL";
		ticket.setTicketId(_ticketId);
		caseDescription.setId(_caseId);
		caseDescription.setTicketId(ticket);
		caseDescription.setDescription(_description);
		caseDescription.setOpenedBy(_openedBy);
		caseDescription.setLastModified(new Date());
		caseDescription.setLastModifiedBy(_lastModifiedBy);
		return caseDescription;
	}
	@Test
	public void testFetchGetAllCaseDescription()
	{
		System.out.println("getAllCaseDescription : STARTING");
		List<CaseDescriptionEntity> caseDescription = service.getAllCaseDescription();
		if(caseDescription != null)
		{
			System.out.println("getAllCaseDescription: " + caseDescription.toString());
		}
		assertNotNull(caseDescription);
		System.out.println("getAllCaseDescription : FINISHED");		
	}
	@Test
	public void testFetchGetCaseDescriptionById()
	{
		System.out.println("testFetchGetCaseDescriptionById : STARTING");
		long _caseId = 1;
		assertNotNull(_caseId);
		service.getCaseDescriptionById(_caseId);
		System.out.println("testFetchGetCaseDescriptionById: " + _caseId);
		System.out.println("testFetchGetCaseDescriptionById : FINISHED");
	}
	@Test
	public void testAddCaseDescriptionEntity()
	{
		System.out.println("testAddCaseDescriptionEntity : STARTING");
		CaseDescriptionEntity caseDesc = new CaseDescriptionEntity();
		UserTicketEntity ticket = new UserTicketEntity();
		long _caseId = 5;
		long _ticketId = 5;
		String _description = "test";
		String _openedBy = "test";
		String _lastModBy = "test";
		ticket.setTicketId(_ticketId);
		caseDesc.setId(_caseId);
		caseDesc.setTicketId(ticket);
		caseDesc.setDescription(_description);
		caseDesc.setLastModified(new Date());
		caseDesc.setOpenedBy(_openedBy);
		caseDesc.setLastModifiedBy(_lastModBy);
		assertNotNull(caseDesc);
		service.add(caseDesc);
		System.out.println("testAddCaseDescriptionEntity: " + caseDesc.toString());
		System.out.println("testAddCaseDescriptionEntity : FINISHED");
	}
	@Test
	public void testUpdateCaseDescriptionEntity()
	{
		System.out.println("testUpdateCaseDescriptionEntity : STARTING");
		CaseDescriptionEntity caseDesc = new CaseDescriptionEntity();
		UserTicketEntity ticket = new UserTicketEntity();
		long _caseId = 1;
		long _ticketId = 1;
		String _description = "test";
		String _openedBy = "test";
		String _lastModBy = "test";
		ticket.setTicketId(_ticketId);
		caseDesc.setId(_caseId);
		caseDesc.setTicketId(ticket);
		caseDesc.setDescription(_description);
		caseDesc.setLastModified(new Date());
		caseDesc.setOpenedBy(_openedBy);
		caseDesc.setLastModifiedBy(_lastModBy);
		assertNotNull(caseDesc);
		service.update(caseDesc);
		System.out.println("testUpdateCaseDescriptionEntity: " + caseDesc.toString());
		System.out.println("testUpdateCaseDescriptionEntity : FINISHED");				
	}
	@Test
	public void testDeleteCaseDescriptionEntity()
	{
		System.out.println("testDeleteCaseDescriptionEntity : STARTING");
		CaseDescriptionEntity caseDesc = new CaseDescriptionEntity();
		long _caseId = 1;
		caseDesc.setId(_caseId);
		assertNotNull(caseDesc);
		//----------------------------------------------------------------------
		System.out.println("testDeleteCaseDescriptionEntityOne : START");
		service.remove(caseDesc);
		System.out.println("testDeleteCaseDescriptionEntityOne : DELETED");
		//----------------------------------------------------------------------
		long _caseIdTwo = 2;
		assertNotNull(_caseIdTwo);
		//-----------------------------------------------------------------------
		System.out.println("testDeleteCaseDescriptionEntityTwo : START");
		service.remove(_caseIdTwo);
		System.out.println("testDeleteCaseDescriptionEntityTwo : FINISHED");
		//-----------------------------------------------------------------------
		System.out.println("testDeleteCaseDescriptionEntity : FINISHED");
	}
}
