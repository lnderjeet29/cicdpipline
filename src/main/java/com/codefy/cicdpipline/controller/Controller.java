package com.codefy.cicdpipline.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("get")
    public ResponseEntity<String> get(){
        return new ResponseEntity<String>("hello everyone....", HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<String> health(){
        return new ResponseEntity<String>("hello everyone....", HttpStatus.OK);
    }
}
