package com.ticketingsystem.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ticketingsystem.dao.EscalationStatusDAO;
import com.ticketingsystem.entity.EscalationStatusEntity;

@Transactional
@Service("escalationStatusService")
public class EscalationStatusServiceImpl implements EscalationStatusService {
	
	@Autowired
	private EscalationStatusDAO escalationStatusDAO;
	
	@Override
	@Transactional
	public List<EscalationStatusEntity> getAllEscalationStatus()
	{
		List<EscalationStatusEntity> escalation = escalationStatusDAO.getAllEscalationStatusEntities();
		return escalation;
	}
	@Override
	@Transactional
	public EscalationStatusEntity getTicketById(long id)
	{
		EscalationStatusEntity escalation = escalationStatusDAO.getEscalationStatusEntity(id);
		return escalation;
	}
	@Override
	@Transactional
	public EscalationStatusEntity add(EscalationStatusEntity escalationStatusEntity)
	{
		EscalationStatusEntity escalation = escalationStatusDAO.createEscalationStatusEntity(escalationStatusEntity);
		return escalation;
	}
	@Override
	@Transactional
	public EscalationStatusEntity update(EscalationStatusEntity escalationStatusEntity)
	{
		EscalationStatusEntity escalation = escalationStatusDAO.updateEscalationStatusEntity(escalationStatusEntity);
		return escalation;
	}
	@Override
	@Transactional
	public void remove(EscalationStatusEntity ticket)
	{
		escalationStatusDAO.deleteEscalatinStatusEntity(ticket);
	}
	@Override
	@Transactional
	public void remove(long id)
	{
		escalationStatusDAO.deleteEscalationStatusEntity(id);
	}
}
