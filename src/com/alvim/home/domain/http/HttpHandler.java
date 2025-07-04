package com.alvim.home.domain.http;

import com.alvim.home.domain.builder.OrderBuilder;
import com.alvim.home.domain.components.Order;
import com.alvim.home.domain.components.OrderDTO;
import com.alvim.home.domain.components.repo.DBFake;
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

            //confesso que fiquei um pouco perdido aqui!
            OrderBuilder orderBuilder = new OrderBuilder();
            OrderDirector orderDirector = new OrderDirector();
            OrderDTO orderDTO = gson.fromJson(payload,OrderDTO.class);
            DBFake dbFake = new DBFake();
            orderDirector.createOrder(orderBuilder,orderDTO,dbFake);
            Order order = orderBuilder.getOrder();
            System.out.println(order);
            // até aqui!
            handleResposta(exchange,payload);

        }

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
