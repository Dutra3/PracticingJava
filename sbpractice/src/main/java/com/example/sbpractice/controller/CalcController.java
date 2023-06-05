package com.example.sbpractice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class CalcController {

    @GetMapping("/sum/{number1}/{number2}")
    public int sum(@PathVariable int number1, @PathVariable int number2) {
        return number1 + number2;
    }

    @GetMapping("/sub")
    public int sub(@RequestParam("number1") int number1, @RequestParam("number2") int number2) {
        return number1 - number2;
    }

}
