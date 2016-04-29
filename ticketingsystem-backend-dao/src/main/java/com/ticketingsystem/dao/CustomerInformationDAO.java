package com.ticketingsystem.dao;
import java.util.List;

import com.ticketingsystem.entity.CustomerInformationEntity;

public interface CustomerInformationDAO {

	public CustomerInformationEntity saveCustomerInformationEntity(CustomerInformationEntity customerInformationEntity);
	
	public CustomerInformationEntity createCustomerInformationEntity(CustomerInformationEntity customerInformationEntity);
	
	public CustomerInformationEntity updateCustomerInformationEntity(CustomerInformationEntity customerInformationEntity);
	
	public void deleteCustomerInformationEntity(long customerId);
	
	public void deleteCustomerInformationEntity(CustomerInformationEntity customerInformationEntity);
	
	public List<CustomerInformationEntity> getAllCustomerInformationEntities();
	
	public CustomerInformationEntity getCustomerInformationEntity(long customerId);
	
	public List<CustomerInformationEntity> getCustomerInformationEntitiesByCustomer(CustomerInformationEntity customerInformationEntity);
	
	public List<CustomerInformationEntity> getCustomerInformationEntitiesByCustomerId(long customerId);

	public List<CustomerInformationEntity> getCustomerInformationEntitiesByCustomerName(String customerName);
	
}
