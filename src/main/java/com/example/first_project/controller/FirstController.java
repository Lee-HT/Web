package com.example.first_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/meet")
    public String meet(Model model) {
        model.addAttribute("user_name","리아");
        return "greeting";      // templates/greeting.mustache
    }

    @GetMapping("/bye")
    public String bye(Model model) {
        model.addAttribute("user_name","리아");
        return "goodbye";
    }
}
