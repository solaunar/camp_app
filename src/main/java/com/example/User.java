package com.example;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
class User{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int userId;

    private String username;
    private String name;
    private String lastname;
    private String email;
    private String location;
    private String phone;
    private String password;

    public User(){}

    public User(String name, String lastname, String email, String location, String phone,String username,  String password) {
        this.username = username;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.location = location;
        this.phone = phone;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getLocation() {
        return location;
    }

    public String getPhone() {
        return phone;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}