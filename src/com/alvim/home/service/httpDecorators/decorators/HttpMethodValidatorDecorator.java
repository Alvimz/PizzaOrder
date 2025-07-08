package com.alvim.home.service.httpDecorators.decorators;

import com.alvim.home.service.httpDecorators.Handler;
import com.alvim.home.service.httpDecorators.HandlerWrapper;
import com.sun.net.httpserver.HttpExchange;

import java.nio.charset.StandardCharsets;

public class HttpMethodValidatorDecorator extends HandlerWrapper {
    private final String expectedMethod;

    public HttpMethodValidatorDecorator(String expectedMethod,Handler wrapper) {
        super(wrapper);
        this.expectedMethod = expectedMethod.toUpperCase();
    }

    @Override
    public void handle(HttpExchange exchange) {
        String methodRequest = exchange.getRequestMethod().toUpperCase();
        if(!methodRequest.equals(expectedMethod)){
            String error = "Method isn't supported";
            try {
                byte[] body = error.getBytes(StandardCharsets.UTF_8);
                exchange.getResponseHeaders().add("Content-Type", "text/plain; charset=utf-8");
                exchange.sendResponseHeaders(405, body.length); //
                exchange.getResponseBody().write(body);
                exchange.getResponseBody().close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            return;
        }
        super.handle(exchange);
    }
}
