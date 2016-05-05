package com.ticketingsystem.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ticketingsystem.dao.CaseDescriptionDAO;
import com.ticketingsystem.entity.CaseDescriptionEntity;

@Transactional
@Service("caseDescriptionService")
public class CaseDescriptionServiceImpl implements CaseDescriptionService {

	@Autowired
	private CaseDescriptionDAO caseDescriptionDAO;
	
	@Override
	@Transactional
	public List<CaseDescriptionEntity> getAllCaseDescription()
	{
		List<CaseDescriptionEntity> caseDescription = caseDescriptionDAO.getAllCaseDescriptionEntities();
		return caseDescription;
	}
	@Override
	@Transactional
	public CaseDescriptionEntity getCaseDescriptionById(long caseId)
	{
		CaseDescriptionEntity caseDescription = caseDescriptionDAO.getCaseDescriptionEntity(caseId);
		return caseDescription;
	}
	@Override
	@Transactional
	public CaseDescriptionEntity add(CaseDescriptionEntity caseDescription)
	{
		CaseDescriptionEntity caseDesc = caseDescriptionDAO.createCaseDescriptionEntity(caseDescription);
		return caseDesc;
	}
	@Override
	@Transactional
	public CaseDescriptionEntity update(CaseDescriptionEntity caseDescription)
	{
		CaseDescriptionEntity caseDesc = caseDescriptionDAO.updateCaseDescriptionEntity(caseDescription);
		return caseDesc;
	}
	@Override
	@Transactional
	public void remove(CaseDescriptionEntity caseDescription)
	{
		caseDescriptionDAO.deleteCaseDescriptionEntity(caseDescription);
	}
	@Override
	@Transactional
	public void remove(long caseId)
	{
		caseDescriptionDAO.deleteCaseDescriptionEntity(caseId);
	}
}
