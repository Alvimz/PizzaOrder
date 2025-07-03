package com.alvim.home.core;

import com.alvim.home.domain.http.HttpListening;

import java.io.IOException;

public class Boostrap {
    public static void main(String[] args) {
        HttpListening httpListening = new HttpListening();
        try{
            httpListening.start(8999);
        } catch (IOException e) {
            e.printStackTrace();

        }
        Runtime.getRuntime().addShutdownHook(new Thread(httpListening::close));
    }
}
