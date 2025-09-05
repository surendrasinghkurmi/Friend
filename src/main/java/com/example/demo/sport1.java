package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class sport1 {
    @GetMapping("/player")
    public String player()
    {
        return"sport";
    }
}
