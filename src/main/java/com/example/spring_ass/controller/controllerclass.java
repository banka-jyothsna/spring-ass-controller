package com.example.spring_ass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class controllerclass {

    @GetMapping("/hello")
    public  String sayhello(){
        return "hello" ;
    }
}
