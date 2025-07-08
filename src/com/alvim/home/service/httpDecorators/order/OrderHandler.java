package com.alvim.home.service.httpDecorators.order;

import com.alvim.home.domain.builder.OrderBuilder;
import com.alvim.home.domain.components.Order;
import com.alvim.home.domain.components.OrderDTO;
import com.alvim.home.domain.components.repo.DBFake;
import com.alvim.home.service.builder.OrderDirector;
import com.alvim.home.service.httpDecorators.Handler;
import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class OrderHandler implements Handler {
    Gson gson = new Gson();
    OrderDirector orderDirector = new OrderDirector();
    DBFake dbFake = new DBFake();
    OrderBuilder orderBuilder = new OrderBuilder();

    @Override
    public void handle(HttpExchange exchange) {
        try{
            String payload = new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8);
            //confesso que fiquei um pouco perdido aqui! E também isso não parece que é aqui!
            OrderDTO orderDTO = gson.fromJson(payload,OrderDTO.class);
            orderDirector.createOrder(orderBuilder,orderDTO,dbFake);
            Order order = orderBuilder.getOrder();
            System.out.println(order);
            // até aqui!

            handleResposta(exchange,payload);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
