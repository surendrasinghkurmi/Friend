package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class data1 {
    @GetMapping("/ram")
    public String display(Model model)
    {
        model.addAttribute("a","Surendra Singh Kurmi");
        model.addAttribute("m1","60");
        model.addAttribute("m2","80");
        return "newpgrm`";
    }
    @GetMapping("/display")
    public String dispaly(Model model)
    {
        model.addAttribute("b","surendrasinghkurmi");
        return "data2";
    }

}
