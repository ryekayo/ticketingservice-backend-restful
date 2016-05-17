package org.ticketingsystem.backend.ws;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ticketingsystem.entity.UserTicketEntity;
import com.ticketingsystem.backend.service.UserTicketService;

@Controller
@RequestMapping("/tickets")
public class TicketController {
	
	private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	@Autowired
	private UserTicketService service;
	
	@RequestMapping(value="",method = RequestMethod.GET, headers="Accept=application/json") 
	public @ResponseBody ArrayList<UserTicketEntity> getTicketList()
	{
		System.out.println("TicketController: getTicketList: START");
		ArrayList<UserTicketEntity> userTicketEntity = (ArrayList) service.getAllTickets();
		return userTicketEntity;
	}
	@RequestMapping(value="/",method = RequestMethod.GET, headers="Accept=application/json") 
	public @ResponseBody ArrayList<UserTicketEntity> getAllTickets()
	{
		System.out.println("TicketController: getAllTickets: START");
		ArrayList<UserTicketEntity> userTicketEntity = (ArrayList) service.getAllTickets();
		return userTicketEntity;
	}
	@RequestMapping(value="/ticketId/{ticketId}",method = RequestMethod.GET, headers="Accept=application/json")
	public @ResponseBody UserTicketEntity getTicketByTicketId(@PathVariable("ticketId") long ticketId)
	{
		System.out.println("TicketController: getTicketByTicketId: ticketId = " + ticketId);
		UserTicketEntity userTicket = service.getUserByTicketId(ticketId);
		System.out.println("TicketController: getTicketByTicketId: UserTicketEntity = " + userTicket);
		return userTicket;
	}
	@RequestMapping(value="/create", method = RequestMethod.GET, headers="Accept=application/json")
	public @ResponseBody UserTicketEntity createTicket(@RequestBody UserTicketEntity ticket)
	{
		System.out.println("TicketController: createTicket: ticket = " + ticket);
		UserTicketEntity userTicket = service.add(ticket);
		System.out.println("TicketController: createTicket: UserTicketEntity = " + userTicket);
		return userTicket;
	}
	@RequestMapping(value="/update", method = RequestMethod.GET, headers="Accept=application/json")
	public @ResponseBody UserTicketEntity updateTicket(@RequestBody UserTicketEntity ticket)
	{
		System.out.println("TicketController: updateTicket: ticket = " + ticket);
		UserTicketEntity userTicket = service.update(ticket);
		System.out.println("TicketController: updateTicket: UserTicketEntity = " + userTicket);
		return userTicket;
	}
	@RequestMapping(value="/delete/{ticketId}", method = RequestMethod.GET, headers="Accept=application/json")
	public @ResponseBody void deleteTicket(@PathVariable("ticketId") long ticketId)
	{
		service.remove(ticketId);
	}
}
