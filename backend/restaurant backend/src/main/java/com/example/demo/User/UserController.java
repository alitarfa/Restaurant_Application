package com.example.demo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> index(){
        return this.userService.index();
    }

    @GetMapping("/user/{id}")
    public void show(@PathVariable int id){

    }
    public void create(){

    }
    public void update(){

    }
    public void delete(){

    }
}
