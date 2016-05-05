package com.ticketingsystem.backend.service;

import java.util.List;

import com.ticketingsystem.entity.UserTicketEntity;

public interface UserTicketService {

    List<UserTicketEntity> getAllTickets();

    UserTicketEntity getUserByTicketId(long ticketId);

    UserTicketEntity add(UserTicketEntity userTicketEntity);

    void remove(UserTicketEntity ticket);

    UserTicketEntity update(UserTicketEntity userTicketEntity);

    void remove(long ticketId);
}
