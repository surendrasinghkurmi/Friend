package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HotelController {
    @Autowired
    HotelRepository hotelRepository;

    @GetMapping("/list")
    public String list()
    {
        return "Hotellist";
    }
    @RequestMapping("/listfilled")
    public String listfilled(String name,String address,String state)
    {
        HotelEntity HotelEntity =new HotelEntity();
        HotelEntity.setName(name);
        HotelEntity.setAddress(address);
        HotelEntity.setState(state);
        hotelRepository.save(HotelEntity);
        
            return "confirmation";


    }


}

