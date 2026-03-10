package com.klef.fsad.exam.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Hotel;
import com.klef.fsad.exam.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService
{

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel addHotel(Hotel hotel) 
    {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel updateHotel(int id, Hotel hotel) 
    {
        Optional<Hotel> obj = hotelRepository.findById(id);

        if(obj.isPresent())
        {
            Hotel h = obj.get();
            h.setName(hotel.getName());
            h.setDate(hotel.getDate());
            h.setStatus(hotel.getStatus());

            return hotelRepository.save(h);
        }

        return null;
    }

}