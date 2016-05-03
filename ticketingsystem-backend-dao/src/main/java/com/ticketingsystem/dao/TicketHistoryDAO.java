package com.ticketingsystem.dao;

import java.util.List;

import com.ticketingsystem.entity.TicketHistoryEntity;
import com.ticketingsystem.entity.UserTicketEntity;

public interface TicketHistoryDAO {
	
	public TicketHistoryEntity saveTicketHistoryEntity(TicketHistoryEntity ticketHistoryEntity);
	
	public TicketHistoryEntity createTicketHistoryEntity(TicketHistoryEntity ticketHistoryEntity);
	
	public TicketHistoryEntity updateTicketHistoryEntity(TicketHistoryEntity ticketHistoryEntity);
	
	public void deleteTicketHistoryEntity(long ticketHistoryId);
	
	public void deleteTicketHistoryEntity(TicketHistoryEntity ticketHistoryEntity);
	
	public List<TicketHistoryEntity> getAllTicketHistoryEntities();
	
	public TicketHistoryEntity getTicketHistoryEntityByHistoryId(long ticketHistoryId);
	
	public List<TicketHistoryEntity> getAllTicketHistoryEntitiesByTicketHistoryId(long ticketHistoryId);
	
	public List<TicketHistoryEntity> getTicketHistoryEntityByTicketId(UserTicketEntity ticketId);
	
	public List<TicketHistoryEntity> getTicketHistoryEntityByCaseOwner(String caseOwner);
	
	public List<TicketHistoryEntity> getTicketHistoryEntityByStatusChange(String statusChange);
}
