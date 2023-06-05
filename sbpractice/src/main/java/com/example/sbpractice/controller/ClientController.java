package com.example.sbpractice.controller;

import com.example.sbpractice.model.Client;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @GetMapping("/any")
    public Client getClient() {
        return new Client(28, "Claudio", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable int id) {
        return new Client(id, "Maria", "987.654.321-00");
    }

    @GetMapping // clients?id=1231
    public Client getClientByIdTwo(@RequestParam(name = "id") int id) {
        return new Client(id, "Gabriel", "123.333.321-00");
    }
}
