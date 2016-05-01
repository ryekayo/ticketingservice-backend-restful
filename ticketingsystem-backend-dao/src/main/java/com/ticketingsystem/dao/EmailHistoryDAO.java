package com.ticketingsystem.dao;

import java.util.List;

import com.ticketingsystem.entity.EmailHistoryEntity;
import com.ticketingsystem.entity.UserEntity;
import com.ticketingsystem.entity.UserTicketEntity;

public interface EmailHistoryDAO {
	
	public EmailHistoryEntity saveEmailHistoryEntity(EmailHistoryEntity emailHistoryEntity);
	
	public EmailHistoryEntity createEmailHistoryEntity(EmailHistoryEntity emailHistoryEntity);
	
	public EmailHistoryEntity updateEmailHistoryEntity(EmailHistoryEntity emailHistoryEntity);
	
	public void deleteEmailHistoryEntity(long emailHistoryId);
	
	public void deleteEmailHistoryEntity(EmailHistoryEntity emailHistoryEntity);
	
	public List<EmailHistoryEntity> getAllEmailHistoryEntities();
	
	public EmailHistoryEntity getAllEmailHistoryEntities(long emailHistoryId);
	
	public List<EmailHistoryEntity> getAllEmailHistoryEntitiesByTicketId(UserTicketEntity ticketId);
	
	public List<EmailHistoryEntity> getAllEmailHistoryEntitiesByUserId(UserEntity userId);
	
	public List<EmailHistoryEntity> getAllEmailHistoryEntitiesByEmailHistoryId(long emailHistoryId);
	
	public List<EmailHistoryEntity> getAllEmailHistoryEntitiesByFromEmail(String fromEmail);

}
