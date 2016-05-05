package com.ticketingsystem.backend.service;

import java.util.List;

import com.ticketingsystem.entity.TicketHistoryEntity;
import com.ticketingsystem.entity.UserTicketEntity;

public interface TicketHistoryService {
	
    List<TicketHistoryEntity> getAllTicketHistory();

    TicketHistoryEntity getTicketByTicketHistoryId(long ticketHistoryId);

    TicketHistoryEntity add(TicketHistoryEntity ticketHistoryEntity);
    
    TicketHistoryEntity update(TicketHistoryEntity ticketHistoryEntity);

    void remove(TicketHistoryEntity ticket);

    void remove(long ticketHistoryId);
}
