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
@Table(name = "ticket_status")
public class TicketStatusEntity implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ticket_number")
    private TicketStatusEntity ticketNumber;

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

    public TicketStatusEntity getTicketNumber()
    {
        return ticketNumber;
    }

    public void setTicketNumber(TicketStatusEntity ticketNumber)
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
        result = prime * result + ((dateOpened == null) ? 0 : dateOpened.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + (isOpen ? 1231 : 1237);
        result = prime * result + ((lastModified == null) ? 0 : lastModified.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((ticketNumber == null) ? 0 : ticketNumber.hashCode());
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
        TicketStatusEntity other = (TicketStatusEntity) obj;
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
        if (status == null)
        {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (ticketNumber == null)
        {
            if (other.ticketNumber != null)
                return false;
        }
        else if (!ticketNumber.equals(other.ticketNumber))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "TicketStatusEntity [id=" + id + ", ticketNumber=" + ticketNumber + ", dateOpened=" + dateOpened + ", lastModified=" + lastModified + ", status=" + status
            + ", isOpen=" + isOpen + "]";
    }

}
