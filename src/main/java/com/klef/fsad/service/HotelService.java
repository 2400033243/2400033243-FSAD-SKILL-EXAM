package com.klef.fsad.service;

import org.springframework.stereotype.Service;

import com.klef.fsad.model.Hotel;
import com.klef.fsad.repository.HotelRepository;

@Service
public class HotelService {

    private final HotelRepository repo;

    public HotelService(HotelRepository repo) {
        this.repo = repo;
    }

    // Add Hotel
    public Hotel addHotel(Hotel hotel) {

        if(hotel.getHotelId()==null){
            throw new RuntimeException("Hotel ID must not be null");
        }

        return repo.save(hotel);
    }

    // Update Hotel
    public Hotel updateHotel(Long id,Hotel updatedHotel){

        Hotel hotel = repo.findById(id).orElseThrow();

        hotel.setName(updatedHotel.getName());
        hotel.setDate(updatedHotel.getDate());
        hotel.setStatus(updatedHotel.getStatus());
        hotel.setLocation(updatedHotel.getLocation());
        hotel.setRooms(updatedHotel.getRooms());

        return repo.save(hotel);
    }
}