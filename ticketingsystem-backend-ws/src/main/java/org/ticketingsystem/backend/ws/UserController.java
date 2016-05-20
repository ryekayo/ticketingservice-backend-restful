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

import com.ticketingsystem.entity.UserEntity;
import com.ticketingsystem.backend.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value = "", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody ArrayList<UserEntity> getUserIdList()
	{
		System.out.println("UserController : getUserIdList : START");
		ArrayList<UserEntity> user = (ArrayList) service.getAllUsers();
		return user;
	}
	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody ArrayList<UserEntity> getAllUserIdList()
	{
		System.out.println("UserController : getAllUserIdList : START");
		ArrayList<UserEntity> user = (ArrayList) service.getAllUsers();
		return user;
	}
	@RequestMapping(value = "/userid/{userId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody UserEntity getUserByUserId(@PathVariable("userId") long userId)
	{
		System.out.println("UserController : getUserByUserId : START");
		UserEntity user = service.getUserByUserId(userId);
		System.out.println("UserController : getUserByUserId : user : " + user);
		return user;
	}
	@RequestMapping(value = "/create", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody UserEntity createUser(@RequestBody UserEntity user)
	{
		System.out.println("UserController : createUser : START");
		UserEntity userEntity = service.add(user);
		System.out.println("UserController : createUser : userEntity : " + userEntity);
		return userEntity;
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody UserEntity updateUser(@RequestBody UserEntity user)
	{
		System.out.println("UserController : updateUser : START");
		UserEntity userEntity = service.update(user);
		System.out.println("UserController : updateUser : userEntity : " + userEntity);
		return userEntity;
	}
	@RequestMapping(value = "/delete/{userId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody void deleteUser(@PathVariable("userId") long userId)
	{
		
	}
}
