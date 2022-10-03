package com.example.demoapp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "Greetings from Spring Boot! hehehe";
    }

    // public static void main(String[] args) {
    //     SpringApplication.run(HelloWorldController.class, args);
    // }
}