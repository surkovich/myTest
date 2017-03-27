package com.marmotta.javaee.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by marmotta on 21.03.2017.
 */
@RestController
public class HelloController {


    /**
     * The greeting message
     * @return
     */
    @GetMapping("/hello")
    public String sayHello() {
        return "hello, world!";
    }



}
