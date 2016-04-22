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

    @Column(name = "ticket_number")
    private long ticketNumber;

    @Column(name = "opened")
    private Date dateOpened;

    @Column(name = "priority")
    private String priorityType;

    @Column(name = "case_owner")
    private String caseOwner;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public long getTicketNumber()
    {
        return ticketNumber;
    }

    public void setTicketNumber(long ticketNumber)
    {
        this.ticketNumber = ticketNumber;
    }

    public Date getDateOpened()
    {
        return dateOpened;
    }

    public void setDateOpened(Date dateOpened)
    {
        this.dateOpened = dateOpened;
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

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((caseOwner == null) ? 0 : caseOwner.hashCode());
        result = prime * result + ((dateOpened == null) ? 0 : dateOpened.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((priorityType == null) ? 0 : priorityType.hashCode());
        result = prime * result + (int) (ticketNumber ^ (ticketNumber >>> 32));
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
        if (priorityType == null)
        {
            if (other.priorityType != null)
                return false;
        }
        else if (!priorityType.equals(other.priorityType))
            return false;
        if (ticketNumber != other.ticketNumber)
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "UserTicketEntity [id=" + id + ", ticketNumber=" + ticketNumber + ", dateOpened=" + dateOpened + ", priorityType=" + priorityType + ", caseOwner=" + caseOwner + "]";
    }

}
