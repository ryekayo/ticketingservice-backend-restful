package com.ticketingsystem.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ticketingsystem.entity.EscalationStatusEntity;
import com.ticketingsystem.entity.UserTicketEntity;

@Repository
public class EscalationStatusDAOImpl implements EscalationStatusDAO {

	private static final Log log = LogFactory.getLog(EscalationStatusDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public EscalationStatusEntity saveEscalationStatusEntity(EscalationStatusEntity escalationStatusEntity)
	{
		this.sessionFactory.getCurrentSession().save(escalationStatusEntity);
		return escalationStatusEntity;
	}
	@Override
	public EscalationStatusEntity createEscalationStatusEntity(EscalationStatusEntity escalationStatusEntity)
	{
		this.sessionFactory.getCurrentSession().save(escalationStatusEntity);
		this.sessionFactory.getCurrentSession().flush();
		this.sessionFactory.getCurrentSession().refresh(escalationStatusEntity);
		return escalationStatusEntity;
	}
	@Override
	public EscalationStatusEntity updateEscalationStatusEntity(EscalationStatusEntity escalationStatusEntity)
	{
		this.sessionFactory.getCurrentSession().update(escalationStatusEntity);
		this.sessionFactory.getCurrentSession().flush();
		this.sessionFactory.getCurrentSession().refresh(escalationStatusEntity);
		return escalationStatusEntity;
	}
	@Override
	public void deleteEscalationStatusEntity(long id)
	{
		EscalationStatusEntity escalation = new EscalationStatusEntity();
		this.sessionFactory.getCurrentSession().delete(escalation);
	}
	@Override
	public void deleteEscalatinStatusEntity(EscalationStatusEntity escalationStatusEntity)
	{
		this.sessionFactory.getCurrentSession().delete(escalationStatusEntity);
	}
	@Override
	public List<EscalationStatusEntity> getAllEscalationStatusEntities()
	{
		String query = "from EscalationStatusEntity";
		List<EscalationStatusEntity> escalation = 
				this.sessionFactory.getCurrentSession().createQuery(query).list();
		return escalation;
	}
	@Override
	public EscalationStatusEntity getEscalationStatusEntity(long id)
	{
		return (EscalationStatusEntity) this.sessionFactory.getCurrentSession().get(EscalationStatusEntity.class, id);
	}
	@Override
	public List<EscalationStatusEntity> getAllEscalationStatusEntitiesByTicketId(UserTicketEntity ticketId)
	{
		List<EscalationStatusEntity> escalation = 
				this.sessionFactory.getCurrentSession().createQuery("from EscalationStatusEntity where ticketId =?").setParameter(0, ticketId).list();
		return escalation;
	}
	@Override
	public List<EscalationStatusEntity> getAllEscalationStatusEntitiesById(long id)
	{
		List<EscalationStatusEntity> escalation =
				this.sessionFactory.getCurrentSession().createQuery("from EscalationStatusEntity where id =?").setParameter(0, id).list();
		return escalation;
	}
	@Override
	public List<EscalationStatusEntity> getAllEscalationStatusEntitiesByNotes(String notes)
	{
		List<EscalationStatusEntity> escalation = 
				this.sessionFactory.getCurrentSession().createQuery("from EscalationStatusEntity where notes =?").setParameter(0, notes).list();
		return escalation;
	}
}
