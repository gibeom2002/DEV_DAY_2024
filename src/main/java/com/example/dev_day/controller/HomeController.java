package com.example.dev_day.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/dev-day")
    public String home()
    {
        return "home";
    }
}
