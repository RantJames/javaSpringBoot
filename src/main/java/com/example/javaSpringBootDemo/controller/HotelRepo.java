package com.example.javaSpringBootDemo.controller;
import com.example.javaSpringBootDemo.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepo extends JpaRepository<Hotel, Integer> {
    Hotel findHotelById(Integer id);
}