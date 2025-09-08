package com.example.demo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobsController {
    @GetMapping("/jobsdata")
    public String validform(Model v)
    {
       v.addAttribute("Jobs", new JobsEntity());
       return"Jobs";
    }

    @PostMapping("/selected")
    public String process(@Valid @ModelAttribute("Jobs")JobsEntity Jobs, BindingResult result)
    {
        if(result.hasErrors())
            return "Jobs";
        else{
            System.out.println(Jobs);
            return "Success";
        }
    }

}
