package com.alvim.home.domain.components.repo;

import com.alvim.home.domain.components.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRepo {
    private final List<Restaurant> restaurants = new ArrayList<>();

    public RestaurantRepo() {
        restaurants.add(new Restaurant(1, "Pizzaria Vai Que Vem"));
        restaurants.add(new Restaurant(2, "Lanchonete Sabor&Arte"));
    }

    public void add(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public Restaurant findById(int id) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getId() == id) {
                return restaurant;
            }
        }
        return null;
    }
}
