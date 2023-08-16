package com.example.introtospringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/experience")
    public String experience(){
        return "experience";
    }

    @RequestMapping("/education")
    public String education(){
        return "education";
    }

    @RequestMapping("/guest-book")
    public String guestBook(){
        return "guest-book";
    }
}

