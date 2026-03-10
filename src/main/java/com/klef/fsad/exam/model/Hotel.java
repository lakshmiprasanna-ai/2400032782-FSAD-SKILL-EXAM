package com.klef.fsad.exam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel 
{
    @Id
    private int hotelId;   // ID must be given manually

    private String name;
    private String date;
    private String status;

    public Hotel() 
    {
        
    }

    public int getHotelId() 
    {
        return hotelId;
    }

    public void setHotelId(int hotelId) 
    {
        this.hotelId = hotelId;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getDate() 
    {
        return date;
    }

    public void setDate(String date) 
    {
        this.date = date;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }
}