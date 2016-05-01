package com.ticketingsystem.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ticketingsystem.entity.RoleEntity;

@Repository
public class RoleDAOImpl implements RoleDAO {

	private static final Log log = LogFactory.getLog(RoleDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	@Override
	public RoleEntity saveRoleEntity(RoleEntity roleEntity)
	{
		this.sessionFactory.getCurrentSession().saveOrUpdate(roleEntity);
		return roleEntity;
	}
	@Override
	public RoleEntity createRoleEntity(RoleEntity roleEntity)
	{
		this.sessionFactory.getCurrentSession().save(roleEntity);
		this.sessionFactory.getCurrentSession().flush();
		this.sessionFactory.getCurrentSession().refresh(roleEntity);
		return roleEntity;
	}
	@Override
	public RoleEntity updateRoleEntity(RoleEntity roleEntity)
	{
		this.sessionFactory.getCurrentSession().update(roleEntity);
		this.sessionFactory.getCurrentSession().flush();
		this.sessionFactory.getCurrentSession().refresh(roleEntity);
		return roleEntity;
	}
	@Override
	public void deleteRoleEntity(long roleId)
	{
		RoleEntity role = new RoleEntity();
		this.sessionFactory.getCurrentSession().delete(role);
	}
	@Override
	public void deleteRoleEntity(RoleEntity roleEntity)
	{
		this.sessionFactory.getCurrentSession().delete(roleEntity);
	}
	@Override
	public List<RoleEntity> getAllRoleEntities()
	{
		String query = "from RoleEntity";
		List<RoleEntity> role = this.sessionFactory.getCurrentSession().createQuery(query).list();
		return role;
	}
	@Override
	public RoleEntity getRoleEntity(long roleId)
	{
		return (RoleEntity) this.sessionFactory.getCurrentSession().get(RoleEntity.class, roleId);
	}
	@Override
	public List<RoleEntity> getAllRoleEntitiesByRoleId(long roleId)
	{
		List<RoleEntity> role = 
				this.sessionFactory.getCurrentSession().createQuery("from RoleEntity where roleId = ?").setParameter(0, roleId).list();
		return role;
	}
	@Override
	public List<RoleEntity> getAllRoleEntitiesByRoleName(String roleName)
	{
		List<RoleEntity> role =
				this.sessionFactory.getCurrentSession().createQuery("from RoleEntity where roleName = ?").setParameter(0, roleName).list();
		return role;
	}
}
