package com.example.demo.Menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {
    @Autowired
    MenuRepository menuRepository;


    public String addMenu(MenuModel model){
        MenuModel menuModel=menuRepository.save(model);
        return menuModel!= null ? "added": "not added";
    }

}
