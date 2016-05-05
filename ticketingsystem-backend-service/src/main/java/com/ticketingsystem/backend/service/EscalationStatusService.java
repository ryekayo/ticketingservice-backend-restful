package com.ticketingsystem.backend.service;

import java.util.List;

import com.ticketingsystem.entity.EscalationStatusEntity;

public interface EscalationStatusService {
	
    List<EscalationStatusEntity> getAllEscalationStatus();

    EscalationStatusEntity getTicketById(long id);

    EscalationStatusEntity add(EscalationStatusEntity escalationStatusEntity);
    
    EscalationStatusEntity update(EscalationStatusEntity escalationStatusEntity);

    void remove(EscalationStatusEntity ticket);

    void remove(long id);
}
