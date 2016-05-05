package com.ticketingsystem.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ticketingsystem.dao.UserDAO;
import com.ticketingsystem.entity.UserEntity;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	@Transactional
	public List<UserEntity> getAllUsers()
	{
		List<UserEntity> users = userDAO.getAllUserEntities();
		return users;
	}
	@Override
	@Transactional
	public UserEntity getUserByUserId(long userId)
	{
		UserEntity users = userDAO.getUserEntity(userId);
		return users;
	}
	@Override
	@Transactional
	public UserEntity add(UserEntity userEntity)
	{
		UserEntity user = userDAO.createUserEntity(userEntity);
		return user;
	}
	@Override
	@Transactional
	public UserEntity update(UserEntity userEntity)
	{
		UserEntity user = userDAO.updateUserEntity(userEntity);
		return user;
	}
	@Override
	@Transactional
	public void remove(UserEntity user)
	{
		userDAO.deleteUserEntity(user.getUserId());
	}
	@Override
	@Transactional
	public void remove(long userId)
	{
		userDAO.deleteUserEntity(userId);
	}
}
