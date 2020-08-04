package com.onlinestore.training.controllers;

import com.onlinestore.training.entities.Client;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientCtrl {

    @GetMapping
    public List<Client> get() {
        Client client = new Client();
        client.setId("0001");
        client.setFirstName("Fabio");
        client.setLastName("Hurtado");
        client.setAge(25);
        client.setIdentificationNumber("12323283");

        Client client2 = new Client();
        client2.setId("0002");
        client2.setFirstName("Andres");
        client2.setLastName("Hurtado");
        client2.setAge(31);
        client2.setIdentificationNumber("2323232");

        List<Client> clients = new ArrayList<>();
        clients.add(client);
        clients.add(client2);

        return clients;
    }

    @PostMapping
    public String create(@RequestBody Client client) {
        //save into database
        return "Cliente creado exitosamente.";
    }

    @PutMapping
    public String edit(@RequestBody Client client) {
        return "Cliente actualizado exitosamente.";
    }

    @DeleteMapping
    public String delete(@RequestParam("id") String clientId) {
        return "Cliente eliminado exitosamente.";
    }
}
