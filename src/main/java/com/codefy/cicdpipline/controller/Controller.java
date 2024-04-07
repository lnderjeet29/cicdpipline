package com.codefy.cicdpipline.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {
    @GetMapping("get")
    public ResponseEntity<Map<String,String>> get(){
        Map map=new HashMap<String,String>();
        map.put("name","Ankit Angra");
        map.put("name","Shubham Tomar");
        map.put("name","Suraj Singh");
        map.put("name","Inderjeet Yadav");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<String> health(){
        return ResponseEntity.ok().body("this is the health session.");
    }
}
