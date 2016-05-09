package com.ticketingsystem.dao;

import java.util.List;

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
		this.sessionFactory.getCurrentSession().saveOrUpdate(userEntity);
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
	@Override
	public void deleteUserEntity(long userId)
	{
		UserEntity userEntity = new UserEntity();
		this.sessionFactory.getCurrentSession().delete(userEntity);
	}
	@Override
	public void deleteUserEntity(UserEntity userEntity)
	{
		this.sessionFactory.getCurrentSession().delete(userEntity);
	}
	@Override
	public List<UserEntity> getAllUserEntities()
	{
		String query = "from UserEntity";
		List<UserEntity> user = this.sessionFactory.getCurrentSession().createQuery(query).list();
		return user;
	}
	@Override
	public UserEntity getUserEntity(long userId)
	{
		return (UserEntity) this.sessionFactory.getCurrentSession().get(UserEntity.class, userId);
	}
	@Override
	public List<UserEntity> getAllUserEntitiesByUserName(String userName)
	{
		List<UserEntity> user = 
				this.sessionFactory.getCurrentSession().createQuery("from UserEntity userId where userName =?").setParameter(0, userName).list();
		return user;
	}
	@Override
	public List<UserEntity> getAllUserEntitiesByEmail(String emailAddress)
	{
		List<UserEntity> email = 
				this.sessionFactory.getCurrentSession().createQuery("from UserEntity userId where emailAddress =?").setParameter(0,  emailAddress).list();
		return email;
	}
	@Override
	public List<UserEntity> getAllUserEntitiesById(long userId)
	{
		List<UserEntity> id = 
				this.sessionFactory.getCurrentSession().createQuery("from UserEntity where userId =?").setParameter(0, userId).list();
		return id;
	}

	@Override
	public List<UserEntity> getUserEntitiesByLogin(String userName, String password) {
		List<UserEntity> user = 
				this.sessionFactory.getCurrentSession().createQuery("from UserEntity where userName =? and password =?").setParameter(0, userName).setParameter(1, password).list();
		return user;
	}
}
