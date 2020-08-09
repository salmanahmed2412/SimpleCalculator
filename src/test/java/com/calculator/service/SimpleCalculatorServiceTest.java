package com.calculator.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorServiceTest {

    SimpleCalculatorService service;

    @Before
    public void start(){
        service = new SimpleCalculatorService();
    }

    @Test
    public void testAdd(){
        assertEquals(service.add(7, 4), 11);
    }

    @Test
    public void testSubtract(){
        assertEquals(service.subtract(7, 4), 3);
    }

    @Test
    public void testMultiply(){
        assertEquals(service.multiply(7, 4), 28);
    }

    @Test
    public void testDivide(){
        assertEquals(service.divide(8, 4), 2);
    }

}
