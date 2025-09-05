package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name="cricketer")
public class CricketerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;
    String address;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public CricketerEntity(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public CricketerEntity() {
    }
}
