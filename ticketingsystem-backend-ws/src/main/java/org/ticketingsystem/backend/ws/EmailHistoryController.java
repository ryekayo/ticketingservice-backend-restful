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


import com.ticketingsystem.entity.EmailHistoryEntity;
import com.ticketingsystem.backend.service.EmailHistoryService;

@Controller
@RequestMapping("/emailhistory")
public class EmailHistoryController {
	
	@Autowired
	private EmailHistoryService service;
	
    @RequestMapping(value = "", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody ArrayList<EmailHistoryEntity> getEmailHistoryIdList()
    {
    	System.out.println("EmailHistoryController : getEmailHistoryIdList : START");
    	ArrayList<EmailHistoryEntity> history = (ArrayList) service.getAllEmailHistory();
    	return history;
    }
    @RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody ArrayList<EmailHistoryEntity> getAllEmailHistoryList()
    {
    	System.out.println("EmailHistoryController : getEmailHistoryIdList : START");
    	ArrayList<EmailHistoryEntity> history = (ArrayList) service.getAllEmailHistory();
    	return history;
    }
    @RequestMapping(value = "/emailhistoryid/{emailHistoryId}", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody EmailHistoryEntity getEmailHistoryById(@PathVariable("emailHistoryId") long emailHistoryId)
    {
    	System.out.println("EmailHistoryController : getEmailHistoryById : START");
    	EmailHistoryEntity history = service.getEmailHistoryById(emailHistoryId);
    	System.out.println("EmailHistoryController : getEmailHistoryById : emailHistoryId : " + emailHistoryId);
    	return history;
    }   
    @RequestMapping(value = "/create", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody EmailHistoryEntity createEmailHistory(@RequestBody EmailHistoryEntity emailHistory)
    {
    	System.out.println("EmailHistoryController : createEmailHistory : START");
    	EmailHistoryEntity history = service.add(emailHistory);
    	return history;
    }
    @RequestMapping(value = "/update", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody EmailHistoryEntity updateEmailHistory(@RequestBody EmailHistoryEntity emailHistory)
    {
    	System.out.println("EmailHistoryController : updateEmailHistory : START");
    	EmailHistoryEntity history = service.update(emailHistory);
    	return history;
    }
    @RequestMapping(value = "/delete/{emailHistoryId}", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody void deleteEmailHistoryEntity(@PathVariable("emailHistoryId") long emailHistoryId)
    {
    	service.remove(emailHistoryId);
    }
}
