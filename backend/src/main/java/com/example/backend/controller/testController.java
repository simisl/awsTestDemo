package com.example.backend.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/health", produces = {MediaType.APPLICATION_JSON_VALUE})
public class testController {

    @GetMapping("/page")
    public Map<String, String> healthCheck() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "AWS TEST OK");
        return response;
    }
}
