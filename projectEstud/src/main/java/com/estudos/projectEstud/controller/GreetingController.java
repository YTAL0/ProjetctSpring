package com.estudos.projectEstud.controller;

import com.estudos.projectEstud.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "HELLO, %s";

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(
        @RequestParam(value = "name", defaultValue = "") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
