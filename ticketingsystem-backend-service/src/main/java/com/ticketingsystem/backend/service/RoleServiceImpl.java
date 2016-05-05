package com.ticketingsystem.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ticketingsystem.dao.RoleDAO;
import com.ticketingsystem.entity.RoleEntity;

@Transactional
@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDAO roleDAO;
	
	@Override
	@Transactional
	public List<RoleEntity> getAllRole()
	{
		List<RoleEntity> role = roleDAO.getAllRoleEntities();
		return role;
	}
	@Override
	@Transactional
	public RoleEntity add(RoleEntity roleEntity)
	{
		RoleEntity role = roleDAO.createRoleEntity(roleEntity);
		return role;
	}
	@Override
	@Transactional
	public RoleEntity update(RoleEntity roleEntity)
	{
		RoleEntity role = roleDAO.updateRoleEntity(roleEntity);
		return role;
	}
	@Override
	@Transactional
	public void remove(RoleEntity roleEntity)
	{
		roleDAO.deleteRoleEntity(roleEntity);
	}
	@Override
	@Transactional
	public void remove(long id)
	{
		roleDAO.deleteRoleEntity(id);
	}
}
