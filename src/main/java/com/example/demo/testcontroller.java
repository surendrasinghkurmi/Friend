package com.example.demo;

import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class testcontroller {

    @Autowired
    personsRepository repository;//IOC

    @GetMapping("/insert2")
    public String insert()
    {
        persons p=new persons(101,"abc");
        repository.save(p);
        return "confirmation";
    }
}
