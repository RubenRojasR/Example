package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Example;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ExampleController {
    
    @GetMapping("api/Example")
    public ResponseEntity<?> getExample() {
        ArrayList<Example> listResponse = new ArrayList<>();
        for(int i = 1;i <=10; i++ ){
            Example addExample = new Example();
            addExample.setId(i);
            addExample.setName("Test name " + i);
            addExample.setDescription("Description Test " + i);
            listResponse.add(addExample);
        }
        return ResponseEntity.ok(listResponse);
    }
    
}
