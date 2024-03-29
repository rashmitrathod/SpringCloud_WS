package com.example.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PongController {

    @Value("${reply.message}")
    private String message;

    @RequestMapping("/message")
    public String pongMessage() {
        return message;
    }



}

