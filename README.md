# Restaurent_Application

## Backend Technology By Spring Boot and Spring boot Data JPA (hibernate)
- ## Routes 
```java
  /**
     * The Dependancy Injection for the Service
     */
    @Autowired
    private RestaurantService restaurantService;


    /**
     * this method to display the specific Restaurant by its id
     */
    @GetMapping("/restaurant/{id}")
    public Optional<Restaurant> show(@PathVariable int id){
        return this.restaurantService.show(id);
    }


    @GetMapping("/restaurant/{id}/user")
    public List<RestaurantUser> getListRestaurantWithUserReview(@PathVariable int id){
        return this.restaurantService.getListRestaurantWithUserReview(id);
    }

    /**
     * get The List of the Restaurants
     * @return
     */
    @GetMapping("/restaurant")
    public List<Restaurant> index(){
        return this.restaurantService.index();
    }
```
- ## BataBase
<img height=100 src="https://github.com/alitarfa/Restaurant_Application/blob/master/images/Screenshot%20from%202018-10-11%2014-21-18.png"/>
