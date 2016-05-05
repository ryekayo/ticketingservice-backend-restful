package com.ticketingsystem.backend.service;

import java.util.List;

import com.ticketingsystem.entity.CustomerInformationEntity;

public interface CustomerInformationService {
	
    List<CustomerInformationEntity> getAllCustomerInformation();

    CustomerInformationEntity getEmailHistoryById(long customerId);

    CustomerInformationEntity add(CustomerInformationEntity customerInfo);
    
    CustomerInformationEntity update(CustomerInformationEntity customerInfo);

    void remove(CustomerInformationEntity customerInfo);

    void remove(long customerId);

}
