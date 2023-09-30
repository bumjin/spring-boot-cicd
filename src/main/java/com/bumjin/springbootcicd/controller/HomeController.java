package com.bumjin.springbootcicd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = "/")
    public String index(){
        return "index";
    }

    @GetMapping(value = "/jsp")
    public String jsp(Model model) {
        model.addAttribute("name", "jsp");
        return "main";
    }

    @GetMapping(value = "/th")
    public String th(Model model) {
        model.addAttribute("name", "thymeleaf");
        return "thymeleaf/main";
    }
// ...
}
