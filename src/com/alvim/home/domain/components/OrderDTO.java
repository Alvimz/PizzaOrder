package com.alvim.home.domain.components;

import java.util.List;

public class OrderDTO {
    private int id;
    private int client;
    private int restaurant;
    private int paymentMethod; //TODO verificar se isso está certo, parece confuso!
    private StatusOrder statusOrder = StatusOrder.PROCESSING;
    private String note;
    private List<Item> itens;
    private float valuePayment;
    private int tip;

    public int getId() {
        return id;
    }

    public int getClient() {
        return client;
    }

    public int getRestaurant() {
        return restaurant;
    }

    public int getPaymentMethod() {
        return paymentMethod;
    }

    public String getNote() {
        return note;
    }

    public List<Item> getItens() {
        return itens;
    }

    public float getValuePayment() {
        return valuePayment;
    }

    public int getTip() {
        return tip;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
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
