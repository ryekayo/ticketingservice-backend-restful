package com.ticketingsystem.dao;
import java.util.List;
import com.ticketingsystem.entity.UserTicketEntity;
import com.ticketingsystem.entity.CustomerEntity;

public interface UserTicketDAO {
	
	public UserTicketEntity saveUserTicketEntity(UserTicketEntity userTicketEntity);
	
	public UserTicketEntity createUserTicketEntity(UserTicketEntity userTicketEntity);
	
	public UserTicketEntity updateUserTicketEntity(UserTicketEntity userTicketEntity);
	
	public void deleteUserTicketEntity(long ticketNumber);
	
	public void deleteUserTicketEntity(UserTicketEntity userTicket);
	
	public List<UserTicketEntity> getAllUserTicketEntities();
	
	public UserTicketEntity getUserTicketEntity(long ticketNumber);
	
	public List<UserTicketEntity> getUserTicketEntitiesByOwner(String caseOwner);
	
	public List<UserTicketEntity> getUserTicketEntitiyesByPriority(String priorityType);
}
