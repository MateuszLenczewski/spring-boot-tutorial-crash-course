package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhotozController {
    private List<Photo> db = List.of(new Photo("1", "hello.jpg"));


    @GetMapping("/")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/photoz")
    public List<Photo> get() {
        return db;
    }
}
