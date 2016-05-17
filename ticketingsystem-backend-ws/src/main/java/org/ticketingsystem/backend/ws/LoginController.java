package org.ticketingsystem.backend.ws;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ticketingsystem.entity.UserEntity;
import com.ticketingsystem.backend.service.LoginService;
import com.ticketingsystem.backend.util.SendMailService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	private final SimpleDateFormat date = new SimpleDateFormat("yyyy-dd-MM");
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private SendMailService sendMailService;
	
	@RequestMapping(value = "/user/{username}/password/{password}", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody UserEntity login(@PathVariable("username") String userName, @PathVariable("password") String password)
	{
		System.out.println("LoginController: login: START: username= " + userName + "password= " + password);
		UserEntity userEntity = null;
		if(userName != null && (password != null && !password.equals(null)))
		{
			userEntity = loginService.login(userName, password);
		}
		else
		{
			userEntity = loginService.loginByUserName(userName);
		}
		System.out.println("LoginController: login: FINISH: userEntity= " + userEntity);
		return userEntity;
	}
	

}
