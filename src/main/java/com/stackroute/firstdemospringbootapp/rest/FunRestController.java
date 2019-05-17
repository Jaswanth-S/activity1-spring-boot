package com.stackroute.firstdemospringbootapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @Value("${demo.name}")
    private String name;

    @GetMapping("/")
    public String sayHello()
    {

        return " Welcome "+ name+" Hello World! Time is "+ LocalDateTime.now();
    }
    @GetMapping("/sample")
    public String samplePage()
    {
        return "this is a sample page";
    }
}
