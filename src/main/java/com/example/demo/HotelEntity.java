package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table (name="hotel")
public class HotelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String address;
    String state;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public HotelEntity(int id, String name, String address, String state) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.state = state;
    }

    public HotelEntity() {
    }
}
