package com.ticketingsystem.dao;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.CaseDescriptionEntity;
import com.ticketingsystem.entity.UserTicketEntity;

public class CaseDescriptionDAOTest extends BaseDAOTests {
	
	final Logger logger = LoggerFactory.getLogger(CaseDescriptionDAOTest.class);
	
	@Autowired
	private CaseDescriptionDAO caseDescriptionDAO;
	
	private long _id = 1;
	private long _ticketId = 1;
	private String _caseDesc = "TESTING1";
	private String _openedBy = "RKAHIL";
	private String _lastModBy = "RKAHIL";
	
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
    private HashSet<CaseDescriptionEntity> createCaseDescription(CaseDescriptionEntity caseDescriptionEntity)
    {
    	HashSet<CaseDescriptionEntity> description = new HashSet<CaseDescriptionEntity>();
    	UserTicketEntity ticketTwo = new UserTicketEntity();
    	logger.debug("createCaseDescription : STARTING");
    	CaseDescriptionEntity caseDecriptionEntity = null;
    	long _idTwo = 2;
    	long _ticketIdTwo = 2;
    	ticketTwo.setTicketId(_ticketIdTwo);
    	String _caseDescTwo = "TESTING2";
    	String _openedByTwo = "RKAHIL";
    	String _lastModifiedBy = "RKAHIL";
    	//-----------------------------------------------------------------------------------------------------
    	caseDescriptionEntity.setId(_idTwo);
    	caseDescriptionEntity.setTicketId(ticketTwo);
    	caseDescriptionEntity.setDescription(_caseDescTwo);
    	caseDescriptionEntity.setLastModified(new Date());
    	caseDescriptionEntity.setOpenedBy(_openedByTwo);
    	caseDescriptionEntity.setLastModifiedBy(_lastModifiedBy);
    	description.add(caseDecriptionEntity);
    	//-----------------------------------------------------------------------------------------------------
    	logger.debug("createCaseDescriptionTwo : STARTING");
    	CaseDescriptionEntity caseDescriptionEntityThree = null;
    	UserTicketEntity ticketThree = new UserTicketEntity();
    	
    	long _idThree = 3;
    	long _ticketIdThree = 3;
    	ticketThree.setTicketId(_ticketIdThree);
    	String _caseDescThree = "TESTING3";
    	String _openedByThree = "THOLMES";
    	String _lastModifiedByThree = "THOLMES";
    	//------------------------------------------------------------------------------------------------------
    	caseDescriptionEntityThree.setId(_idThree);
    	caseDescriptionEntityThree.setTicketId(ticketThree);
    	caseDescriptionEntityThree.setDescription(_caseDescThree);
    	caseDescriptionEntityThree.setLastModified(new Date());
    	caseDescriptionEntityThree.setOpenedBy(_openedByThree);
    	caseDescriptionEntityThree.setLastModifiedBy(_lastModifiedByThree);
    	description.add(caseDescriptionEntityThree);
    	//-----------------------------------------------------------------------------------------------------------
    	logger.debug("createCaseDescriptionThree : STARTING");
    	CaseDescriptionEntity caseDescriptionEntityFour = null;
    	UserTicketEntity ticketFour = new UserTicketEntity();
    	
    	long _idFour = 4;
    	long _ticketIdFour = 4;
    	ticketFour.setTicketId(_ticketIdFour);
    	String _caseDescFour = "TESTING4";
    	String _openedByFour = "RKAHIL";
    	String _lastModifiedByFour = "THOLMES";
    	//-----------------------------------------------------------------------------------------------------------
    	caseDescriptionEntityFour.setId(_idFour);
    	caseDescriptionEntityFour.setTicketId(ticketFour);
    	caseDescriptionEntityFour.setDescription(_caseDescFour);
    	caseDescriptionEntityFour.setOpenedBy(_openedByFour);
    	caseDescriptionEntityFour.setLastModified(new Date());
    	caseDescriptionEntityFour.setLastModifiedBy(_lastModifiedByFour);
    	description.add(caseDescriptionEntityFour);
    	logger.debug("FINISHED TESTING");
    	return description;
    }
    @Test
    public void testCaseDescriptionEntitySave()
    {
    	System.out.println("testCaseDescriptionEntitySave : STARTING");
    	
    	UserTicketEntity ticketOne = new UserTicketEntity();
    	long _id = 1;
        long _ticketId = 1;
    	String _caseDesc = "TESTING1";
    	String _openedBy = "RKAHIL";
    	String _lastModBy = "RKAHIL";
    	ticketOne.setTicketId(_ticketId);
    	//----------------------------------------------------------------------------------------------------------
    	CaseDescriptionEntity caseDescriptionOne = new CaseDescriptionEntity();
    	caseDescriptionOne.setId(_id);
    	caseDescriptionOne.setTicketId(ticketOne);
    	caseDescriptionOne.setDescription(_caseDesc);
    	caseDescriptionOne.setOpenedBy(_openedBy);
    	caseDescriptionOne.setLastModified(new Date());
    	caseDescriptionOne.setLastModifiedBy(_lastModBy);
    	assertNotNull(caseDescriptionOne);
    	caseDescriptionOne = caseDescriptionDAO.saveCaseDescriptionEntity(caseDescriptionOne);
    	System.out.println("caseDescriptionOne: " + caseDescriptionOne.toString());
    	//----------------------------------------------------------------------------------------------------------
    	UserTicketEntity ticketTwo = new UserTicketEntity();
    	long _idTwo = 2;
    	long _ticketIdTwo = 2;
    	String _caseDescTwo = "TESTING2";
    	String _openedByTwo = "THOLMES";
    	String _lastModByTwo = "RKAHIL";
    	ticketTwo.setTicketId(_ticketIdTwo);
    	//-----------------------------------------------------------------------------------------------------------
    	CaseDescriptionEntity caseDescriptionTwo = new CaseDescriptionEntity();
    	caseDescriptionTwo.setId(_idTwo);
    	caseDescriptionTwo.setTicketId(ticketTwo);
    	caseDescriptionTwo.setDescription(_caseDescTwo);
    	caseDescriptionTwo.setOpenedBy(_openedByTwo);
    	caseDescriptionTwo.setLastModified(new Date());
    	caseDescriptionTwo.setLastModifiedBy(_lastModByTwo);
    	caseDescriptionTwo = caseDescriptionDAO.saveCaseDescriptionEntity(caseDescriptionTwo);
    	System.out.println("caseDescriptionTwo: " + caseDescriptionTwo.toString());
    	//---------------------------------------------------------------------------------------------------------------
    	UserTicketEntity ticketThree = new UserTicketEntity();
    	long _idThree = 3;
    	long _ticketIdThree = 3;
    	String _caseDescThree = "TESTING3";
    	String _openedByThree = "THOLMES";
    	String _lastModByThree = "THOLMES";
    	ticketThree.setTicketId(_ticketIdThree);
    	//------------------------------------------------------------------------------------------------------------------
    	CaseDescriptionEntity caseDescriptionThree = new CaseDescriptionEntity();
    	caseDescriptionThree.setId(_idThree);
    	caseDescriptionThree.setTicketId(ticketThree);
    	caseDescriptionThree.setDescription(_caseDescThree);
    	caseDescriptionThree.setOpenedBy(_openedByThree);
    	caseDescriptionThree.setLastModified(new Date());
    	caseDescriptionThree.setLastModifiedBy(_lastModByThree);
    	caseDescriptionThree = caseDescriptionDAO.saveCaseDescriptionEntity(caseDescriptionThree);
    	System.out.println("caseDescriptionThree: " + caseDescriptionThree.toString());
    	//-------------------------------------------------------------------------------------------------------------------
    	System.out.println("testCaseDescriptionEntitySave : FINISHED");
    }
    @Test
    public void testCreateDescriptionEntity()
    {
    	System.out.println("testCreateDescriptionEntity: STARTING");
    	
    	CaseDescriptionEntity caseDescription = new CaseDescriptionEntity();
    	UserTicketEntity ticketOne = new UserTicketEntity();
    	long _id = 1;
        long _ticketId = 5;
    	String _caseDesc = "TESTING1";
    	String _openedBy = "RKAHIL";
    	String _lastModBy = "RKAHIL";
    	ticketOne.setTicketId(_ticketId);
    	//------------------------------------------------------------------------------------------------------------------
    	caseDescription.setId(_id);
    	caseDescription.setTicketId(ticketOne);
    	caseDescription.setDescription(_caseDesc);
    	caseDescription.setOpenedBy(_openedBy);
    	caseDescription.setLastModified(new Date());
    	caseDescription.setLastModifiedBy(_lastModBy);
    	//---------------------------------------------------------------------------------------------------------------------
    	System.out.println("testCreateDescriptionEntity : " + caseDescription.toString());
    	System.out.println("testCreateDescriptionEntity : START: CREATE");
    	assertNotNull(caseDescription);
    	caseDescription = caseDescriptionDAO.createCaseDescriptionEntity(caseDescription);
    	System.out.println("caseDescription : FINISHED");
    }
}
