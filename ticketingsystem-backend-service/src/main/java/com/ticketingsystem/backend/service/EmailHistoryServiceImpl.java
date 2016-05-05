package com.ticketingsystem.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ticketingsystem.dao.EmailHistoryDAO;
import com.ticketingsystem.entity.EmailHistoryEntity;

@Transactional
@Service("emailHistoryService")
public class EmailHistoryServiceImpl implements EmailHistoryService {

	@Autowired
	private EmailHistoryDAO emailHistoryDAO;
	
	@Override
	@Transactional
	public List<EmailHistoryEntity> getAllEmailHistory()
	{
		List<EmailHistoryEntity> email = emailHistoryDAO.getAllEmailHistoryEntities();
		return email;
	}
	@Override
	@Transactional
	public EmailHistoryEntity getEmailHistoryById(long emailHistoryId)
	{
		EmailHistoryEntity email = emailHistoryDAO.getAllEmailHistoryEntities(emailHistoryId);
		return email;
	}
	@Override
	@Transactional
	public EmailHistoryEntity add(EmailHistoryEntity emailHistory)
	{
		EmailHistoryEntity email = emailHistoryDAO.createEmailHistoryEntity(emailHistory);
		return email;
	}
	@Override
	@Transactional
	public EmailHistoryEntity update(EmailHistoryEntity emailHistory)
	{
		EmailHistoryEntity email = emailHistoryDAO.updateEmailHistoryEntity(emailHistory);
		return email;
	}
	@Override
	@Transactional
	public void remove(EmailHistoryEntity emailHistory)
	{
		emailHistoryDAO.deleteEmailHistoryEntity(emailHistory);
	}
	@Override
	@Transactional
	public void remove(long emailHistoryId)
	{
		emailHistoryDAO.deleteEmailHistoryEntity(emailHistoryId);
	}
}
