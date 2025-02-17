package com.nwallet.nwallet.web.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("/app")
public class HomeController {


    @GetMapping("/login")
    public ModelAndView login(){
        var modelAndView = new ModelAndView("app/login");

        return modelAndView;
    }

    @GetMapping
    public ModelAndView home() {
        var modelAndView = new ModelAndView("app/home/index");
       

        return modelAndView;
    }
    
}
