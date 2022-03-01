package com.example.javaSpringBootDemo.entity;
import javax.persistence.*;

@Entity
@Table(name="hotels")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String hotelName;

    private int price;


    public Hotel(String hotelName, int price) {

        this.hotelName = hotelName;
        this.price = price;
    }

    public Hotel(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}