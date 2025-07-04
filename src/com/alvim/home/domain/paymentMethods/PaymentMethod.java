package com.alvim.home.domain.paymentMethods;

public enum PaymentMethod {
    PIX(0),
    PICPAY(1),
    MONEY(2),
    CREDIT_CARD(3);

    private int id;
    PaymentMethod(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
