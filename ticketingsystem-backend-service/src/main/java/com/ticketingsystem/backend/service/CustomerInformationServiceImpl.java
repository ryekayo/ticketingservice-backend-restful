package com.ticketingsystem.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ticketingsystem.dao.CustomerInformationDAO;
import com.ticketingsystem.entity.CustomerInformationEntity;

@Transactional
@Service("customerInformationService")
public class CustomerInformationServiceImpl implements CustomerInformationService{
	
	@Autowired
	private CustomerInformationDAO customerInformationDAO;
	
	@Override
	@Transactional
	public List<CustomerInformationEntity> getAllCustomerInformation()
	{
		List<CustomerInformationEntity> customer = customerInformationDAO.getAllCustomerInformationEntities();
		return customer;
	}
	@Override
	@Transactional
	public CustomerInformationEntity getEmailHistoryById(long customerId)
	{
		CustomerInformationEntity customer = customerInformationDAO.getCustomerInformationEntity(customerId);
		return customer;
	}
	@Override
	@Transactional
	public CustomerInformationEntity add(CustomerInformationEntity customerInfo)
	{
		CustomerInformationEntity customer = customerInformationDAO.createCustomerInformationEntity(customerInfo);
		return customer;
	}
	@Override
	@Transactional
	public CustomerInformationEntity update(CustomerInformationEntity customerInfo)
	{
		CustomerInformationEntity customer = customerInformationDAO.updateCustomerInformationEntity(customerInfo);
		return customer;
	}
	@Override
	@Transactional
	public void remove(CustomerInformationEntity customerInfo)
	{
		customerInformationDAO.deleteCustomerInformationEntity(customerInfo);
	}
	@Override
	@Transactional
	public void remove(long customerId)
	{
		customerInformationDAO.deleteCustomerInformationEntity(customerId);
	}
}
