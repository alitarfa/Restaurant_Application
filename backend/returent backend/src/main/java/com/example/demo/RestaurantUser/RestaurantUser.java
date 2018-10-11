package com.example.demo.RestaurantUser;

import com.example.demo.Resturant.Restaurant;
import com.example.demo.User.User;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class RestaurantUser implements Serializable{

    @Id
    @ManyToOne
    private User user;

    @Id
    @ManyToOne
    private Restaurant restaurantModel;

    private int qualitySalle;
    private int qualityNorr;
    private int qualityService;



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public int getQualitySalle() {
        return qualitySalle;
    }

    public void setQualitySalle(int qualitySalle) {
        this.qualitySalle = qualitySalle;
    }

    public int getQualityNorr() {
        return qualityNorr;
    }

    public void setQualityNorr(int qualityNorr) {
        this.qualityNorr = qualityNorr;
    }

    public int getQualityService() {
        return qualityService;
    }

    public void setQualityService(int qualityService) {
        this.qualityService = qualityService;
    }

    public Restaurant getRestaurantModel() {
        return restaurantModel;
    }

    public void setRestaurantModel(Restaurant restaurantModel) {
        this.restaurantModel = restaurantModel;
    }
}
