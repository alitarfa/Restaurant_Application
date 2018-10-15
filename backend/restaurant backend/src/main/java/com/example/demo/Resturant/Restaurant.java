package com.example.demo.Resturant;

import com.example.demo.RestaurantUser.RestaurantUser;
import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    private int moyen;

    @OneToMany(mappedBy = "restaurantModel")
    private List<RestaurantUser> restaurantUserSet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<RestaurantUser> getRestaurantUserSet() {
        return restaurantUserSet;
    }

    public void setRestaurantUserSet(List<RestaurantUser> restaurantUserSet) {
        this.restaurantUserSet = restaurantUserSet;
    }

    public int getMoyen() {
        return moyen;
    }

    public void setMoyen(int moyen) {
        this.moyen = moyen;
    }
}


