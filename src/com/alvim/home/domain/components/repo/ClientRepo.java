package com.alvim.home.domain.components.repo;

import com.alvim.home.domain.components.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientRepo {
    private final List<Client> clients = new ArrayList<>();

    public ClientRepo() {
        clients.add(new Client(101, "Lucas"));
        clients.add(new Client(102, "Mariana"));
    }

    public void add(Client client) {
        clients.add(client);
    }

    public Client findById(int id) {
        for (Client client : clients) {
            if (client.getId() == id) {
                return client;
            }
        }
        return null;
    }
}
