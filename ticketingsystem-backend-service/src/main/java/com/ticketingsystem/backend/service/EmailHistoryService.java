package com.ticketingsystem.backend.service;

import java.util.List;

import com.ticketingsystem.entity.EmailHistoryEntity;

public interface EmailHistoryService {
	
    List<EmailHistoryEntity> getAllEmailHistory();

    EmailHistoryEntity getEmailHistoryById(long emailHistoryId);

    EmailHistoryEntity add(EmailHistoryEntity emailHistory);
    
    EmailHistoryEntity update(EmailHistoryEntity emailHistory);

    void remove(EmailHistoryEntity emailHistory);

    void remove(long emailHistoryId);
}
