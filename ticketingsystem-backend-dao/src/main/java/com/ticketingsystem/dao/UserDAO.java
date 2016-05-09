package com.ticketingsystem.dao;

import java.util.List;

import com.ticketingsystem.entity.UserEntity;

public interface UserDAO {
	
	public UserEntity saveUserEntity(UserEntity userEntity);
	
	public UserEntity createUserEntity(UserEntity userEntity);
	
	public UserEntity updateUserEntity(UserEntity userEntity);
	
	public void deleteUserEntity(long userId);
	
	public void deleteUserEntity(UserEntity userEntity);
	
	public List<UserEntity> getAllUserEntities();
	
	public UserEntity getUserEntity(long userId);
	
	public List<UserEntity> getUserEntitiesByLogin(String userName, String password);
	
	public List<UserEntity> getAllUserEntitiesByUserName(String userName);
	
	public List<UserEntity> getAllUserEntitiesByEmail(String emailAddress);
	
	public List<UserEntity> getAllUserEntitiesById(long userId);
}
