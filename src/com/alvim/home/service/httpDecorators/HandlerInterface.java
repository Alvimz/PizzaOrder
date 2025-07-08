package com.alvim.home.service.httpDecorators;

import com.sun.net.httpserver.HttpExchange;


public interface HandlerInterface {
    void handle(HttpExchange exchange);
}
