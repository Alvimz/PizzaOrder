package com.alvim.home.domain.http;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.BindException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class HttpListening {
    public HttpServer httpServer;

    public HttpServer start(int port) throws IOException {
        httpServer = HttpServer.create(new InetSocketAddress(port),0);
        httpServer.createContext("/order", new HttpHandler());
        httpServer.createContext("/status", new HttpHandler());
        httpServer.setExecutor(Executors.newFixedThreadPool(5));
        httpServer.start();
        return httpServer;
    }

    public void close(){
        System.out.println("Desligando");

        httpServer.stop(2);
    }
}
