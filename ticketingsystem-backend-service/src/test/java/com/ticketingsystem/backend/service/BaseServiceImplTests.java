package com.ticketingsystem.backend.service;

import junit.framework.TestCase;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations =
{ "classpath:/spring/ticketingsystem-service-context.xml" })
@Transactional
public class BaseServiceImplTests extends TestCase
{

}
