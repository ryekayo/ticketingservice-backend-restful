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
@Table(name = "escalation_status")
public class EscalationStatusEntity implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ticketId")
    private UserTicketEntity ticketId;

    @Column(name = "is_escalated")
    private boolean isEscalated;

    @Column(name = "date_escalated")
    private Date dateEscalated;

    @Column(name = "assigned_to")
    private String assignedTo;

    @Column(name = "notes")
    private String notes;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public UserTicketEntity getTicketId()
    {
        return ticketId;
    }

    public void setTicketId(UserTicketEntity ticketId)
    {
        this.ticketId = ticketId;
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

    public String getAssignedTo()
    {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo)
    {
        this.assignedTo = assignedTo;
    }

    public String getNotes()
    {
        return notes;
    }

    public void setNotes(String notes)
    {
        this.notes = notes;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((assignedTo == null) ? 0 : assignedTo.hashCode());
        result = prime * result + ((dateEscalated == null) ? 0 : dateEscalated.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + (isEscalated ? 1231 : 1237);
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
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
        EscalationStatusEntity other = (EscalationStatusEntity) obj;
        if (assignedTo == null)
        {
            if (other.assignedTo != null)
                return false;
        }
        else if (!assignedTo.equals(other.assignedTo))
            return false;
        if (dateEscalated == null)
        {
            if (other.dateEscalated != null)
                return false;
        }
        else if (!dateEscalated.equals(other.dateEscalated))
            return false;
        if (id != other.id)
            return false;
        if (isEscalated != other.isEscalated)
            return false;
        if (notes == null)
        {
            if (other.notes != null)
                return false;
        }
        else if (!notes.equals(other.notes))
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
        return "EscalationStatusEntity [id=" + id + ", ticketId=" + ticketId + ", isEscalated=" + isEscalated + ", dateEscalated=" + dateEscalated + ", assignedTo="
            + assignedTo + ", notes=" + notes + "]";
    }

}
