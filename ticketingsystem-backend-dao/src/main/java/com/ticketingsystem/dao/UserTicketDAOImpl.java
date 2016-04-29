package com.ticketingsystem.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ticketingsystem.entity.CustomerInformationEntity;
import com.ticketingsystem.entity.UserTicketEntity;

@Repository
public class UserTicketDAOImpl implements UserTicketDAO
{

    private static final Log log = LogFactory.getLog(UserTicketDAOImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public UserTicketEntity saveUserTicketEntity(UserTicketEntity userTicketEntity)
    {
    	this.sessionFactory.getCurrentSession().saveOrUpdate(userTicketEntity);
    	return userTicketEntity;
    }

    @Override
    public UserTicketEntity createUserTicketEntity(UserTicketEntity userTicketEntity)
    {
        this.sessionFactory.getCurrentSession().save(userTicketEntity);
        this.sessionFactory.getCurrentSession().flush();
        this.sessionFactory.getCurrentSession().refresh(userTicketEntity);
        return userTicketEntity;
    }

    @Override
    public UserTicketEntity updateUserTicketEntity(UserTicketEntity userTicketEntity)
    {
        this.sessionFactory.getCurrentSession().update(userTicketEntity);
        this.sessionFactory.getCurrentSession().flush();
        this.sessionFactory.getCurrentSession().refresh(userTicketEntity);
        return userTicketEntity;
    }

    @Override
    public void deleteUserTicketEntity(long ticketId)
    {
        UserTicketEntity deleteTicket = new UserTicketEntity();
        this.sessionFactory.getCurrentSession().delete(deleteTicket);
    }

    @Override
    public void deleteUserTicketEntity(UserTicketEntity userTicket)
    {
        this.sessionFactory.getCurrentSession().delete(userTicket);
    }

    @Override
    public List<UserTicketEntity> getAllUserTicketEntities()
    {
        String query = "from UserTicketEntity";
        List<UserTicketEntity> tickets = this.sessionFactory.getCurrentSession().createQuery(query).list();
        return tickets;

    }

    @Override
    public UserTicketEntity getUserTicketEntity(long ticketId)
    {
        return (UserTicketEntity) this.sessionFactory.getCurrentSession().get(UserTicketEntity.class, ticketId);
    }

    @Override
    public List<UserTicketEntity> getUserTicketEntitiesByOwner(String caseOwner)
    {
        List<UserTicketEntity> ticketId =
            this.sessionFactory.getCurrentSession().createQuery("from UserTicketEntity ticketId where case_owner= ?").setParameter(0, caseOwner).list();
        return ticketId;
    }

    @Override
    public List<UserTicketEntity> getUserTicketEntitiyesByPriority(String priorityType)
    {
        List<UserTicketEntity> ticketId =
            this.sessionFactory.getCurrentSession().createQuery("from UserTicketEntity ticketId where priority= ?").setParameter(0, priorityType).list();
        return ticketId;
    }
    
    @Override
    public List<UserTicketEntity> getUserTicketEntitiesByCustomerID(CustomerInformationEntity customerID)
    {
    	List<UserTicketEntity> customerId = this.sessionFactory.getCurrentSession().createQuery("from UserTicketEntity ticketId where customerId =?").setParameter(0, customerID).list();
    	return customerId;
    }
}
