package com.ticketingsystem.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ticketingsystem.entity.RoleEntity;
import com.ticketingsystem.entity.UserEntity;
import com.ticketingsystem.entity.UserRolesEntity;

@Repository
public class UserRolesDAOImpl implements UserRolesDAO {
	
	private static final Log log = LogFactory.getLog(UserRolesDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	@Override
	public UserRolesEntity saveUserRolesEntity(UserRolesEntity userRolesEntity)
	{
		this.sessionFactory.getCurrentSession().saveOrUpdate(userRolesEntity);
		return userRolesEntity;
	}
	@Override
	public UserRolesEntity createUserRolesEntity(UserRolesEntity userRolesEntity)
	{
		this.sessionFactory.getCurrentSession().save(userRolesEntity);
		this.sessionFactory.getCurrentSession().flush();
		this.sessionFactory.getCurrentSession().refresh(userRolesEntity);
		return userRolesEntity;
	}
	@Override
	public UserRolesEntity updateUserRolesEntity(UserRolesEntity userRolesEntity)
	{
		this.sessionFactory.getCurrentSession().update(userRolesEntity);
		this.sessionFactory.getCurrentSession().flush();
		this.sessionFactory.getCurrentSession().refresh(userRolesEntity);
		return userRolesEntity;
	}
	@Override
	public void deleteUserRolesEntity(long id)
	{
		UserRolesEntity userRoles = new UserRolesEntity();
		this.sessionFactory.getCurrentSession().delete(userRoles);
	}
	@Override
	public void deleteUserRolesEntity(UserRolesEntity userRolesEntity)
	{
		this.sessionFactory.getCurrentSession().delete(userRolesEntity);
	}
	@Override
	public List<UserRolesEntity> getAllUserRolesEntities()
	{
		String query = "from UserRolesEntity";
		List<UserRolesEntity> roles = this.sessionFactory.getCurrentSession().createQuery(query).list();
		return roles;
	}
	@Override
	public UserRolesEntity getUserRolesEntity(long id)
	{
		return (UserRolesEntity) this.sessionFactory.getCurrentSession().get(UserRolesEntity.class, id);
	}
	@Override
	public List<UserRolesEntity> getUserRolesEntityByUserId(UserEntity userId)
	{
		List<UserRolesEntity> user = 
				this.sessionFactory.getCurrentSession().createQuery("from UserRolesEntity where userId = ?").setParameter(0, userId).list();
		return user;
	}
	@Override
	public List<UserRolesEntity> getUserRolesEntityByRoleId(RoleEntity roleId)
	{
		List<UserRolesEntity> role = 
				this.sessionFactory.getCurrentSession().createQuery("from UserRolesEntity where roleId =?").setParameter(0, roleId).list();
		return role;
	}
}