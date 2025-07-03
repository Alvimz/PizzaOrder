package com.alvim.home.domain.http;

import com.alvim.home.domain.builder.OrderBuilder;
import com.alvim.home.domain.components.Order;
import com.alvim.home.service.builder.OrderDirector;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import com.google.gson.Gson;

public class HttpHandler implements com.sun.net.httpserver.HttpHandler {
    Gson gson = new Gson();

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String valuePayload = null;
        if("POST".equals(exchange.getRequestMethod())){
            String payload = new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8);

            //TODO DIRECTOR
            OrderBuilder orderBuilder = new OrderBuilder();
            OrderDirector orderDirector = new OrderDirector();

            System.out.println(payload);
        }
        handleResposta(exchange,valuePayload);

    }

    private void handleResposta(HttpExchange httpExchange, String requestValue) throws IOException {
        byte[] bytes = requestValue.getBytes(StandardCharsets.UTF_8);
        httpExchange.getResponseHeaders().set("Content-Type", "text/plain; charset=utf-8");
        httpExchange.sendResponseHeaders(200,bytes.length);

        try(OutputStream outputStream = httpExchange.getResponseBody()){
            outputStream.write(bytes);
        }
    }
}
