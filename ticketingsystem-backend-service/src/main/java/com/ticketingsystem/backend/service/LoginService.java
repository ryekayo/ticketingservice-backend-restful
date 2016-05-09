package com.ticketingsystem.backend.service;

import com.ticketingsystem.entity.UserEntity;

public interface LoginService {
	
	UserEntity login(String username, String password);
	
	UserEntity loginByUserName(String username);

}
