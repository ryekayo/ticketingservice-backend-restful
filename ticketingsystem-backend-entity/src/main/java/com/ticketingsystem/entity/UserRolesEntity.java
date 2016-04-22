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
    @JoinColumn(name = "rolename")
    private UserRolesEntity roleName;

    @Column(name = "description")
    private String description;

    @Column(name = "rolename_code")
    private String roleNameCode;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public UserRolesEntity getRoleName()
    {
        return roleName;
    }

    public void setRoleName(UserRolesEntity roleName)
    {
        this.roleName = roleName;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getRoleNameCode()
    {
        return roleNameCode;
    }

    public void setRoleNameCode(String roleNameCode)
    {
        this.roleNameCode = roleNameCode;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((roleName == null) ? 0 : roleName.hashCode());
        result = prime * result + ((roleNameCode == null) ? 0 : roleNameCode.hashCode());
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
        if (description == null)
        {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
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
        if (roleNameCode == null)
        {
            if (other.roleNameCode != null)
                return false;
        }
        else if (!roleNameCode.equals(other.roleNameCode))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "UserRolesEntity [id=" + id + ", roleName=" + roleName + ", description=" + description + ", roleNameCode=" + roleNameCode + "]";
    }

}