package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class datacontroller {

    @Autowired
    HotelRepository hotelrepository;


    @GetMapping("/data")
    public String list(Model model) {
        Iterable<HotelEntity> AllHotel = hotelrepository.findAll();
        List<HotelEntity> Hotellist = new ArrayList<>();
        AllHotel.forEach(Hotellist::add);
        model.addAttribute("data",Hotellist);
        return "hoteldata";
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<HotelEntity>getbyId(@PathVariable int id)
    {
        return hotelrepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}