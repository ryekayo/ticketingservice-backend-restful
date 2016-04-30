package com.ticketingsystem.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ticketingsystem.entity.UserEntity;

@Repository
public class UserDAOImpl implements UserDAO {
	
	private static final Log log = LogFactory.getLog(UserDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public UserEntity saveUserEntity(UserEntity userEntity)
	{
		this.sessionFactory.getCurrentSession().save(userEntity);
		return userEntity;
	}
	@Override
	public UserEntity createUserEntity(UserEntity userEntity)
	{
		this.sessionFactory.getCurrentSession().save(userEntity);
		this.sessionFactory.getCurrentSession().flush();
		this.sessionFactory.getCurrentSession().refresh(userEntity);
		return userEntity;
	}
	@Override
	public UserEntity updateUserEntity(UserEntity userEntity)
	{
		this.sessionFactory.getCurrentSession().update(userEntity);
		this.sessionFactory.getCurrentSession().flush();
		this.sessionFactory.getCurrentSession().refresh(userEntity);
		return userEntity;
	}

}
