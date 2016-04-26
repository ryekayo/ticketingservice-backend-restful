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

    @Column(name = "admin_access")
    private boolean adminAccess;
    
    @Column(name = "moderator_access")
    private boolean moderatorAccess;
    
    @Column(name = "observer_access")
    private boolean observerAccess;

    @Column(name = "rolename")
    private String roleName;

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
    
    public boolean getAdminAccess()
    {
        return adminAccess;
    }

    public void setAdminAccess(boolean adminAccess)
    {
        this.adminAccess = adminAccess;
    }
    
    public boolean getModeratorAccess()
    {
        return adminAccess;
    }

    public void setModeratorAccess(boolean moderatorAccess)
    {
        this.moderatorAccess = moderatorAccess;
    }
    public boolean getObserverAccess()
    {
    	return observerAccess;
    }
    public void setObserverAccess(boolean observerAccess)
    {
    	this.observerAccess = observerAccess;
    }
    public String getRoleName()
    {
    	return roleName;
    }
    public void setRoleName(String roleName)
    {
    	this.roleName = roleName;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + (observerAccess ? 1231 : 1237);
        result = prime * result + (moderatorAccess ? 1231 : 1237);
        result = prime * result + (adminAccess ? 1231 : 1237);
        result = prime * result + ((userId == null) ? 0 : userId.hashCode());
        result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((roleName == null) ? 0 : roleName.hashCode());
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
        if (roleName == null)
        {
            if (other.roleName != null)
                return false;
        }
        else if (!roleName.equals(other.roleName))
            return false;
        if (adminAccess != other.adminAccess)
            return false;
        if (moderatorAccess != other.moderatorAccess)
            return false;
        if (observerAccess != other.observerAccess)
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "UserRolesEntity [id=" + id + ", roleId=" + roleId + ", userId=" + userId + ", adminAccess=" + adminAccess + ", "
        		+ "moderatorAccess=" + moderatorAccess + ", observerAccess=" + observerAccess + ", roleName=" + roleName + "]";
    }

}