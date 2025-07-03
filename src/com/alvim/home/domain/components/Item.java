package com.alvim.home.domain.components;

public class Item {
    private final int id;
    private final int qnt;
    private final int typeOfItem;

    public Item(int id, int qnt, int typeOfItem) {
        this.id = id;
        this.qnt = qnt;
        this.typeOfItem = typeOfItem;
    }

    public int getId() {
        return id;
    }

    public int getQnt() {
        return qnt;
    }

    public int getTypeOfItem() {
        return typeOfItem;
    }
}
