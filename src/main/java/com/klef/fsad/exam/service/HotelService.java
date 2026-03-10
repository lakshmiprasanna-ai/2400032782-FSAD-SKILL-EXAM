package com.klef.fsad.exam.service;

import com.klef.fsad.exam.model.Hotel;

public interface HotelService 
{
    public Hotel addHotel(Hotel hotel);
    
    public Hotel updateHotel(int id, Hotel hotel);
}