package com.alvim.home.domain.builder;

import com.alvim.home.domain.components.*;
import com.alvim.home.service.paymentService.PaymentService;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder implements Builder{
    private int id;
    private Client client;
    private Restaurant restaurant;
    private PaymentMethod paymentMethod;
    private String note;
    private int tip;

    private List<Item> itens = new ArrayList<Item>();
    private float valuePayment;

    @Override
    public void setPaymentMethod(PaymentMethod paymentService) { this.paymentMethod = paymentService;} //TODO arrumar aqui
    @Override
    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void addItem(Item item) {
        this.itens.add(item);
    }

    @Override
    public void setID(int id) {
        this.id = id;
    }

    @Override
    public void setValue(float valuePayment) {
        this.valuePayment = valuePayment;
    }

    @Override
    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public void setTip(int tip) {
        this.tip = tip;
    }

    public Order getOrder(){
        return new Order(paymentMethod,restaurant,client,id,note,valuePayment,itens,tip);
    }
}
