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
@Table(name = "customer_info")
public class CustomerInformationEntity implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerId")
    private long customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_email")
    private String customerEmail;

    @Column(name = "customer_phone")
    private String customerPhone;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "priority")
    private String priorityLevel;

    @Column(name = "escalated")
    private boolean isEscalated;

    public long getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId(long customerId)
    {
        this.customerId = customerId;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getCustomerEmail()
    {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail)
    {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone()
    {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone)
    {
        this.customerPhone = customerPhone;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public String getPriorityLevel()
    {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel)
    {
        this.priorityLevel = priorityLevel;
    }

    public boolean getEscalated()
    {
        return isEscalated;
    }

    public void setEscalated(boolean isEscalated)
    {
        this.isEscalated = isEscalated;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
        result = prime * result + ((customerEmail == null) ? 0 : customerEmail.hashCode());
        result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
        result = prime * result + ((customerPhone == null) ? 0 : customerPhone.hashCode());
        result = prime * result + (int) (customerId ^ (customerId >>> 32));
        result = prime * result + (isEscalated ? 1231 : 1237);
        result = prime * result + ((priorityLevel == null) ? 0 : priorityLevel.hashCode());
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
        CustomerInformationEntity other = (CustomerInformationEntity) obj;
        if (companyName == null)
        {
            if (other.companyName != null)
                return false;
        }
        else if (!companyName.equals(other.companyName))
            return false;
        if (customerEmail == null)
        {
            if (other.customerEmail != null)
                return false;
        }
        else if (!customerEmail.equals(other.customerEmail))
            return false;
        if (customerName == null)
        {
            if (other.customerName != null)
                return false;
        }
        else if (!customerName.equals(other.customerName))
            return false;
        if (customerPhone == null)
        {
            if (other.customerPhone != null)
                return false;
        }
        else if (!customerPhone.equals(other.customerPhone))
            return false;
        if (customerId != other.customerId)
            return false;
        if (isEscalated != other.isEscalated)
            return false;
        if (priorityLevel == null)
        {
            if (other.priorityLevel != null)
                return false;
        }
        else if (!priorityLevel.equals(other.priorityLevel))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "CustomerInformationEntity [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail=" + customerEmail + ", customerPhone="
            + customerPhone + ", companyName=" + companyName + ", priorityLevel=" + priorityLevel + ", isEscalated=" + isEscalated + "]";
    }

}
