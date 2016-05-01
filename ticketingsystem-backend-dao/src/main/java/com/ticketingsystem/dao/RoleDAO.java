package com.ticketingsystem.dao;

import java.util.List;

import com.ticketingsystem.entity.RoleEntity;

public interface RoleDAO {
	
	public RoleEntity saveRoleEntity(RoleEntity roleEntity);
	
	public RoleEntity createRoleEntity(RoleEntity roleEntity);
	
	public RoleEntity updateRoleEntity(RoleEntity roleEntity);
	
	public void deleteRoleEntity(long roleId);
	
	public void deleteRoleEntity(RoleEntity roleEntity);
	
	public List<RoleEntity> getAllRoleEntities();
	
	public RoleEntity getRoleEntity(long roleId);
	
	public List<RoleEntity> getAllRoleEntitiesByRoleId(long roleId);
	
	public List<RoleEntity> getAllRoleEntitiesByRoleName(String roleName);
}
