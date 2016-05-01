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
@Table(name = "email_history")
public class EmailHistoryEntity implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "email_historyid")
    private long emailHistoryId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ticketId")
    private UserTicketEntity ticketId;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private UserEntity userId;

    @Column(name = "email_timestamp")
    private Date emailTimestamp;

    @Column(name = "email_sent")
    private String emailSent;

    @Column(name = "from_email")
    private String fromEmail;

    @Column(name = "to_email")
    private String toEmail;

    public long getEmailHistoryId()
    {
        return emailHistoryId;
    }

    public void setEmailHistoryId(long emailHistoryId)
    {
        this.emailHistoryId = emailHistoryId;
    }

    public UserTicketEntity getTicketId()
    {
        return ticketId;
    }

    public void setTicketNumber(UserTicketEntity ticketId)
    {
        this.ticketId = ticketId;
    }

    public UserEntity getUserId()
    {
        return userId;
    }

    public void setUserId(UserEntity userId)
    {
        this.userId = userId;
    }
    
    public Date getEmailTimestamp()
    {
        return emailTimestamp;
    }

    public void setEmailTimestamp(Date emailTimestamp)
    {
        this.emailTimestamp = emailTimestamp;
    }

    public String getEmailSent()
    {
        return emailSent;
    }

    public void setEmailSent(String emailSent)
    {
        this.emailSent = emailSent;
    }

    public String getFromEmail()
    {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail)
    {
        this.fromEmail = fromEmail;
    }

    public String getToEmail()
    {
        return toEmail;
    }

    public void setToEmail(String toEmail)
    {
        this.toEmail = toEmail;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((emailSent == null) ? 0 : emailSent.hashCode());
        result = prime * result + ((emailTimestamp == null) ? 0 : emailTimestamp.hashCode());
        result = prime * result + ((fromEmail == null) ? 0 : fromEmail.hashCode());
        result = prime * result + (int) (emailHistoryId ^ (emailHistoryId >>> 32));
        result = prime * result + ((ticketId == null) ? 0 : ticketId.hashCode());
        result = prime * result + ((userId == null) ? 0 : userId.hashCode());
        result = prime * result + ((toEmail == null) ? 0 : toEmail.hashCode());
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
        EmailHistoryEntity other = (EmailHistoryEntity) obj;
        if (emailSent == null)
        {
            if (other.emailSent != null)
                return false;
        }
        else if (!emailSent.equals(other.emailSent))
            return false;
        if (emailTimestamp == null)
        {
            if (other.emailTimestamp != null)
                return false;
        }
        else if (!emailTimestamp.equals(other.emailTimestamp))
            return false;
        if (fromEmail == null)
        {
            if (other.fromEmail != null)
                return false;
        }
        else if (!fromEmail.equals(other.fromEmail))
            return false;
        if (emailHistoryId != other.emailHistoryId)
            return false;
        if (ticketId == null)
        {
            if (other.ticketId != null)
                return false;
        }
        else if (!ticketId.equals(other.ticketId))
            return false;        
        if (ticketId == null)
        {
            if (other.userId != null)
                return false;
        }
        else if (!userId.equals(other.userId))
            return false;        
        if (toEmail == null)
        {
            if (other.toEmail != null)
                return false;
        }
        else if (!toEmail.equals(other.toEmail))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "EmailHistoryEntity [emailHistoryId=" + emailHistoryId + ", ticketId=" + ticketId + ", userId=" + userId + ", emailTimestamp=" + emailTimestamp + ", emailSent=" + emailSent + ", fromEmail=" + fromEmail
            + ", toEmail=" + toEmail + "]";
    }

}
