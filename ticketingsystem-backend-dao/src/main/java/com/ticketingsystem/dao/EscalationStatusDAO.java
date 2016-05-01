package com.ticketingsystem.dao;

import java.util.List;

import com.ticketingsystem.entity.EscalationStatusEntity;
import com.ticketingsystem.entity.UserTicketEntity;

public interface EscalationStatusDAO {
	
	public EscalationStatusEntity saveEscalationStatusEntity(EscalationStatusEntity escalationStatusEntity);
	
	public EscalationStatusEntity createEscalationStatusEntity(EscalationStatusEntity escalationStatusEntity);
	
	public EscalationStatusEntity updateEscalationStatusEntity(EscalationStatusEntity escalationStatusEntity);
	
	public void deleteEscalationStatusEntity(long id);
	
	public void deleteEscalatinStatusEntity(EscalationStatusEntity escalationStatusEntity);
	
	public List<EscalationStatusEntity> getAllEscalationStatusEntities();
	
	public EscalationStatusEntity getEscalationStatusEntity(long id);
	
	public List<EscalationStatusEntity> getAllEscalationStatusEntitiesByTicketId(UserTicketEntity ticketId);
	
	public List<EscalationStatusEntity> getAllEscalationStatusEntitiesById(long id);
	
	public List<EscalationStatusEntity> getAllEscalationStatusEntitiesByNotes(String notes);
}
