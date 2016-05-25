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

import com.ticketingsystem.backend.service.RoleService;
import com.ticketingsystem.entity.RoleEntity;

@Controller
@RequestMapping("/role")
public class RoleController {
	
	private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	@Autowired
	private RoleService service;
	
	@RequestMapping(value="",method = RequestMethod.GET, headers="Accept=application/json") 
	public @ResponseBody ArrayList<RoleEntity> getRoleList()
	{
		System.out.println("RoleController : getRoleList : START");
		ArrayList<RoleEntity> role = (ArrayList) service.getAllRole();
		return role;
	}
	@RequestMapping(value="/",method = RequestMethod.GET, headers="Accept=application/json") 
	public @ResponseBody ArrayList<RoleEntity> getAllRoles()
	{
		System.out.println("RoleController : getAllRoles : START");
		ArrayList<RoleEntity> role = (ArrayList) service.getAllRole();
		return role;
	}
	@RequestMapping(value="/create",method = RequestMethod.GET, headers="Accept=application/json")
	public @ResponseBody RoleEntity createRole(@RequestBody RoleEntity newRole)
	{
		System.out.println("RoleController : createRole : START");
		RoleEntity role = service.add(newRole);
		return role;
	}
	@RequestMapping(value="/update",method = RequestMethod.GET, headers="Accept=application/json")
	public @ResponseBody RoleEntity updateRole(@RequestBody RoleEntity updateRole)
	{
		System.out.println("RoleController : updateRole : START");
		RoleEntity role = service.update(updateRole);
		return role;
	}
	@RequestMapping(value="/delete/{roleId}", method = RequestMethod.GET, headers="Accept=application/json")
	public @ResponseBody void deleteRole(@PathVariable("roleId") long roleId)
	{
		service.remove(roleId);
	}
}
