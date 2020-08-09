package com.calculator.controller;

import com.calculator.service.SimpleCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleCalculatorController {

    @Autowired
    SimpleCalculatorService service;

    @GetMapping(path = "/add")
    public double add(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return service.add(number1, number2);
    }

    @GetMapping(path = "/subtract")
    public double subtract(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return service.subtract(number1, number2);
    }

    @GetMapping(path = "/multiply")
    public double multiply(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return service.multiply(number1, number2);
    }

    @GetMapping(path = "/divide")
    public double divide(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return service.divide(number1, number2);
    }

}
