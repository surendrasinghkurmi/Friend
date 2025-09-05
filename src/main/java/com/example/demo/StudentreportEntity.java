package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name="Studentreport")
public class StudentreportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    int hindi,english,maths,science,art,computer,total,percentage,result;
    String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setHindi(int hindi) {
        this.hindi = hindi;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public void setArt(int art) {
        this.art = art;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setComputer(int computer) {
        this.computer = computer;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getHindi() {
        return hindi;
    }

    public int getEnglish() {
        return english;
    }

    public int getMaths() {
        return maths;
    }

    public int getScience() {
        return science;
    }

    public int getArt() {
        return art;
    }

    public int getComputer() {
        return computer;
    }

    public int getTotal() {
        return total;
    }

    public int getResult() {
        return result;
    }

    public int getPercentage() {
        return percentage;
    }

    public String getName() {
        return name;
    }

    public StudentreportEntity(int id, int hindi, int english, int maths, int science, int art, int computer, int percentage, int total, int result, String name) {
        this.id = id;
        this.hindi = hindi;
        this.english = english;
        this.maths = maths;
        this.science = science;
        this.art = art;
        this.computer = computer;
        this.percentage = percentage;
        this.total = total;
        this.result = result;
        this.name = name;
    }

    public StudentreportEntity() {
    }
}
