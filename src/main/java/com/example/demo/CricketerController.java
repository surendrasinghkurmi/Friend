package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CricketerController {
    @Autowired
    CricketerRepository cricketerRepository;

    @GetMapping("/form")
    public String form()
    {
        return "Cricketerform";
    }
    @RequestMapping("/formfilled")
    public String formfilled( String name,String address,String state)
    {
        CricketerEntity CricketerEntity=new CricketerEntity();
        CricketerEntity.setName(name);
        CricketerEntity.setAddress(address);
        cricketerRepository.save(CricketerEntity);

            return "confirmation";

    }
}
