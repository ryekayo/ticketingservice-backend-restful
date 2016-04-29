package com.ticketingsystem.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ticketingsystem.entity.CustomerInformationEntity;

@Repository
public class CustomerInformationDAOImpl implements CustomerInformationDAO {
	
	private static final Log log = LogFactory.getLog(CustomerInformationDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	@Override
	public CustomerInformationEntity saveCustomerInformationEntity(CustomerInformationEntity customerInformationEntity)
	{
		this.sessionFactory.getCurrentSession().saveOrUpdate(customerInformationEntity);
		return customerInformationEntity;
	}
	@Override
	public CustomerInformationEntity createCustomerInformationEntity(CustomerInformationEntity customerInformationEntity)
	{
		this.sessionFactory.getCurrentSession().save(customerInformationEntity);
		this.sessionFactory.getCurrentSession().flush();
		this.sessionFactory.getCurrentSession().refresh(customerInformationEntity);
		return customerInformationEntity;
	}

}
