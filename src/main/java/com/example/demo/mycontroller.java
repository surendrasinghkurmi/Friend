package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class mycontroller {
    @GetMapping("/profile")
    public String profile(Model model)
    {

        model.addAttribute("username","gajju");

        return "profile";
    }
    @GetMapping("/loopdemo1")
    public String loopdemo1(Model model)
    {
        List<String> mylst=List.of("india","pakistan","china","dubai");
        model.addAttribute("country",mylst);
        return "profile";
    }

}
