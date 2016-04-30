package com.ticketingsystem.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailHistoryDAOTest extends BaseDAOTests {

	final Logger logger = LoggerFactory.getLogger(EmailHistoryDAOTest.class);
	
	@Autowired
	private EmailHistoryDAO emailHistoryDAO;
	
	
	
    protected void setUp() throws Exception
    {
        System.out.println("Loading application context");
        System.out.println("Done Loading application context");
    }
    protected void tearDown() throws Exception
    {
        super.tearDown();
        System.out.println("tearDown: STARTING");
        System.out.println("tearDown: FINISHING");
    }
}
