package com.alvim.home.service.httpDecorators;

import com.sun.net.httpserver.HttpExchange;

public abstract class HandlerWrapper implements Handler{
    protected Handler wrapped;

    public HandlerWrapper(Handler wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void handle(HttpExchange exchange) {
        wrapped.handle(exchange);
    }
}
