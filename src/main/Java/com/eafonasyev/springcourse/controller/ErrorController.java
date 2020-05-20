package com.eafonasyev.springcourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class ErrorController  {

    @GetMapping("/access-denied")
    public String showMessage(){
        return "access-denied";
    }
}
