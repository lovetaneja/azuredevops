package com.microservice.app.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms/api")
public class MicroServiceController {
    @GetMapping(path = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String testAPI() {
        return "Hello World !!";
    }
}