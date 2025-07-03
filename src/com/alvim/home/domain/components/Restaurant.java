package com.alvim.home.domain.components;

public class Restaurant {
    private final int id;
    private final String name;
    private String address;

    public Restaurant(int id,String name){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
