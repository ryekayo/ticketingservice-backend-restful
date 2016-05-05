package com.ticketingsystem.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ticketingsystem.dao.UserRolesDAO;
import com.ticketingsystem.entity.UserRolesEntity;

@Transactional
@Service("userRolesService")
public class UserRolesServiceImpl implements UserRolesService {
	
	@Autowired
	private UserRolesDAO userRolesDAO;
	
	@Override
	@Transactional
	public UserRolesEntity add(UserRolesEntity userRolesEntity)
	{
		UserRolesEntity userRoles = userRolesDAO.createUserRolesEntity(userRolesEntity);
		return userRoles;
	}
	@Override
	@Transactional
	public UserRolesEntity update(UserRolesEntity userRolesEntity)
	{
		UserRolesEntity userRoles = userRolesDAO.updateUserRolesEntity(userRolesEntity);
		return userRoles;
	}
	@Override
	@Transactional
	public void remove(UserRolesEntity userRolesEntity)
	{
		userRolesDAO.deleteUserRolesEntity(userRolesEntity);
	}
	@Override
	@Transactional
	public void remove(long id)
	{
		userRolesDAO.deleteUserRolesEntity(id);
	}
}
