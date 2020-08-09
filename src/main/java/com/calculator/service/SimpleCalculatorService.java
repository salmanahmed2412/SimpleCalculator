package com.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleCalculatorService {

    public double add(int num1, int num2){
        return num1 + num2;
    }

    public double subtract(int num1, int num2){
        return num1 - num2;
    }

    public double multiply(int num1, int num2){
        return num1 * num2;
    }

    public double divide(int num1, int num2){
        return num1 / num2;
    }
}

