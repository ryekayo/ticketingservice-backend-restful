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

import com.ticketingsystem.backend.service.CaseDescriptionService;
import com.ticketingsystem.entity.CaseDescriptionEntity;

@Controller
@RequestMapping("/casedescription")
public class CaseDescriptionController {
	
    private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
    @Autowired
    private CaseDescriptionService service;
	
    @RequestMapping(value = "", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody ArrayList<CaseDescriptionEntity> getCaseDescriptionList()
    {
    	System.out.println("CaseDescriptionController : getCaseDescriptionList : START");
    	ArrayList<CaseDescriptionEntity> description = (ArrayList) service.getAllCaseDescription();
    	return description;
    }
    @RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody ArrayList<CaseDescriptionEntity> getAllCaseDescriptionList()
    {
    	System.out.println("CaseDescriptionController : getCaseDescriptionList : START");
    	ArrayList<CaseDescriptionEntity> description = (ArrayList) service.getAllCaseDescription();
    	return description;
    }
    @RequestMapping(value = "/descriptionId/{descriptionId}", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody CaseDescriptionEntity getCaseDescriptionByCaseDescriptionId(@PathVariable("descriptionId") long descriptionId)
    {
    	System.out.println("CaseDescriptionController : getCaseDescriptionByCaseDescriptionId : START");
    	CaseDescriptionEntity description = service.getCaseDescriptionById(descriptionId);
    	return description;
    }
    @RequestMapping(value = "/create", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody CaseDescriptionEntity createCaseDescription(@RequestBody CaseDescriptionEntity description)
    {
    	System.out.println("CaseDescriptionController : createCaseDescription : START");
    	CaseDescriptionEntity caseDescription = service.add(description);
    	return caseDescription;
    }
    @RequestMapping(value = "/update", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody CaseDescriptionEntity updateCaseDescription(@RequestBody CaseDescriptionEntity description)
    {
    	System.out.println("CaseDescriptionController : updateCaseDescription : START");
    	CaseDescriptionEntity caseDescription = service.update(description);
    	return caseDescription;
    }
    @RequestMapping(value = "/delete/{descriptionId}", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody void deleteDescription(@PathVariable("descriptionId") long descriptionId)
    {
    	service.remove(descriptionId);
    }
}
