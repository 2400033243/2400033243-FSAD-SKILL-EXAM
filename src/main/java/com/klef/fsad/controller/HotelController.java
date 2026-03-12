package com.klef.fsad.controller;

import org.springframework.web.bind.annotation.*;

import com.klef.fsad.model.Hotel;
import com.klef.fsad.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    private final HotelService service;

    public HotelController(HotelService service){
        this.service=service;
    }

    // POST → Add Hotel
    @PostMapping("/add")
    public Hotel addHotel(@RequestBody Hotel hotel){
        return service.addHotel(hotel);
    }

    // PUT → Update Hotel
    @PutMapping("/update/{id}")
    public Hotel updateHotel(@PathVariable Long id,
                             @RequestBody Hotel hotel){

        return service.updateHotel(id,hotel);
    }
}