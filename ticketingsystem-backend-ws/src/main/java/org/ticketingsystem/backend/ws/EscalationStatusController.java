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

import com.ticketingsystem.backend.service.EscalationStatusService;
import com.ticketingsystem.entity.EscalationStatusEntity;

@Controller
@RequestMapping("/escalationstatus")
public class EscalationStatusController {
	
	private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	@Autowired
	private EscalationStatusService service;
	
	@RequestMapping(value = "", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody ArrayList<EscalationStatusEntity> getEscalationStatusId()
	{
		System.out.println("EscalationStatusController : getEscalationStatusId : START");
		ArrayList<EscalationStatusEntity> escalation = (ArrayList) service.getAllEscalationStatus();
		return escalation;
	}
	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody ArrayList<EscalationStatusEntity> getAllEscalationStatusId()
	{
		System.out.println("EscalationStatusController : getEscalationStatusId : START");
		ArrayList<EscalationStatusEntity> escalation = (ArrayList) service.getAllEscalationStatus();
		return escalation;
	}
	@RequestMapping(value = "/escalationid/{escalationId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody EscalationStatusEntity getEscalationStatusById(@PathVariable("escalationId") long escalationId)
	{
		System.out.println("EscalationStatusController : getEscalationStatusById : START");
		EscalationStatusEntity escalation = service.getTicketById(escalationId);
		System.out.println("EscalationStatusController : getEscalationStatusById : escalationId : " + escalation);
		return escalation;
	}
	@RequestMapping(value = "/create", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody EscalationStatusEntity createEscalationStatus(@RequestBody EscalationStatusEntity escalationStatus)
	{
		System.out.println("EscalationStatusController : createEscalationStatus : START");
		EscalationStatusEntity escalation = service.add(escalationStatus);
		return escalation;
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody EscalationStatusEntity updateEscalationStatus(@RequestBody EscalationStatusEntity escalationStatus)
	{
		System.out.println("EscalationStatusController : updateEscalationStatus : START");
		EscalationStatusEntity escalation = service.update(escalationStatus);
		return escalation;
	}
	@RequestMapping(value = "/delete/{escalationId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody void deleteEscalationStatus(@PathVariable("escalationId") long escalationId)
	{
		service.remove(escalationId);
	}
}
