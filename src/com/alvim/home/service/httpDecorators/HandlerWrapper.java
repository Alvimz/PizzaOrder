package com.alvim.home.service.httpDecorators;

import com.sun.net.httpserver.HttpExchange;

public abstract class HandlerWrapper implements Handler{
    protected Handler wrapper;

    public HandlerWrapper(Handler wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void handle(HttpExchange exchange) {
        wrapper.handle(exchange);
    }
}
