package com.example.demo.controller;

import com.example.demo.model.CurrentPrice;
import com.example.demo.util.JavaScriptMessageConverter;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class CurrentPriceController {

    @Autowired
    public RestTemplate restTemplate;

    @GetMapping("/currentprice")
    public CurrentPrice getCurrentPrice() throws JsonProcessingException {

        restTemplate.getMessageConverters().add(new JavaScriptMessageConverter());
        String value = restTemplate.getForObject("https://api.coindesk.com/v1/bpi/currentprice.json", String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        CurrentPrice currentPrice = objectMapper.readValue(value, CurrentPrice.class);

        return currentPrice;
    }
}
