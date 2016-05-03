package com.ticketingsystem.dao;

import java.util.List;

import com.ticketingsystem.entity.CaseDescriptionEntity;
import com.ticketingsystem.entity.UserTicketEntity;

public interface CaseDescriptionDAO {

	public CaseDescriptionEntity saveCaseDescriptionEntity(CaseDescriptionEntity caseDescriptionEntity);
	
	public CaseDescriptionEntity createCaseDescriptionEntity(CaseDescriptionEntity caseDescriptionEntity);
	
	public CaseDescriptionEntity updateCaseDescriptionEntity(CaseDescriptionEntity caseDescriptionEntity);
	
	public void deleteCaseDescriptionEntity(long id);
	
	public void deleteCaseDescriptionEntity(CaseDescriptionEntity caseDescriptionEntity);
	
	public List<CaseDescriptionEntity> getAllCaseDescriptionEntities();
	
	public CaseDescriptionEntity getCaseDescriptionEntity(long id);
	
	public List<CaseDescriptionEntity> getAllCaseDescriptionEntitesByEntities(long id);
	
	public List<CaseDescriptionEntity> getCaseDescriptionByTicket(UserTicketEntity userTicket);
	
	public List<CaseDescriptionEntity> getCaseDescriptionByDescription(String caseDescription);
}
