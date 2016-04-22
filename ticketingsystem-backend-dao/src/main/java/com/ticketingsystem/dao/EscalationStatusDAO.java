package com.ticketingsystem.dao;

import java.util.List;

import com.ticketingsystem.entity.EscalationStatusEntity;

public interface EscalationStatusDAO
{

    public EscalationStatusEntity saveTicketStatusEntity(EscalationStatusEntity ticketNumber);

    public EscalationStatusEntity createTicketStatusEntity(EscalationStatusEntity ticketNumber);

    public EscalationStatusEntity updateTicketStatusEntity(EscalationStatusEntity ticketNumber);

    public void deleteEscalationStatusEntity(Long Id);

    public void deleteEscalationStatusEntity(EscalationStatusEntity ticketNumber);

    public List<EscalationStatusEntity> getAllTicketStatusEntitys();

    public EscalationStatusEntity getTicketStatusEntity(Long Id);

    public List<EscalationStatusEntity> getTicketStatusEntity(EscalationStatusEntity exampleTicketStatusEntity);

    public List<EscalationStatusEntity> getTicketStatusEntityById(long id);
}
