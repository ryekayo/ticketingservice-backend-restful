package com.ticketingsystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "customer")
public class CustomerEntity implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "ticket_number")
    private String ticketNumber;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getTicketNumber()
    {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber)
    {
        this.ticketNumber = ticketNumber;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
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
        CustomerEntity other = (CustomerEntity) obj;
        if (customerName == null)
        {
            if (other.customerName != null)
                return false;
        }
        else if (!customerName.equals(other.customerName))
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
        return true;
    }

    @Override
    public String toString()
    {
        return "CustomerEntity [id=" + id + ", customerName=" + customerName + ", ticketNumber=" + ticketNumber + "]";
    }

}
