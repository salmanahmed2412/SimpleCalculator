package com.calculator.controller;

import com.calculator.service.SimpleCalculatorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@RunWith(SpringRunner.class)
public class SimpleCalcalutorControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    SimpleCalculatorService service;

    @Test
    public void testAdd() throws Exception {
        when(service.add(7,4)).thenReturn(11.0);
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/add?num1=7&num2=4"))
                .andExpect(status().isOk())
                .andReturn();
        String content =  result.getResponse().getContentAsString();
        assertEquals(content, "11.0");
    }

    @Test
    public void testSubtract() throws Exception {
        when(service.subtract(7,4)).thenReturn(3.0);
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/subtract?num1=7&num2=4"))
                .andExpect(status().isOk())
                .andReturn();
        String content =  result.getResponse().getContentAsString();
        assertEquals(content, "3.0");
    }

    @Test
    public void testMultiply() throws Exception {
        when(service.multiply(7,4)).thenReturn(28.0);
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/multiply?num1=7&num2=4"))
                .andExpect(status().isOk())
                .andReturn();
        String content =  result.getResponse().getContentAsString();
        assertEquals(content, "28.0");
    }

    @Test
    public void testdivide() throws Exception {
        when(service.divide(8,4)).thenReturn(2.0);
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/divide?num1=8&num2=4"))
                .andExpect(status().isOk())
                .andReturn();
        String content =  result.getResponse().getContentAsString();
        assertEquals(content, "2.0");
    }
}
