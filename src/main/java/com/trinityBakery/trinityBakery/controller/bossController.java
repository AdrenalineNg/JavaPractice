package com.trinityBakery.trinityBakery.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class bossController {
    @RequestMapping("boss-moneylist")
    public String moneylist() {
        return "boss-moneylist";
    }
    
    @RequestMapping("boss-plan")
    public String plan() {
        return "boss-plan";
    }
    
    @RequestMapping("boss-refund")
    public String refund() {
        return "boss-refund";
    }
    
    @RequestMapping("boss-restorhouse")
    public String restorhouse() {
        return "boss-restorhouse";
    }
    
    @RequestMapping("boss")
    public String boss() {
        return "boss";
    }
}
