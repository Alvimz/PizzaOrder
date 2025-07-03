package com.alvim.home.domain.components;

public enum StatusOrder {
    PROCESSING(1),
    MAKING(2),
    DELIVERING(3),
    COMPLETED(4),
    WAITING_RETRIEVE(5);

    private final int codeStatus;

    StatusOrder(int codeStatus){
        this.codeStatus = codeStatus;
    }
    public int getStatusOrder(){
        return codeStatus;
    }
}
