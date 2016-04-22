package com.ticketingsystem.dao;
import java.util.List;
import com.ticketingsystem.entity.UserTicketEntity;
import com.ticketingsystem.entity.TicketStatusEntity;

public interface TicketStatusDAO {

	public TicketStatusEntity saveTicketStatusEntity(TicketStatusEntity ticketNumber);
	
	public TicketStatusEntity createTicketStatusEntity(TicketStatusEntity ticketNumber);
	
	public TicketStatusEntity updateTicketStatusEntity(TicketStatusEntity ticketNumber);
	
	public void deleteTicketStatusEntity(Long Id);
	
	public void deleteTicketStatusEntity(TicketStatusEntity ticketNumber);
	
	public List<TicketStatusEntity> getAllTicketStatusEntitys();
	
	public TicketStatusEntity getTicketStatusEntity(Long Id);
	
	public List<TicketStatusEntity> getTicketStatusEntity(TicketStatusEntity exampleTicketStatusEntity);
	
	public List<TicketStatusEntity> getTicketStatusEntityById(long id);
}
