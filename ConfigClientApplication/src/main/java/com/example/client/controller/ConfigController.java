package com.example.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${message: Default Hello}")
    private String message;

    @GetMapping(path = "/message")
    public String getMessage() {
        return message;
    }
}
