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
@Table(name = "ticket_history")
public class TicketHistoryEntity implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tickethistory_id")
    private long ticketHistoryId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ticketId")
    private UserTicketEntity ticketId;

    @Column(name = "case_owner")
    private String caseOwner;

    @Column(name = "date_opened")
    private Date dateOpened;

    @Column(name = "last_modified")
    private Date lastModified;

    @Column(name = "lastmod_by")
    private String lastModBy;

    @Column(name = "status_change")
    private String statusChange;

    @Column(name = "is_closed")
    private boolean isClosed;

    @Column(name = "email_timestamp")
    private Date emailTimestamp;

    @Column(name = "date_closed")
    private Date dateClosed;

    @Column(name = "is_escalated")
    private boolean isEscalated;

    @Column(name = "date_escalated")
    private Date dateEscalated;

    public long getTicketHistoryId()
    {
        return ticketHistoryId;
    }

    public void setTicketHistoryId(long ticketHistoryId)
    {
        this.ticketHistoryId = ticketHistoryId;
    }

    public UserTicketEntity getTicketNumber()
    {
        return ticketId;
    }

    public void setTicketNumber(UserTicketEntity ticketId)
    {
        this.ticketId = ticketId;
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

    public String getLastModBy()
    {
        return lastModBy;
    }

    public void setLastModBy(String lastModBy)
    {
        this.lastModBy = lastModBy;
    }

    public String getStatusChange()
    {
        return statusChange;
    }

    public void setStatusChange(String statusChange)
    {
        this.statusChange = statusChange;
    }

    public boolean isClosed()
    {
        return isClosed;
    }

    public void setClosed(boolean isClosed)
    {
        this.isClosed = isClosed;
    }

    public Date getEmailTimestamp()
    {
        return emailTimestamp;
    }

    public void setEmailTimestamp(Date emailTimestamp)
    {
        this.emailTimestamp = emailTimestamp;
    }

    public Date getDateClosed()
    {
        return dateClosed;
    }

    public void setDateClosed(Date dateClosed)
    {
        this.dateClosed = dateClosed;
    }

    public boolean isEscalated()
    {
        return isEscalated;
    }

    public void setEscalated(boolean isEscalated)
    {
        this.isEscalated = isEscalated;
    }

    public Date getDateEscalated()
    {
        return dateEscalated;
    }

    public void setDateEscalated(Date dateEscalated)
    {
        this.dateEscalated = dateEscalated;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((caseOwner == null) ? 0 : caseOwner.hashCode());
        result = prime * result + ((dateClosed == null) ? 0 : dateClosed.hashCode());
        result = prime * result + ((dateEscalated == null) ? 0 : dateEscalated.hashCode());
        result = prime * result + ((dateOpened == null) ? 0 : dateOpened.hashCode());
        result = prime * result + ((emailTimestamp == null) ? 0 : emailTimestamp.hashCode());
        result = prime * result + (int) (ticketHistoryId ^ (ticketHistoryId >>> 32));
        result = prime * result + (isClosed ? 1231 : 1237);
        result = prime * result + (isEscalated ? 1231 : 1237);
        result = prime * result + ((lastModBy == null) ? 0 : lastModBy.hashCode());
        result = prime * result + ((lastModified == null) ? 0 : lastModified.hashCode());
        result = prime * result + ((statusChange == null) ? 0 : statusChange.hashCode());
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
        TicketHistoryEntity other = (TicketHistoryEntity) obj;
        if (caseOwner == null)
        {
            if (other.caseOwner != null)
                return false;
        }
        else if (!caseOwner.equals(other.caseOwner))
            return false;
        if (dateClosed == null)
        {
            if (other.dateClosed != null)
                return false;
        }
        else if (!dateClosed.equals(other.dateClosed))
            return false;
        if (dateEscalated == null)
        {
            if (other.dateEscalated != null)
                return false;
        }
        else if (!dateEscalated.equals(other.dateEscalated))
            return false;
        if (dateOpened == null)
        {
            if (other.dateOpened != null)
                return false;
        }
        else if (!dateOpened.equals(other.dateOpened))
            return false;
        if (emailTimestamp == null)
        {
            if (other.emailTimestamp != null)
                return false;
        }
        else if (!emailTimestamp.equals(other.emailTimestamp))
            return false;
        if (ticketHistoryId != other.ticketHistoryId)
            return false;
        if (isClosed != other.isClosed)
            return false;
        if (isEscalated != other.isEscalated)
            return false;
        if (lastModBy == null)
        {
            if (other.lastModBy != null)
                return false;
        }
        else if (!lastModBy.equals(other.lastModBy))
            return false;
        if (lastModified == null)
        {
            if (other.lastModified != null)
                return false;
        }
        else if (!lastModified.equals(other.lastModified))
            return false;
        if (statusChange == null)
        {
            if (other.statusChange != null)
                return false;
        }
        else if (!statusChange.equals(other.statusChange))
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
        return "TicketHistoryEntity [ticketHistoryId=" + ticketHistoryId + ", ticketId=" + ticketId + ", caseOwner=" + caseOwner + ", dateOpened=" + dateOpened + ", lastModified=" + lastModified
            + ", lastModBy=" + lastModBy + ", statusChange=" + statusChange + ", isClosed=" + isClosed + ", emailTimestamp=" + emailTimestamp + ", dateClosed=" + dateClosed
            + ", isEscalated=" + isEscalated + ", dateEscalated=" + dateEscalated + "]";
    }

}
