package com.alvim.home.domain.components;

import java.util.List;

public class Order {
    private final int id;
    private final Client client;
    private final Restaurant restaurant;
    private final int paymentMethod; //TODO verificar se isso está certo, parece confuso!
    private final StatusOrder statusOrder = StatusOrder.PROCESSING;
    private final String note;
    private final List<Item> itens;
    private final float valuePayment;
    private final int tip;



    public Order(int paymentService, Restaurant restaurant,
                 Client client, int id, String note,
                 float valuePayment, List<Item> itens, int tip) {
        this.paymentMethod = paymentService;
        this.restaurant = restaurant;
        this.client = client;
        this.id = id;
        this.note = note;
        this.tip = tip;
        this.valuePayment = valuePayment;
        this.itens = itens;
    }

    public int getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

     public StatusOrder getStatusOrder() {
        return statusOrder;
    }

    public String getNote() {
        return note;
    }

    public int getTip() {
        return tip;
    }

    public float getValuePayment() {
        return valuePayment;
    }

    public List<Item> getItens() {
        return itens;
    }

    public int getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", client=" + client +
                ", restaurant=" + restaurant +
                ", paymentMethod=" + paymentMethod +
                ", statusOrder=" + statusOrder +
                ", note='" + note + '\'' +
                ", itens=" + itens +
                ", valuePayment=" + valuePayment +
                ", tip=" + tip +
                '}';
    }
}
