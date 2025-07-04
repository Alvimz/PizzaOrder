package com.alvim.home.domain.components;

public class Item {
    private final int id;
    private int qnt;
    private final int typeOfItem;

    public Item(int id, int typeOfItem) {
        this.id = id;

        this.typeOfItem = typeOfItem;
    }

    public Item(int id, int qnt, int typeOfItem){
        super();
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
