package com.nwallet.nwallet.api.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("/api")
public class HomeController {

    @GetMapping
    public ModelAndView home() {
        var modelAndView = new ModelAndView("app/home/index");
       

        return modelAndView;
    }
    
}
