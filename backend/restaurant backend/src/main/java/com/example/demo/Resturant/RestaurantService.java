package com.example.demo.Resturant;

import com.example.demo.RestaurantUser.RestaurantUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {
    /**
     * DI for The Repository
     */
    @Autowired
    private RestaurantRepository restaurantRepository;

    public List<Restaurant> index(){
       return this.restaurantRepository.findAll();
    }

    public Optional<Restaurant> show(int id){
        return this.restaurantRepository.findById(id);
    }

    public void create(){

    }

    public List<RestaurantUser> getListRestaurantWithUserReview(int id){
        Optional<Restaurant> restaurant=this.restaurantRepository.findById(id);
        return  restaurant.get().getRestaurantUserSet();
    }

    public List<RestaurantUser> getListRestaurantWithUsers(){
        List<Restaurant> restaurantList=this.restaurantRepository.findAll();
        return restaurantList.get(0).getRestaurantUserSet();
    }

}
