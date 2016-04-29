package com.ticketingsystem.dao;

import java.util.List;

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
	@Override
	public CustomerInformationEntity updateCustomerInformationEntity(CustomerInformationEntity customerInformationEntity)
	{
		this.sessionFactory.getCurrentSession().update(customerInformationEntity);
		this.sessionFactory.getCurrentSession().flush();
		this.sessionFactory.getCurrentSession().refresh(customerInformationEntity);
		return customerInformationEntity;
	}
	@Override
	public void deleteCustomerInformationEntity(long customerId)
	{
		CustomerInformationEntity deleteCustomer = new CustomerInformationEntity();
		this.sessionFactory.getCurrentSession().delete(deleteCustomer);
	}
	@Override
	public void deleteCustomerInformationEntity(CustomerInformationEntity customerInformationEntity)
	{
		this.sessionFactory.getCurrentSession().delete(customerInformationEntity);
	}
	@Override
	public List<CustomerInformationEntity> getAllCustomerInformationEntities()
	{
		String query = "from CustomerInformationEntity";
		List<CustomerInformationEntity> customer = this.sessionFactory.getCurrentSession().createQuery(query).list();
		return customer;
	}
	@Override
	public CustomerInformationEntity getCustomerInformationEntity(long customerId)
	{
		return (CustomerInformationEntity) this.sessionFactory.getCurrentSession().get(CustomerInformationEntity.class, customerId);
	}
	@Override
	public List<CustomerInformationEntity> getCustomerInformationEntitiesByCustomer(CustomerInformationEntity customerInformationEntity)
	{
		List<CustomerInformationEntity> customer = this.sessionFactory.getCurrentSession().createQuery("from CustomerInformationEntity customerId where customerId = ?").setParameter(0,customerInformationEntity).list();
		return customer;
	}
	@Override
	public List<CustomerInformationEntity> getCustomerInformationEntitiesByCustomerId(long customerId)
	{
		List<CustomerInformationEntity> id = this.sessionFactory.getCurrentSession().createQuery("from CustomerInformationEntity where customerId = ?").setParameter(0, customerId).list();
		return id;
	}
	@Override
	public List<CustomerInformationEntity> getCustomerInformationEntitiesByCustomerName(String customerName)
	{
		List<CustomerInformationEntity> customer = this.sessionFactory.getCurrentSession().createQuery("from CustomerInformationEntity where customerName = ?").setParameter(0, customerName).list();
		return customer;
	}
}
