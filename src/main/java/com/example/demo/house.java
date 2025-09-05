package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class house {
    @GetMapping("/ghar")
    public String display ()
    {
        return "home1";
    }
}
