package com.alvim.home.service.httpDecorators;

import com.sun.net.httpserver.HttpExchange;

public abstract class HandlerWrapper implements HandlerInterface {
    protected HandlerInterface wrapped;

    public HandlerWrapper(HandlerInterface wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void handle(HttpExchange exchange) {
        wrapped.handle(exchange);
    }
}
