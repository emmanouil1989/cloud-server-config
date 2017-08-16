package com.example.lab3client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckyWorldController {

    @Value("${lucky-word}")
    private String luckyWorld;

    @RequestMapping("/lucky-word")
    public String showLuckyWorld() {
        return "The lucky world is: " + luckyWorld;
    }
}
