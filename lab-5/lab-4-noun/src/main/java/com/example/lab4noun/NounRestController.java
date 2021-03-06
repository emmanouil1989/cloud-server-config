package com.example.lab4noun;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NounRestController {

    String words = "icicle,refrigerator,blizzard,snowball";

    @RequestMapping("/")
    public @ResponseBody String getWord(){
        String[] wordArray = words.split(",");
        int i = (int) Math.round(Math.random() * (wordArray.length-1));
        return wordArray[i];
    }
}
