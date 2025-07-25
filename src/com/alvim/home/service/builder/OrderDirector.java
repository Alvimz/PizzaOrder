package com.alvim.home.service.builder;

import com.alvim.home.domain.builder.Builder;
import com.alvim.home.domain.builder.OrderBuilder;
import com.alvim.home.domain.components.*;
import com.alvim.home.domain.components.repo.DBFake;

public class OrderDirector {
    public void createOrder(Builder builder, OrderDTO dto, DBFake dbFake){
        builder.setID(dto.getId());

        builder.setItens(dto.getItens());
        builder.setClient(dbFake.clientRepo.findById(dto.getClient())); //todo isso está errado!!!
        builder.setNote(dto.getNote());
        builder.setRestaurant(dbFake.restaurantRepo.findById(dto.getRestaurant()));
        builder.setTip(dto.getTip());
        builder.setValue(dto.getValuePayment());
        builder.setPaymentMethod(dto.getPaymentMethod());

    }




}
