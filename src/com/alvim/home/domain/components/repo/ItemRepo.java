package com.alvim.home.domain.components.repo;

import com.alvim.home.domain.components.Item;

import java.util.List;

public class ItemRepo {
    private List<Item> itensRepo;

    public ItemRepo() {

        itensRepo.add(new Item(1, 15, 1));
        itensRepo.add(new Item(2, 20, 2));
    }


    private void addItemList(Item i){
        itensRepo.add(i);
    }

    public Item findById(int id) {
        for (Item item : itensRepo) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
