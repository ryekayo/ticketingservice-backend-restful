package org.ticketingsystem.backend.ws;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ticketingsystem.backend.service.CustomerInformationService;
import com.ticketingsystem.entity.CustomerInformationEntity;

@Controller
@RequestMapping("/customer")
public class CustomerInformationController
{

    private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Autowired
    private CustomerInformationService service;

    @RequestMapping(value = "", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody ArrayList<CustomerInformationEntity> getCustomerIdList()
    {
        System.out.println("CustomerInformationController : getCustomerIdList : START");
        ArrayList<CustomerInformationEntity> customer = (ArrayList) service.getAllCustomerInformation();
        return customer;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody ArrayList<CustomerInformationEntity> getAllCustomers()
    {
        System.out.println("CustomerInformationController : getCustomerIdList : START");
        ArrayList<CustomerInformationEntity> customer = (ArrayList) service.getAllCustomerInformation();
        return customer;
    }

    @RequestMapping(value = "/customerId/{customerId}", method = RequestMethod.GET, headers = "Accept=application/json", produces = "application/json")
    public @ResponseBody CustomerInformationEntity getCustomerByCustomerId(@PathVariable("customerId") long customerId)
    {
        System.out.println("CustomerInformationController : getCustomerByCustomerId : customerId = " + customerId);
        CustomerInformationEntity customer = service.getEmailHistoryById(customerId);
        System.out.println("CustomerInformationController : getCustomerByCustomerId : CustomerInformationEntity = " + customer);
        return customer;
    }
}
