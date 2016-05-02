package com.ticketingsystem.dao;

import java.util.List;

import com.ticketingsystem.entity.RoleEntity;
import com.ticketingsystem.entity.UserEntity;
import com.ticketingsystem.entity.UserRolesEntity;

public interface UserRolesDAO {
	
	public UserRolesEntity saveUserRolesEntity(UserRolesEntity userRolesEntity);
	
	public UserRolesEntity createUserRolesEntity(UserRolesEntity userRolesEntity);

	public UserRolesEntity updateUserRolesEntity(UserRolesEntity userRolesEntity);
	
	public void deleteUserRolesEntity(long id);
	
	public void deleteUserRolesEntity(UserRolesEntity userRolesEntity);
	
	public List<UserRolesEntity> getAllUserRolesEntities();
	
	public UserRolesEntity getUserRolesEntity(long id);
	
	public List<UserRolesEntity> getUserRolesEntityByUserId(UserEntity userId);
	
	public List<UserRolesEntity> getUserRolesEntityByRoleId(RoleEntity roleId);
}
