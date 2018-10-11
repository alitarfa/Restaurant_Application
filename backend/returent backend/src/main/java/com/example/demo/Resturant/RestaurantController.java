package com.example.demo.Resturant;

import com.example.demo.RestaurantUser.RestaurantUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class RestaurantController {

    /**
     * The Dependancy Injection for the Service
     */
    @Autowired
    private RestaurantService restaurantService;

    /**
     * get The List of the Restaurants
     * @return
     */
    @GetMapping("/restaurant")
    public List<Restaurant> index(){
        return this.restaurantService.index();
    }


    /**
     * this method to display the specific Restaurant by its id
     */
    @GetMapping("/restaurant/{id}")
    public Optional<Restaurant> show(@PathVariable int id){
        return this.restaurantService.show(id);
    }

    /**
     * To Create The One Restaurant to DataBase
     */
    public void create(){

    }

    @GetMapping("/restaurant/{id}/user")
    public List<RestaurantUser> getListRestaurantWithUserReview(@PathVariable int id){
        return this.restaurantService.getListRestaurantWithUserReview(id);
    }

    @GetMapping("/restaurant/user")
    public List<RestaurantUser> getListRestaurantWithUsers(){
        return this.restaurantService.getListRestaurantWithUsers();
    }


}
