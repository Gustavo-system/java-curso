package com.udemy.modulo.one.helloworld.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping("")
    public ResponseEntity<String> helloWorld(){
        return new ResponseEntity<>("Hello world", HttpStatus.OK);
    }

}
