package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Route2Controller {

    @RequestMapping("/route2")
    public String home() {
        return "Route #2 Controller";
    }
}
