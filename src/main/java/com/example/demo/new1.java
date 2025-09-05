package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class new1 {
    @GetMapping("/loopdemo2")
    public String loopdemo2(Model model)
    {

        model.addAttribute("isactive","ksk");

        return "age";
    }
}
