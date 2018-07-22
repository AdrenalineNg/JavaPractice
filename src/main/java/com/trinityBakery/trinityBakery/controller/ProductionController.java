package com.trinityBakery.trinityBakery.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("production")
public class ProductionController {
    
    @RequestMapping(value="login",method= RequestMethod.GET)
    public String userlogin() {
        return "login";
    }
    
    @RequestMapping("work")
    public String productionwork() {
        return "productionWork";
    }

}