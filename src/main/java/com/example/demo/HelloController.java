package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/cat")
    public String indexCat() {
        return "Salutacions des de Spring Boot!";
    }

    @GetMapping("/eus")
    public String indexEus() {
        return "Agurrak Spring Boot -etik !";
    }
}
