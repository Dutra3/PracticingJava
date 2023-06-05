package com.example.sbpractice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/methods")
public class MethodsHttpController {

    @GetMapping
    public String get() {
        return "GET";
    }

    @PostMapping
    public String post() {
        return "POST";
    }

    @PutMapping
    public String put() {
        return "PUT";
    }

    @PatchMapping
    public String patch() {
        return "PATCH";
    }

    @DeleteMapping
    public String delete() {
        return "DELETE";
    }
}
