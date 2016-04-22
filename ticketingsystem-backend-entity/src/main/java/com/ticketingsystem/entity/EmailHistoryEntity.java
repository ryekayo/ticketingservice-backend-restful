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
    @Column(name = "id")
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ticket_number")
    private EmailHistoryEntity ticketNumber;

    @Column(name = "email_timestamp")
    private Date emailTimestamp;

    @Column(name = "email_sent")
    private String emailSent;

    @Column(name = "from_email")
    private String fromEmail;

    @Column(name = "to_email")
    private String toEmail;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public EmailHistoryEntity getTicketNumber()
    {
        return ticketNumber;
    }

    public void setTicketNumber(EmailHistoryEntity ticketNumber)
    {
        this.ticketNumber = ticketNumber;
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
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((ticketNumber == null) ? 0 : ticketNumber.hashCode());
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
        if (id != other.id)
            return false;
        if (ticketNumber == null)
        {
            if (other.ticketNumber != null)
                return false;
        }
        else if (!ticketNumber.equals(other.ticketNumber))
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
        return "EmailHistoryEntity [id=" + id + ", ticketNumber=" + ticketNumber + ", emailTimestamp=" + emailTimestamp + ", emailSent=" + emailSent + ", fromEmail=" + fromEmail
            + ", toEmail=" + toEmail + "]";
    }

}
