package com.ticketingsystem.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ticketingsystem.dao.UserTicketDAO;
import com.ticketingsystem.entity.UserTicketEntity;

@Transactional
@Service("userTicketService")
public class UserTicketServiceImpl implements UserTicketService {
	
	@Autowired
	private UserTicketDAO userTicketDAO;
	
	@Override
	@Transactional
	public List<UserTicketEntity> getAllTickets()
	{
		List<UserTicketEntity> ticketList = userTicketDAO.getAllUserTicketEntities();
		return ticketList;
	}
	@Override
	@Transactional
	public UserTicketEntity getUserByTicketId(long ticketId)
	{
		UserTicketEntity userTicket = userTicketDAO.getUserTicketEntity(ticketId);
		return userTicket;
	}
	@Override
	@Transactional
	public UserTicketEntity add(UserTicketEntity userTicketEntity)
	{
		UserTicketEntity userTicket = userTicketDAO.createUserTicketEntity(userTicketEntity);
		return userTicket;
	}
	@Override
	@Transactional
	public void remove(UserTicketEntity ticket)
	{
		userTicketDAO.deleteUserTicketEntity(ticket.getTicketId());
	}
	@Override
	@Transactional
	public UserTicketEntity update(UserTicketEntity userTicketEntity)
	{
		UserTicketEntity updateTicket = userTicketDAO.updateUserTicketEntity(userTicketEntity);
		return updateTicket;
	}
	@Override
	@Transactional
	public void remove(long ticketId)
	{
		userTicketDAO.deleteUserTicketEntity(ticketId);
	}
}
