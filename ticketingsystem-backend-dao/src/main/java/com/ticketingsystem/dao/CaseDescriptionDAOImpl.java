package com.ticketingsystem.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ticketingsystem.entity.CaseDescriptionEntity;
import com.ticketingsystem.entity.UserTicketEntity;

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
	@Override
	public CaseDescriptionEntity updateCaseDescriptionEntity(CaseDescriptionEntity caseDescriptionEntity)
	{
		this.sessionFactory.getCurrentSession().update(caseDescriptionEntity);
		this.sessionFactory.getCurrentSession().flush();
		this.sessionFactory.getCurrentSession().refresh(caseDescriptionEntity);
		return caseDescriptionEntity;
	}
	@Override
	public void deleteCaseDescriptionEntity(long id)
	{
		CaseDescriptionEntity deleteDescription = new CaseDescriptionEntity();
		this.sessionFactory.getCurrentSession().delete(deleteDescription);
	}
	@Override
	public void deleteCaseDescriptionEntity(CaseDescriptionEntity caseDescriptionEntity)
	{
		this.sessionFactory.getCurrentSession().delete(caseDescriptionEntity);
	}
	@Override
	public List<CaseDescriptionEntity> getAllCaseDescriptionEntities()
	{
		String query = "from CaseDescriptionEntity";
		List<CaseDescriptionEntity> description = this.sessionFactory.getCurrentSession().createQuery(query).list();
		return description;
	}
	@Override
	public CaseDescriptionEntity getCaseDescriptionEntity(long id)
	{
		return (CaseDescriptionEntity) this.sessionFactory.getCurrentSession().get(CaseDescriptionEntity.class, id);
	}
	@Override
	public List<CaseDescriptionEntity> getAllCaseDescriptionEntitesByEntities(long id)
	{
		List<CaseDescriptionEntity> description = this.sessionFactory.getCurrentSession().createQuery("from CaseDescriptionEntity where id =?").setParameter(0, id).list();
		return description;
	}
	@Override
	public List<CaseDescriptionEntity> getCaseDescriptionByTicket(UserTicketEntity userTicket)
	{
		List<CaseDescriptionEntity> description = this.sessionFactory.getCurrentSession().createQuery("from CaseDescriptionEntity where ticketId =?").setParameter(0, userTicket).list();
		return description;
	}
	@Override
	public List<CaseDescriptionEntity> getCaseDescriptionByDescription(String caseDescription)
	{
		List<CaseDescriptionEntity> description = this.sessionFactory.getCurrentSession().createQuery("from CaseDescriptionEntity where description =?").setParameter(0, caseDescription).list();
		return description;
	}
}
