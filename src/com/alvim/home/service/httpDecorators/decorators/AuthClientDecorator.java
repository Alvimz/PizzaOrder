package com.alvim.home.service.httpDecorators.decorators;

import com.alvim.home.service.httpDecorators.HandlerInterface;
import com.alvim.home.service.httpDecorators.HandlerWrapper;
import com.sun.net.httpserver.HttpExchange;

public class AuthClientDecorator extends HandlerWrapper {
    public AuthClientDecorator(HandlerInterface wrapped) {
        super(wrapped);
    }

    @Override
    public void handle(HttpExchange exchange) {
        super.handle(exchange); //todo terminar aqui!
    }

}
