package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class new2 {
    @GetMapping("/run")
    public String run()
    {

      return "history";
    }

}
