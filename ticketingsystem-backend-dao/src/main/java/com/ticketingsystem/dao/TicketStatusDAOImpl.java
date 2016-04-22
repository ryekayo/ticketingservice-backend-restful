package com.ticketingsystem.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ticketingsystem.entity.TicketStatusEntity;

@Repository
public class TicketStatusDAOImpl implements TicketStatusDAO
{

    // private static final String PERSISTENCE_UNIT_NAME = "ticket_status";
    // private static EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    // private static final Log log = LogFactory.getLog(TicketStatusDAOImpl.class);
    // EntityManager em = factory.createEntityManager();

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public TicketStatusEntity saveTicketStatusEntity(TicketStatusEntity ticketNumber)
    {
        this.sessionFactory.getCurrentSession().saveOrUpdate(ticketNumber);
        return ticketNumber;
    }

    @Override
    public TicketStatusEntity createTicketStatusEntity(TicketStatusEntity ticketNumber)
    {
        this.sessionFactory.getCurrentSession().persist(ticketNumber);
        return ticketNumber;
    }

    @Override
    public TicketStatusEntity updateTicketStatusEntity(TicketStatusEntity ticketNumber)
    {
        this.sessionFactory.getCurrentSession().merge(ticketNumber);
        return ticketNumber;
    }

    @Override
    public void deleteTicketStatusEntity(Long Id)
    {

    }

    @Override
    public void deleteTicketStatusEntity(TicketStatusEntity ticketNumber)
    {
        this.sessionFactory.getCurrentSession().delete(ticketNumber);
    }

    @Override
    public List<TicketStatusEntity> getAllTicketStatusEntitys()
    {
        String query = "from TicketStatusEntity";
        List<TicketStatusEntity> users = this.sessionFactory.getCurrentSession().createQuery(query).list();
        return users;
    }

    @Override
    public TicketStatusEntity getTicketStatusEntity(Long Id)
    {
        return (TicketStatusEntity) this.sessionFactory.getCurrentSession().get(TicketStatusEntity.class, Id);
    }

    @Override
    public List<TicketStatusEntity> getTicketStatusEntity(TicketStatusEntity exampleTicketStatusEntity)
    {
        Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(TicketStatusEntity.class);
        List<TicketStatusEntity> users = criteria.list();
        return users;
    }

    @Override
    public List<TicketStatusEntity> getTicketStatusEntityById(long id)
    {
        Query query = this.sessionFactory.getCurrentSession().createQuery("from TicketStatusEntity tei where tei.ticketNumber.id = :ticket");
        query.setParameter("ticket", id);
        List<TicketStatusEntity> ticket = query.list();
        return ticket;
    }
}
