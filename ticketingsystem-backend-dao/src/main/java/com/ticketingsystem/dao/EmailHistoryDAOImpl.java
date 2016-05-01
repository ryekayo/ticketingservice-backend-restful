package com.ticketingsystem.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ticketingsystem.entity.EmailHistoryEntity;
import com.ticketingsystem.entity.UserEntity;
import com.ticketingsystem.entity.UserTicketEntity;

@Repository
public class EmailHistoryDAOImpl implements EmailHistoryDAO {

	private static final Log log = LogFactory.getLog(EmailHistoryDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public EmailHistoryEntity saveEmailHistoryEntity(EmailHistoryEntity emailHistoryEntity)
	{
		this.sessionFactory.getCurrentSession().saveOrUpdate(emailHistoryEntity);
		return emailHistoryEntity;
	}
	@Override
	public EmailHistoryEntity createEmailHistoryEntity(EmailHistoryEntity emailHistoryEntity)
	{
		this.sessionFactory.getCurrentSession().save(emailHistoryEntity);
		this.sessionFactory.getCurrentSession().flush();
		this.sessionFactory.getCurrentSession().refresh(emailHistoryEntity);
		return emailHistoryEntity;
	}
	@Override
	public EmailHistoryEntity updateEmailHistoryEntity(EmailHistoryEntity emailHistoryEntity)
	{
		this.sessionFactory.getCurrentSession().update(emailHistoryEntity);
		this.sessionFactory.getCurrentSession().flush();
		this.sessionFactory.getCurrentSession().refresh(emailHistoryEntity);
		return emailHistoryEntity;
	}
	@Override
	public void deleteEmailHistoryEntity(long emailHistoryId)
	{
		EmailHistoryEntity deleteHistory = new EmailHistoryEntity();
		this.sessionFactory.getCurrentSession().delete(deleteHistory);
	}
	@Override
	public void deleteEmailHistoryEntity(EmailHistoryEntity emailHistoryEntity)
	{
		this.sessionFactory.getCurrentSession().delete(emailHistoryEntity);
	}
	@Override
	public List<EmailHistoryEntity> getAllEmailHistoryEntities()
	{
		String query = "from EmailHistoryEntity";
		List<EmailHistoryEntity> history = this.sessionFactory.getCurrentSession().createQuery(query).list();
		return history;
	}
	@Override
	public EmailHistoryEntity getAllEmailHistoryEntities(long emailHistoryId)
	{
		return (EmailHistoryEntity) this.sessionFactory.getCurrentSession().get(EmailHistoryEntity.class, emailHistoryId);
	}
	@Override
	public List<EmailHistoryEntity> getAllEmailHistoryEntitiesByTicketId(UserTicketEntity ticketId)
	{
		List<EmailHistoryEntity> history = 
				this.sessionFactory.getCurrentSession().createQuery("from EmailHistoryEntity where ticketId =?").setParameter(0, ticketId).list();
		return history;
	}
	@Override
	public List<EmailHistoryEntity> getAllEmailHistoryEntitiesByUserId(UserEntity userId)
	{
		List<EmailHistoryEntity> history = 
				this.sessionFactory.getCurrentSession().createQuery("from EmailHistoryEntity where userId =?").setParameter(0, userId).list();
		return history;
	}
	@Override
	public List<EmailHistoryEntity> getAllEmailHistoryEntitiesByEmailHistoryId(long emailHistoryId)
	{
		List<EmailHistoryEntity> history =
				this.sessionFactory.getCurrentSession().createQuery("from EmailHistoryEntity where emailHistoryId =?").setParameter(0, emailHistoryId).list();
		return history;
	}
	@Override
	public List<EmailHistoryEntity> getAllEmailHistoryEntitiesByFromEmail(String fromEmail)
	{
		List<EmailHistoryEntity> history = 
				this.sessionFactory.getCurrentSession().createQuery("from EmailHistoryEntity where fromEmail =?").setParameter(0, fromEmail).list();
		return history;
	}
}
