package com.alvim.home.domain.components.repo;

public class DBFake {
    public final ItemRepo itemRepo;
    public final RestaurantRepo restaurantRepo;
    public final ClientRepo clientRepo;

    public DBFake() {
        this.clientRepo = new ClientRepo();
        this.restaurantRepo = new RestaurantRepo();
        this.itemRepo = new ItemRepo();
    }
}
