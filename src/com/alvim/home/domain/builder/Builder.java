package com.alvim.home.domain.builder;

import com.alvim.home.domain.components.Client;
import com.alvim.home.domain.components.Item;
import com.alvim.home.domain.components.PaymentMethod;
import com.alvim.home.domain.components.Restaurant;
import com.alvim.home.service.paymentService.PaymentService;

import java.util.List;

public interface Builder {
    public void setPaymentMethod(int paymentService); //TODO verificar isso aqui
    public void setClient(Client client);
    public void setRestaurant(Restaurant restaurant);
    public void setItens(List<Item> itens);
    public void setID(int id);
    public void setValue(float value);
    public void setNote(String note);
    public void setTip(int tip);

}
