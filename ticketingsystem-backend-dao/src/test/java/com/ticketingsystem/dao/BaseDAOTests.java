package com.ticketingsystem.dao;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
{ "classpath:/spring/ticketingsystem-dao-context.xml" })

@Transactional
public class BaseDAOTests extends TestCase
{
}
