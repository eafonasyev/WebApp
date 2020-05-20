package com.eafonasyev.springcourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/landing")
    public String showLanding() {
        return "landing";
    }

    @GetMapping("/employees")
    public String showHome() {
        return "home";
    }
}
