package com.alvim.home.domain.http;

import com.alvim.home.service.httpDecorators.Handler;
import com.alvim.home.service.httpDecorators.decorators.HttpMethodValidatorDecorator;
import com.alvim.home.service.httpDecorators.decorators.LogDecorator;
import com.alvim.home.service.httpDecorators.order.OrderHandler;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.BindException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class HttpListening {
    public HttpServer httpServer;
    private Handler handlerOrder = new LogDecorator(new HttpMethodValidatorDecorator(
            "POST",new OrderHandler()));

    public HttpServer start(int port) throws IOException {
        httpServer = HttpServer.create(new InetSocketAddress(port),0);
        httpServer.createContext("/order", exchange -> handlerOrder.handle(exchange));
        httpServer.createContext("/status", new HttpHandler()); //todo fazer isso aqui!
        httpServer.setExecutor(Executors.newFixedThreadPool(5));
        httpServer.start();
        return httpServer;
    }

    public void close(){
        System.out.println("Desligando");

        httpServer.stop(2);
    }
}
