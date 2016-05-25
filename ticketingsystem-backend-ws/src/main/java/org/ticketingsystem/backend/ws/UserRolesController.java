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

import com.ticketingsystem.backend.service.UserRolesService;
import com.ticketingsystem.entity.UserRolesEntity;

@Controller
@RequestMapping("/userroles")
public class UserRolesController {
	
	private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	@Autowired
	private UserRolesService service;
	
	@RequestMapping(value = "/create", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody UserRolesEntity createUserRole(@RequestBody UserRolesEntity userRole)
	{
		System.out.println("UserRolesController : createUserRole : START");
		UserRolesEntity role = service.add(userRole);
		System.out.println("UserRolesController : createUserRole : role: " + role);
		return role;
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody UserRolesEntity updateUserRole(@RequestBody UserRolesEntity userRole)
	{
		System.out.println("UserRolesController : updateUserRole : START");
		UserRolesEntity role = service.update(userRole);
		System.out.println("UserRolesController : updateUserRole : role: " + role);
		return role;
	}
	@RequestMapping(value = "/delete/{roleId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody void removeUserRole(@PathVariable("roleId") long roleId)
	{
		service.remove(roleId);
	}
}
