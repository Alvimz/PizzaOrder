package com.alvim.home.domain.components;

public class Client {
    private final int id;
    private final String name;
    private String address;

    public Client(int id,String name){
        this.name = name;

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }
}
