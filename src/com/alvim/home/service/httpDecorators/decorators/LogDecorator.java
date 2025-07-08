package com.alvim.home.service.httpDecorators.decorators;

import com.alvim.home.service.httpDecorators.HandlerInterface;
import com.alvim.home.service.httpDecorators.HandlerWrapper;
import com.sun.net.httpserver.HttpExchange;

import java.util.logging.Logger;

public class LogDecorator extends HandlerWrapper {
    public static final Logger LOGGER = Logger.getLogger(LogDecorator.class.getName());
    public LogDecorator(HandlerInterface wrapped) {
        super(wrapped);
    }

    @Override
    public void handle(HttpExchange exchange) {
        LOGGER.info("ORDER:"+ exchange.getRequestMethod() +"" + exchange.getRequestURI());

        super.handle(exchange);

        LOGGER.info(exchange.getRequestURI() + " finalizado");
    }

}
