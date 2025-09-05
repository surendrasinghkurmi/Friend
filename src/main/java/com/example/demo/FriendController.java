package com.example.demo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FriendController {
// hello
    @GetMapping("/add")
    public String validform(Model v)
    {
        v.addAttribute("Friends", new FriendsEntity());
                return "Friends";
    }

    @PostMapping("/process")
    public String process(@Valid @ModelAttribute("Friends")FriendsEntity Friends, BindingResult result)
    {
        if(result.hasErrors())
            return "Friends";
        else{
            System.out.println(Friends);
            return "Success";
        }
    }

}
