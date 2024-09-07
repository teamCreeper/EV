package com.evproject.ev;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApplication {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
