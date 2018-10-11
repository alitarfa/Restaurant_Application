package com.example.demo.User;

import com.example.demo.RestaurantUser.RestaurantUser;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nameUser;
    private String email;
    private String password;

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL,mappedBy = "user")
    private List<RestaurantUser> restaurantUsers;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public List<RestaurantUser> getRestaurantUsers() {
        return restaurantUsers;
    }

    public void setRestaurantUsers(List<RestaurantUser> restaurantUsers) {
        this.restaurantUsers = restaurantUsers;
    }
}
