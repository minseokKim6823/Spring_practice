package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChatController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String chat() {
        System.out.println("home controller start");

        return "chat";
    }
}