package com.ticketingsystem.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ticketingsystem.dao.UserDAO;
import com.ticketingsystem.entity.UserEntity;

@Transactional
@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	@Transactional
	public UserEntity login(String username, String password)
	{
		List<UserEntity> users = userDAO.getUserEntitiesByLogin(username, password);
		UserEntity user = null;
		if(users != null && users.size() > 0)
		{
			user = users.get(0);
		}
		return user;		
	}
	@Override
	@Transactional
	public UserEntity loginByUserName(String username)
	{
		List<UserEntity> users = userDAO.getAllUserEntitiesByUserName(username);
		UserEntity user = null;
		if(users != null && users.size() > 0)
		{
			user = users.get(0);
		}
		return user;
	}
}
