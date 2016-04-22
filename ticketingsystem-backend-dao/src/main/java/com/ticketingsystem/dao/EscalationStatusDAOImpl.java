package com.ticketingsystem.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ticketingsystem.entity.EscalationStatusEntity;

@Repository
public class EscalationStatusDAOImpl implements EscalationStatusDAO
{

    // private static final String PERSISTENCE_UNIT_NAME = "escalation_status";
    // private static EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    // private static final Log log = LogFactory.getLog(EscalationStatusDAOImpl.class);
    // EntityManager em = factory.createEntityManager();

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public EscalationStatusEntity saveTicketStatusEntity(EscalationStatusEntity ticketNumber)
    {
        this.sessionFactory.getCurrentSession().saveOrUpdate(ticketNumber);
        return ticketNumber;
    }

    @Override
    public EscalationStatusEntity createTicketStatusEntity(EscalationStatusEntity ticketNumber)
    {
        this.sessionFactory.getCurrentSession().persist(ticketNumber);
        return ticketNumber;
    }

    @Override
    public EscalationStatusEntity updateTicketStatusEntity(EscalationStatusEntity ticketNumber)
    {
        this.sessionFactory.getCurrentSession().merge(ticketNumber);
        return ticketNumber;
    }

    @Override
    public void deleteEscalationStatusEntity(Long Id)
    {

    }

    @Override
    public void deleteEscalationStatusEntity(EscalationStatusEntity ticketNumber)
    {
        this.sessionFactory.getCurrentSession().delete(ticketNumber);
    }

    @Override
    public List<EscalationStatusEntity> getAllTicketStatusEntitys()
    {
        String query = "from EscalationStatusEntity";
        List<EscalationStatusEntity> users = this.sessionFactory.getCurrentSession().createQuery(query).list();
        return users;
    }

    @Override
    public EscalationStatusEntity getTicketStatusEntity(Long Id)
    {
        return (EscalationStatusEntity) this.sessionFactory.getCurrentSession().get(EscalationStatusEntity.class, Id);
    }

    @Override
    public List<EscalationStatusEntity> getTicketStatusEntity(EscalationStatusEntity exampleTicketStatusEntity)
    {
        Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(EscalationStatusEntity.class);
        List<EscalationStatusEntity> users = criteria.list();
        return users;
    }

    @Override
    public List<EscalationStatusEntity> getTicketStatusEntityById(long id)
    {
        Query query = this.sessionFactory.getCurrentSession().createQuery("from EscalationTicketStatusEntity ets where ets.ticketNumber.id = :ticket");
        query.setParameter("ticket", id);
        List<EscalationStatusEntity> ticket = query.list();
        return ticket;
    }
}
