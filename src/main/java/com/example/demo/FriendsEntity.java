package com.example.demo;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name="friends")
public class FriendsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "valid email")
    String email;
    @Size(min=2,max = 30 ,message = "Enter a Valid Name")
    String name;
    @NotNull
    String address;
    String nickname;
    int contact;

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNickname() {
        return nickname;
    }

    public int getContact() {
        return contact;
    }

    public FriendsEntity(int id, String email, String name, String address, String nickname, int contact) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.address = address;
        this.nickname = nickname;
        this.contact = contact;
    }

    public FriendsEntity() {

    }
}
