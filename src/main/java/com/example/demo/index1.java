package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class index1 {
    @GetMapping("/dekho")
    public String dekho()
    {
        return "index";
    }
}
