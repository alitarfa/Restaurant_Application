package com.example.demo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> index(){
        return this.userRepository.findAll();

    }
    public void show(){

    }
    public void create(){

    }
    public void update(){

    }
    public void delete(){

    }


}
