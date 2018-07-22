package com.trinityBakery.trinityBakery.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("admin")
public class adminController {
    
    @RequestMapping(value="login",method= RequestMethod.GET)
    public String userlogin() {
        return "login";
    }
    
    @RequestMapping("admin")
    public String finishedProducLibrary() {
        return "Admin";
    }

}