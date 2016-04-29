package com.ticketingsystem.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ticketingsystem.entity.CaseDescriptionEntity;

@Repository
public class CaseDescriptionDAOImpl implements CaseDescriptionDAO {
	
	private static final Log log = LogFactory.getLog(CustomerInformationDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}	
	@Override
	public CaseDescriptionEntity saveCaseDescriptionEntity(CaseDescriptionEntity caseDescriptionEntity)
	{
		this.sessionFactory.getCurrentSession().saveOrUpdate(caseDescriptionEntity);
		return caseDescriptionEntity;
	}
	@Override
	public CaseDescriptionEntity createCaseDescriptionEntity(CaseDescriptionEntity caseDescriptionEntity)
	{
		this.sessionFactory.getCurrentSession().save(caseDescriptionEntity);
		this.sessionFactory.getCurrentSession().flush();
		this.sessionFactory.getCurrentSession().refresh(caseDescriptionEntity);
		return caseDescriptionEntity;
	}

}
