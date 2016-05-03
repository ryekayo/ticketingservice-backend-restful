package com.ticketingsystem.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ticketingsystem.entity.RoleEntity;
import com.ticketingsystem.entity.TicketHistoryEntity;
import com.ticketingsystem.entity.UserTicketEntity;

@Repository
public class TicketHistoryDAOImpl implements TicketHistoryDAO {
	
	private static final Log log = LogFactory.getLog(TicketHistoryDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	@Override
	public TicketHistoryEntity saveTicketHistoryEntity(TicketHistoryEntity ticketHistoryEntity)
	{
		this.sessionFactory.getCurrentSession().saveOrUpdate(ticketHistoryEntity);
		return ticketHistoryEntity;
	}
	@Override
	public TicketHistoryEntity createTicketHistoryEntity(TicketHistoryEntity ticketHistoryEntity)
	{
		this.sessionFactory.getCurrentSession().save(ticketHistoryEntity);
		this.sessionFactory.getCurrentSession().flush();
		this.sessionFactory.getCurrentSession().refresh(ticketHistoryEntity);
		return ticketHistoryEntity;
	}
	@Override
	public TicketHistoryEntity updateTicketHistoryEntity(TicketHistoryEntity ticketHistoryEntity)
	{
		this.sessionFactory.getCurrentSession().update(ticketHistoryEntity);
		this.sessionFactory.getCurrentSession().flush();
		this.sessionFactory.getCurrentSession().refresh(ticketHistoryEntity);
		return ticketHistoryEntity;
	}
	@Override
	public void deleteTicketHistoryEntity(long ticketHistoryId)
	{
		TicketHistoryEntity ticketHistoryEntity = new TicketHistoryEntity();
		this.sessionFactory.getCurrentSession().delete(ticketHistoryEntity);
	}
	@Override
	public void deleteTicketHistoryEntity(TicketHistoryEntity ticketHistoryEntity)
	{
		this.sessionFactory.getCurrentSession().delete(ticketHistoryEntity);
	}
	@Override
	public List<TicketHistoryEntity> getAllTicketHistoryEntities()
	{
		String query = "from TicketHistoryEntity";
		List<TicketHistoryEntity> history = this.sessionFactory.getCurrentSession().createQuery(query).list();
		return history;
	}
	@Override
	public TicketHistoryEntity getTicketHistoryEntityByHistoryId(long ticketHistoryId)
	{
		return (TicketHistoryEntity) this.sessionFactory.getCurrentSession().get(TicketHistoryEntity.class, ticketHistoryId);
	}
	@Override
	public List<TicketHistoryEntity> getAllTicketHistoryEntitiesByTicketHistoryId(long ticketHistoryId)
	{
		List<TicketHistoryEntity> history = 
				this.sessionFactory.getCurrentSession().createQuery("from TicketHistoryEntity where ticketHistoryId =?").setParameter(0, ticketHistoryId).list();
		return history;	
	}
	@Override
	public List<TicketHistoryEntity> getTicketHistoryEntityByTicketId(UserTicketEntity ticketId)
	{
		List<TicketHistoryEntity> history =
				this.sessionFactory.getCurrentSession().createQuery("from TicketHistoryEntity where ticketId = ?").setParameter(0, ticketId).list();
		return history;
	}
	@Override
	public List<TicketHistoryEntity> getTicketHistoryEntityByCaseOwner(String caseOwner)
	{
		List<TicketHistoryEntity> history = 
				this.sessionFactory.getCurrentSession().createQuery("from TicketHistoryEntity where caseOwner = ?").setParameter(0, caseOwner).list();
		return history;		
	}
	@Override
	public List<TicketHistoryEntity> getTicketHistoryEntityByStatusChange(String statusChange)
	{
		List<TicketHistoryEntity> history =
				this.sessionFactory.getCurrentSession().createQuery("from TicketHistoryEntity where statusChange =?").setParameter(0, statusChange).list();
		return history;
	}
}
