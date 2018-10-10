package com.example.demo.Menu;

import javax.persistence.*;

@Entity
public class MenuModel {

    @Id
    private int id;
    @Column
    private String name;

}
