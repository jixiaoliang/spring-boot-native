package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebmvcController {

    @GetMapping("/")
    public String foo() {
        return "Hello GraalVm from native-image";
    }

    @GetMapping("/hello/{name}")
    public String foo(@PathVariable String name) {
        return "Hello " + name;
    }
}