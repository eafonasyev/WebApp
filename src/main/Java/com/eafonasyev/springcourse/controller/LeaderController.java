package com.eafonasyev.springcourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LeaderController {

    @GetMapping("leaders")
    public String showLeader(){
        return "lead-info";
    }
}
