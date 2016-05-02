package com.ticketingsystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("entity")
@Entity
@Table(name = "user_roles")
public class UserRolesEntity implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private UserEntity userId;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "roleId")
    private RoleEntity roleId;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public RoleEntity getRoleId()
    {
        return roleId;
    }

    public void setRoleId(RoleEntity roleId)
    {
        this.roleId = roleId;
    }
    public UserEntity getUserId()
    {
    	return userId;
    }
    public void setUserId(UserEntity userId)
    {
    	this.userId = userId;
    }
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((userId == null) ? 0 : userId.hashCode());
        result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserRolesEntity other = (UserRolesEntity) obj;
        if (roleId == null)
        {
            if (other.roleId != null)
                return false;
        }
        else if (!roleId.equals(other.roleId))
            return false;
        
        if (userId == null)
        {
            if (other.userId != null)
                return false;
        }
        else if (!userId.equals(other.userId))
            return false;
        
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "UserRolesEntity [id=" + id + ", roleId=" + roleId + ", userId=" + userId + "]";
    }

}