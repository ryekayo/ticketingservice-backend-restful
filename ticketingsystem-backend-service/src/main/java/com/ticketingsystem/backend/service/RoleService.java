package com.ticketingsystem.backend.service;

import java.util.List;

import com.ticketingsystem.entity.RoleEntity;


public interface RoleService {
	
	List<RoleEntity> getAllRole();
	
	RoleEntity add(RoleEntity roleEntity);
	
	RoleEntity update(RoleEntity roleEntity);
	
	void remove(RoleEntity roleEntity);
	
	void remove(long id);
}
