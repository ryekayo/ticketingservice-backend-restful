package com.ticketingsystem.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ticketingsystem.dao.TicketHistoryDAO;
import com.ticketingsystem.entity.TicketHistoryEntity;
import com.ticketingsystem.entity.UserTicketEntity;

@Transactional
@Service("ticketHistoryService")
public class TicketHistoryServiceImpl implements TicketHistoryService{
	
	@Autowired
	private TicketHistoryDAO ticketHistoryDAO;

	@Override
	@Transactional
	public List<TicketHistoryEntity> getAllTicketHistory()
	{
		List<TicketHistoryEntity> history = ticketHistoryDAO.getAllTicketHistoryEntities();
		return history;
	}
	@Override
	@Transactional
	public TicketHistoryEntity getTicketByTicketHistoryId(long ticketHistoryId)
	{
		TicketHistoryEntity history = ticketHistoryDAO.getTicketHistoryEntityByHistoryId(ticketHistoryId);
		return history;
	}
	@Override
	@Transactional
	public TicketHistoryEntity add(TicketHistoryEntity ticketHistoryEntity)
	{
		TicketHistoryEntity history = ticketHistoryDAO.createTicketHistoryEntity(ticketHistoryEntity);
		return history;
	}
	@Override
	@Transactional
	public TicketHistoryEntity update(TicketHistoryEntity ticketHistoryEntity)
	{
		TicketHistoryEntity history = ticketHistoryDAO.updateTicketHistoryEntity(ticketHistoryEntity);
		return history;
	}
	@Override
	@Transactional
	public void remove(TicketHistoryEntity ticket)
	{
		ticketHistoryDAO.deleteTicketHistoryEntity(ticket);
	}
	@Override
	@Transactional
	public void remove(long ticketHistoryId)
	{
		ticketHistoryDAO.deleteTicketHistoryEntity(ticketHistoryId);
	}
}
