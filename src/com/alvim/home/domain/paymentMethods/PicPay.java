package com.alvim.home.domain.paymentMethods;

import com.alvim.home.domain.components.PaymentMethod;
import com.alvim.home.service.paymentService.PaymentService;

public class PicPay implements PaymentService {
    @Override
    public void pay(float value) {
        System.out.println("Pagando pelo PICPAY");
    }
}
