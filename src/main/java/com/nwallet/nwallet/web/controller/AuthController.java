package com.nwallet.nwallet.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class AuthController{
    
    @GetMapping
    public ModelAndView login() {
    
        var modelAndView = new ModelAndView("app/login/index");
    
    
        return modelAndView;
}
}
