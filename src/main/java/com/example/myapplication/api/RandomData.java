package com.example.myapplication.api;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomData {
    
    @GetMapping("/api/random")
    public HashMap<String, Object> getRandomData() {
        HashMap<String, Object> rand = new HashMap<>();

        rand.put("id", 1);
        rand.put("name", "Mike");

        return rand;
    }
}
