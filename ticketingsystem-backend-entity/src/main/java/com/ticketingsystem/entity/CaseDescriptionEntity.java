package com.ticketingsystem.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "case_desc")
public class CaseDescriptionEntity implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ticketId")
    private UserTicketEntity ticketId;

    @Column(name = "description")
    private String description;

    @Column(name = "last_modified")
    private Date lastModified;

    @Column(name = "opened_by")
    private String openedBy;

    @Column(name = "last_modified_by")
    private String lastModifiedBy;

    public void setId(long id)
    {
    	this.id = id;
    }
    public long getId()
    {
        return id;
    }

    public void setTicketId(UserTicketEntity ticketId)
    {
        this.ticketId = ticketId;
    }

    public UserTicketEntity getTicketId()
    {
        return ticketId;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Date getLastModified()
    {
        return lastModified;
    }

    public void setLastModified(Date lastModified)
    {
        this.lastModified = lastModified;
    }

    public String getOpenedBy()
    {
        return openedBy;
    }

    public void setOpenedBy(String openedBy)
    {
        this.openedBy = openedBy;
    }

    public String getLastModifiedBy()
    {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy)
    {
        this.lastModifiedBy = lastModifiedBy;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((lastModified == null) ? 0 : lastModified.hashCode());
        result = prime * result + ((lastModifiedBy == null) ? 0 : lastModifiedBy.hashCode());
        result = prime * result + ((openedBy == null) ? 0 : openedBy.hashCode());
        result = prime * result + ((ticketId == null) ? 0 : ticketId.hashCode());
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
        CaseDescriptionEntity other = (CaseDescriptionEntity) obj;
        if (description == null)
        {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        if (id != other.id)
            return false;
        if (lastModified == null)
        {
            if (other.lastModified != null)
                return false;
        }
        else if (!lastModified.equals(other.lastModified))
            return false;
        if (lastModifiedBy == null)
        {
            if (other.lastModifiedBy != null)
                return false;
        }
        else if (!lastModifiedBy.equals(other.lastModifiedBy))
            return false;
        if (openedBy == null)
        {
            if (other.openedBy != null)
                return false;
        }
        else if (!openedBy.equals(other.openedBy))
            return false;
        if (ticketId == null)
        {
            if (other.ticketId != null)
                return false;
        }
        else if (!ticketId.equals(other.ticketId))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "CaseDescriptionEntity [id=" + id + ", ticketId=" + ticketId + ", description=" + description + ", lastModified=" + lastModified + ", openedBy=" + openedBy
            + ", lastModifiedBy=" + lastModifiedBy + "]";
    }

}
