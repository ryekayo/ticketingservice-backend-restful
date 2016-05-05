package com.ticketingsystem.backend.service;

import java.util.List;

import com.ticketingsystem.entity.UserEntity;

public interface UserService {

    List<UserEntity> getAllUsers();

    UserEntity getUserByUserId(long userId);

    UserEntity add(UserEntity userEntity);
    
    UserEntity update(UserEntity userEntity);

    void remove(UserEntity user);

    void remove(long userId);
}
