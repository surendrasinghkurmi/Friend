package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name="Jobs")
public class JobsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String name;
    String address;
    String jobtital;
    int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJobtital(String jobtital) {
        this.jobtital = jobtital;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getJobtital() {
        return jobtital;
    }

    public int getSalary() {
        return salary;
    }

    public JobsEntity(String name, String address, String jobtital, int salary) {
        this.name = name;
        this.address = address;
        this.jobtital = jobtital;
        this.salary = salary;
    }

    public JobsEntity() {
    }
}
