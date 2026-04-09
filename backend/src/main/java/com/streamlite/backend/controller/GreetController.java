package com.streamlite.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class GreetController {

    @GetMapping("/api/greet")
    public Map<String, String> greet(@RequestParam(defaultValue="Guest") String name) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello " + name + ", from backend!");
        return response;
    }
}
