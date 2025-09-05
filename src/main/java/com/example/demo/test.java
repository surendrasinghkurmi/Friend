package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class test {

    @Id
    int srno;
    String name;

    public int getSrno() {
        return srno;
    }

    public String getName() {
        return name;
    }

    public test(int srno) {
        this.srno = srno;
    }
}
