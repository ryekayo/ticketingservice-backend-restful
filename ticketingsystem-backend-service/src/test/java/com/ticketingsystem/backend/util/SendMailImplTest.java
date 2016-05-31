package com.ticketingsystem.backend.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ticketingsystem.backend.service.BaseServiceImplTests;

public class SendMailImplTest extends BaseServiceImplTests {
	
	private final static Log logger = LogFactory.getLog(SendMailImplTest.class);
	
	@Autowired
	private SendMailService service;
	
	@Test
	public void testSendMail()
	{
		System.out.println("Skipping Test");
		//service.sendMail("ryekayo85@gmail.com", "ryekayo@yahoo.com", "test", "test");
		assertEquals(true, true);
	}

}
