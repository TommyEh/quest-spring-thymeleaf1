package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @GetMapping("/doctor/")
    public String doctor(@RequestParam(defaultValue = "John Smith") String name,
                         @RequestParam(defaultValue = "0") int number, Model model) {

        model.addAttribute("doctorname", name);
        model.addAttribute("doctornumber", number);

        return "doctor";
    }
}
