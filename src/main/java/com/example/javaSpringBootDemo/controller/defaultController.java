package com.example.javaSpringBootDemo.controller;

import com.example.javaSpringBootDemo.entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class defaultController {

    @Autowired
    private HotelRepo hotelRepository;

    @GetMapping("/")
    public String healthCheck(){
    return "Health ok";
    }
    @GetMapping("/hotel")
    public Iterable<Hotel> getHotels() {
        return hotelRepository.findAll();
    }

@PostMapping("/add")
public String addHotel(@RequestBody Hotel h) {
    Hotel hotel = new Hotel();
    hotel.setHotelName(h.getHotelName());
    hotel.setPrice(h.getPrice());
    hotelRepository.save(hotel);
    return "Added new hotel to repo!";
}
}
