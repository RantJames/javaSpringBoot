package com.example.javaSpringBootDemo.controller;

import com.example.javaSpringBootDemo.entity.Hotel;
import com.example.javaSpringBootDemo.entity.ReservationDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class defaultController {

    @Autowired
    private HotelRepo hotelRepository;

    @GetMapping("/")
    public String healthCheck(){
    return "Health ok";
    }
    @GetMapping("/hotel")
//    public Hotel getHotel(@RequestParam(value = "name", defaultValue = "cozyPlace") String hotelName) {
//        return new Hotel(1, hotelName);
    public Iterable<Hotel> getHotels() {
        return hotelRepository.findAll();
    }



//    @RequestMapping(value = "/reservation", method = RequestMethod.POST, consumes = "application/json")
//    public String reserveHotel(@RequestBody ReservationDetails reservationDetails) {
//        return "Confirmation number is 12345 for the hotel: " + reservationDetails.getHname();
//    }
//@RequestMapping(value = "/reservation", method = RequestMethod.POST, consumes = "application/json")
//public String addHotel(@RequestBody Hotel hotelpost) {
//    Hotel hotelob = new Hotel();
//    hotelob.setHotelName(hotelpost.getHotelName());
//    hotelob.setPrice(hotelpost.getPrice());
//    hotelRepository.save(hotelob);
//    return "Added new hotel to database!";
//}
//@PostMapping("/add")
//public Hotel create(@RequestBody Map<String, String> body){
//    String name = body.get("hotelName");
//    int price = Integer.parseInt(body.get("price"));
//    return hotelRepository.save(new Hotel(name, price));
//}
@PostMapping("/add")
public String addHotel(@RequestBody Hotel h) {
    Hotel hotel = new Hotel();
    hotel.setHotelName(h.getHotelName());
    hotel.setPrice(h.getPrice());
    hotelRepository.save(hotel);
    return "Added new customer to repo!";
}


}
