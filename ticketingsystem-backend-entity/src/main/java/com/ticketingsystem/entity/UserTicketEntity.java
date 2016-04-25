package com.ticketingsystem.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "user_ticket")
public class UserTicketEntity implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "priority")
    private String priorityType;

    @Column(name = "case_owner")
    private String caseOwner;

    @Column(name = "date_time_opened")
    private Date dateOpened;

    @Column(name = "last_modified")
    private Date lastModified;

    @Column(name = "status")
    private String status;

    @Column(name = "is_open")
    private boolean isOpen;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getPriorityType()
    {
        return priorityType;
    }

    public void setPriorityType(String priorityType)
    {
        this.priorityType = priorityType;
    }

    public String getCaseOwner()
    {
        return caseOwner;
    }

    public void setCaseOwner(String caseOwner)
    {
        this.caseOwner = caseOwner;
    }

    public Date getDateOpened()
    {
        return dateOpened;
    }

    public void setDateOpened(Date dateOpened)
    {
        this.dateOpened = dateOpened;
    }

    public Date getLastModified()
    {
        return lastModified;
    }

    public void setLastModified(Date lastModified)
    {
        this.lastModified = lastModified;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public boolean isOpen()
    {
        return isOpen;
    }

    public void setOpen(boolean isOpen)
    {
        this.isOpen = isOpen;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((caseOwner == null) ? 0 : caseOwner.hashCode());
        result = prime * result + ((dateOpened == null) ? 0 : dateOpened.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + (isOpen ? 1231 : 1237);
        result = prime * result + ((lastModified == null) ? 0 : lastModified.hashCode());
        result = prime * result + ((priorityType == null) ? 0 : priorityType.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
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
        UserTicketEntity other = (UserTicketEntity) obj;
        if (caseOwner == null)
        {
            if (other.caseOwner != null)
                return false;
        }
        else if (!caseOwner.equals(other.caseOwner))
            return false;
        if (dateOpened == null)
        {
            if (other.dateOpened != null)
                return false;
        }
        else if (!dateOpened.equals(other.dateOpened))
            return false;
        if (id != other.id)
            return false;
        if (isOpen != other.isOpen)
            return false;
        if (lastModified == null)
        {
            if (other.lastModified != null)
                return false;
        }
        else if (!lastModified.equals(other.lastModified))
            return false;
        if (priorityType == null)
        {
            if (other.priorityType != null)
                return false;
        }
        else if (!priorityType.equals(other.priorityType))
            return false;
        if (status == null)
        {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "UserTicketEntity [id=" + id + ", priorityType=" + priorityType + ", caseOwner=" + caseOwner + ", dateOpened=" + dateOpened + ", lastModified=" + lastModified
            + ", status=" + status + ", isOpen=" + isOpen + "]";
    }

}
