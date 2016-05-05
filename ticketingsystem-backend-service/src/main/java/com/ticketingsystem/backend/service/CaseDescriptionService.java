package com.ticketingsystem.backend.service;

import java.util.List;

import com.ticketingsystem.entity.CaseDescriptionEntity;

public interface CaseDescriptionService {

    List<CaseDescriptionEntity> getAllCaseDescription();

    CaseDescriptionEntity getCaseDescriptionById(long caseId);

    CaseDescriptionEntity add(CaseDescriptionEntity caseDescription);
    
    CaseDescriptionEntity update(CaseDescriptionEntity caseDescription);

    void remove(CaseDescriptionEntity caseDescription);

    void remove(long caseId);	
}
