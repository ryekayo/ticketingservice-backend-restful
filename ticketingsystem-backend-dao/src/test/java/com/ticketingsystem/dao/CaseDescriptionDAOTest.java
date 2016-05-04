package com.ticketingsystem.dao;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.entity.CaseDescriptionEntity;
import com.ticketingsystem.entity.CustomerInformationEntity;
import com.ticketingsystem.entity.UserTicketEntity;

public class CaseDescriptionDAOTest extends BaseDAOTests {
	
	final Logger logger = LoggerFactory.getLogger(CaseDescriptionDAOTest.class);
	
	@Autowired
	private CaseDescriptionDAO caseDescriptionDAO;
	
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
    	//caseDescriptionEntity.setId(_idTwo);
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
    	//caseDescriptionEntityThree.setId(_idThree);
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
    	//caseDescriptionEntityFour.setId(_idFour);
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
        long _ticketId = 100;
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
    	long _idTwo = 200;
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
    	long _idThree = 300;
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
    @Test
    public void testUpdateCaseDescriptionEntity()
    {
    	System.out.println("testUpdateCaseDescriptionEntity: STARTING");
    	
    	CaseDescriptionEntity caseDescriptionEntity = new CaseDescriptionEntity();
    	UserTicketEntity userTicketEntity = new UserTicketEntity();
    	long _idTwo = 2;
    	long _ticketIdTwo = 2;
    	String _caseDescTwo = "TESTING100";
    	String _openedByTwo = "RKAHIL";
    	String _lastModByTwo = "THOLMES";
    	userTicketEntity.setTicketId(_ticketIdTwo);
    	//----------------------------------------------------------------------------------------------------------------------
    	caseDescriptionEntity.setId(_idTwo);
    	caseDescriptionEntity.setTicketId(userTicketEntity);
    	caseDescriptionEntity.setDescription(_caseDescTwo);
    	caseDescriptionEntity.setOpenedBy(_openedByTwo);
    	caseDescriptionEntity.setLastModified(new Date());
    	caseDescriptionEntity.setLastModifiedBy(_lastModByTwo);
    	System.out.println("caseDescriptionEntity: " + caseDescriptionEntity.toString());
    	//------------------------------------------------------------------------------------------------------------------------
    	caseDescriptionEntity = caseDescriptionDAO.updateCaseDescriptionEntity(caseDescriptionEntity);
    	System.out.println("caseDescriptionEntity : FINISHED");
    }
    @Test
    public void testDeleteDescription()
    {
    	System.out.println("testDeleteDescription : STARTING");
    	long _id = 2;
    	CaseDescriptionEntity deleteDescriptionOne = caseDescriptionDAO.getCaseDescriptionEntity(_id);
    	assertNotNull(deleteDescriptionOne);
    	System.out.println("deleteDescriptionOne : START");
    	//-------------------------------------------------------------------------------------------------------------------------
    	caseDescriptionDAO.deleteCaseDescriptionEntity(_id);
    	System.out.println("testDeleteDescriptionOne : DELETED");
    	//------------------------------------------------------------------------------------------------------------------------
    	System.out.println("testDeleteDescriptionTwo : START");
    	long _idTwo = 3;
    	CaseDescriptionEntity deleteDescriptionTwo = caseDescriptionDAO.getCaseDescriptionEntity(_idTwo);
    	assertNotNull(deleteDescriptionTwo);
    	//--------------------------------------------------------------------------------------------------------------------------
    	caseDescriptionDAO.deleteCaseDescriptionEntity(deleteDescriptionTwo);
    	System.out.println("testDeleteDescriptionTwo : DELETED");
    	//--------------------------------------------------------------------------------------------------------------------------------
    	System.out.println("testDeleteDescription : FINISHED");
    }
    @Test
    public void testFetchCaseDescriptionFetchList()
    {
    	System.out.println("testFetchCaseDescriptionFetchList : STARTING");
    	List<CaseDescriptionEntity> description = caseDescriptionDAO.getAllCaseDescriptionEntities();
    	if(description != null)
    	{
    		System.out.println("testFetchCaseDescriptionFetchList size: " + description.size());
    	}
    	assertNotNull(description);
    	System.out.println("testFetchCaseDescriptionFetchList: " + description.toString());
    	System.out.println("testFetchCaseDescriptionFetchList : FINISHED");
    }
    @Test
    public void testFetchCaseDescriptionFetchListByEntity()
    {
    	System.out.println("testFetchCaseDescriptionFetchListByEntity : STARTING");
    	CaseDescriptionEntity description = new CaseDescriptionEntity();
    	UserTicketEntity userTicket = new UserTicketEntity();
    	
    	long _id = 1;
    	long _ticketId = 1;
    	String caseDescription = "TESTING1";
    	String openedBy = "RKAHIL";
    	String lastModifiedBy = "RKAHIL";
    	userTicket.setTicketId(_ticketId);
    	//--------------------------------------------------------------------------------------------------------
    	description.setId(_id);
    	description.setTicketId(userTicket);
    	description.setDescription(caseDescription);
    	description.setOpenedBy(openedBy);
    	description.setLastModifiedBy(lastModifiedBy);
    	//---------------------------------------------------------------------------------------------------------
    	assertNotNull(description);
    	System.out.println("testFetchCaseDescriptionFetchListByEntity: " + description.toString());
    	System.out.println("testFetchCaseDescriptionFetchListByEntity : FINISHED");    	    	
    }
    @Test
    public void testFetchCaseDescriptionByEntities()
    {
    	System.out.println("testFetchCaseDescriptionByEntities : STARTING");
    	CaseDescriptionEntity caseDescriptionEntity = new CaseDescriptionEntity();
    	UserTicketEntity userTicketEntity = new UserTicketEntity();
    	long _idTwo = 2;
    	long _ticketIdTwo = 2;
    	String _caseDescTwo = "TESTING2";
    	String _openedByTwo = "THOLMES";
    	String _lastModByTwo = "RKAHIL";
    	userTicketEntity.setTicketId(_ticketIdTwo);
    	//--------------------------------------------------------------------------------------------------------------
    	caseDescriptionEntity.setId(_idTwo);
    	caseDescriptionEntity.setTicketId(userTicketEntity);
    	caseDescriptionEntity.setDescription(_caseDescTwo);
    	caseDescriptionEntity.setLastModified(new Date());
    	caseDescriptionEntity.setOpenedBy(_openedByTwo);
    	caseDescriptionEntity.setLastModifiedBy(_lastModByTwo);
    	//--------------------------------------------------------------------------------------------------------------
    	assertNotNull(caseDescriptionEntity);
    	System.out.println("caseDescriptionEntity: " + caseDescriptionEntity.toString());
    	caseDescriptionDAO.getAllCaseDescriptionEntitesByEntities(_idTwo);
    	System.out.println("caseDescriptionEntity : FINISHED");
    }
    @Test
    public void testFetchCaseDescriptionByUserTicket()
    {
    	System.out.println("testFetchCaseDescriptionByUserTicket : STARTING");
    	CaseDescriptionEntity caseDescriptionEntity = new CaseDescriptionEntity();
    	CustomerInformationEntity customerInformationEntity = new CustomerInformationEntity();
    	UserTicketEntity userTicketEntity = new UserTicketEntity();
    	//------------------------------------------------------------------------------------------------------------
    	long _idThree = 3;
    	long _ticketIdThree = 3;
    	String _caseDescThree = "TESTING3";
    	String _openedByThree = "THOLMES";
    	String _lastModByThree = "THOLMES";
    	//------------------------------------------------------------------------------------------------------------
    	caseDescriptionEntity.setTicketId(userTicketEntity);
    	caseDescriptionEntity.setId(_idThree);
    	caseDescriptionEntity.setDescription(_caseDescThree);
    	caseDescriptionEntity.setLastModified(new Date());
    	caseDescriptionEntity.setOpenedBy(_openedByThree);
    	caseDescriptionEntity.setLastModifiedBy(_lastModByThree);
    	//--------------------------------------------------------------------------------------------------------------
    	long _customerId = 3;
    	customerInformationEntity.setCustomerId(_customerId);
    	userTicketEntity.setTicketId(_ticketIdThree);
    	userTicketEntity.setCustomerId(customerInformationEntity);
    	userTicketEntity.setCaseOwner("THOLMES");
    	userTicketEntity.setDateOpened(new Date());
    	userTicketEntity.setLastModified(new Date());
    	userTicketEntity.setPriorityType("LOW");
    	userTicketEntity.setStatus("CLOSED");
    	userTicketEntity.setOpen(false);
    	//--------------------------------------------------------------------------------------------------------------
    	List<CaseDescriptionEntity> description = caseDescriptionDAO.getCaseDescriptionByTicket(userTicketEntity);
    	if(description != null)
    	{
    		System.out.println("testFetchCaseDescriptionByUserTicket: " + description.toString());
    	}
    	assertNotNull(userTicketEntity);
    	caseDescriptionDAO.getCaseDescriptionByTicket(userTicketEntity);
    	System.out.println("testFetchCaseDescriptionByUserTicket : FINISHED");
    }
    @Test
    public void testFetchCaseDescriptionByDescription()
    {
    	String _description = "TESTING1";
    	System.out.println("testFetchCaseDescriptionByDescription : STARTING");
    	//---------------------------------------------------------------------------------------------------------------------
    	List<CaseDescriptionEntity> description = caseDescriptionDAO.getCaseDescriptionByDescription(_description);
    	if(description != null)
    	{
    		System.out.println("testFetchCaseDescriptionByDescription: " + description.toString());
    	}
    	assertNotNull(_description);
    	caseDescriptionDAO.getCaseDescriptionByDescription(_description);
    	System.out.println("testFetchCaseDescriptionByDescription : FINISHED");
    }
}
