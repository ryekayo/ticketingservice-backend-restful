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

import com.ticketingsystem.backend.service.TicketHistoryService;
import com.ticketingsystem.entity.TicketHistoryEntity;

@Controller
@RequestMapping("/tickethistory")
public class TicketHistoryController {

	private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	@Autowired
	private TicketHistoryService service;
	
	@RequestMapping(value = "", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody ArrayList<TicketHistoryEntity> getTicketHistoryIdList()
	{
		System.out.println("TicketHistoryController : getTicketHistoryIdList : START");
		ArrayList<TicketHistoryEntity> history = (ArrayList) service.getAllTicketHistory();
		return history;
	}
	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody ArrayList<TicketHistoryEntity> getAllTicketHistoryIdList()
	{
		System.out.println("TicketHistoryController : getAllTicketHistoryIdList : START");
		ArrayList<TicketHistoryEntity> history = (ArrayList) service.getAllTicketHistory();
		return history;
	}
	@RequestMapping(value = "/tickethistoryid/{tickethistoryid}", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody TicketHistoryEntity getTicketHistoryByTicketHistoryId(@PathVariable("tickethistoryid") long tickethistoryid)
    {
		System.out.println("TicketHistoryController : getTicketHistoryByTicketHistoryId : START");
		TicketHistoryEntity history = service.getTicketByTicketHistoryId(tickethistoryid);
		System.out.println("TicketHistoryController : getTicketHistoryByTicketHistoryId : history " + history);
		return history;
    }
	@RequestMapping(value = "/create", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody TicketHistoryEntity createTicketHistory(@RequestBody TicketHistoryEntity ticketHistory)
	{
		System.out.println("TicketHistoryController : createTicketHistory : ticketHistory = " + ticketHistory);
		TicketHistoryEntity history = service.add(ticketHistory);
		System.out.println("TicketHistoryEntity : createTicketHistory : TicketHistoryEntity = " + history);
		return history;
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody TicketHistoryEntity updateTicketHistory(@RequestBody TicketHistoryEntity ticketHistory)
	{
		System.out.println("TicketHistoryController : updateTicketHistory : ticketHistory = " + ticketHistory);
		TicketHistoryEntity history = service.update(ticketHistory);
		System.out.println("TicketHistoryEntity : updateTicketHistory : TicketHistoryEntity = " + history);
		return history;
	}
	@RequestMapping(value = "/delete/{tickethistoryid}", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody void deleteTicketHistory(@PathVariable("tickethistoryid") long tickethistorid)
	{
		service.remove(tickethistorid);
	}
}
