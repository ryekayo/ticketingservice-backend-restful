package com.ticketingsystem.backend.service;

import com.ticketingsystem.entity.UserRolesEntity;

public interface UserRolesService {

	UserRolesEntity add(UserRolesEntity userRolesEntity);
	
	UserRolesEntity update(UserRolesEntity userRolesEntity);
	
	void remove(UserRolesEntity userRolesEntity);
	
	void remove(long id);
}
