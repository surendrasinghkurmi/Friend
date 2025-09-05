package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class persons {
    @Id
    int id;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public persons(int id) {
        this.id = id;
    }

    public persons(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public persons() {
    }
}
