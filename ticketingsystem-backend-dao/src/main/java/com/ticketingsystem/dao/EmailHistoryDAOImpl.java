package com.ticketingsystem.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ticketingsystem.entity.EmailHistoryEntity;

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
}
