package com.ticketingsystem.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "role")
public class RoleEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roleId")
    private long roleId;
    
    @Column(name = "admin_access")
    private boolean adminAccess;
    
    @Column(name = "moderator_access")
    private boolean moderatorAccess;
    
    @Column(name = "observer_access")
    private boolean observerAccess;
    
    @Column(name = "rolename")
    private String roleName;
    
    public long getRoleId()
    {
    	return roleId;
    }
    public void setRoleId(long roleId)
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
    	return moderatorAccess;
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
        result = prime * result + (int) (roleId ^ (roleId >>> 32));
        result = prime * result + ((roleName == null) ? 0 : roleName.hashCode());
        result = prime * result + (adminAccess ? 1231 : 1237);
        result = prime * result + (moderatorAccess ? 1231 : 1237);
        result = prime * result + (observerAccess ? 1231 : 1237);
        
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
        RoleEntity other = (RoleEntity) obj;
        if (roleId != other.roleId)
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
        return "RoleEntity [roleId=" + roleId + ", adminAccess=" + adminAccess + ", moderatorAccess=" + moderatorAccess + ", observerAccess=" + observerAccess + "roleName=" + roleName +  "]";
    }
}
