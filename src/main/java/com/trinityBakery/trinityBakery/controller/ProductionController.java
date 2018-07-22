package com.trinityBakery.trinityBakery.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("production")
public class ProductionController {
    
    @RequestMapping("work")
    public String productionwork() {
        return "productionWork";
    }

}