package com.example.demo.Menu;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MenuController {

    @Autowired
    MenuService menuService;

    @GetMapping("/menu")
    public String getMenu(){
        return  "yes";
    }

    @PostMapping("/menu")
    public String addMenu(@RequestBody MenuModel model){
        return menuService.addMenu(model);
    }

    @PutMapping("/menu/{id}")
    public String updateMenu(@PathVariable int id,@RequestBody MenuModel model){
        return  null;
    }
}
