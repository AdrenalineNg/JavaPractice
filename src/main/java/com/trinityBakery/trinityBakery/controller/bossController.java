package com.trinityBakery.trinityBakery.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/boss")
public class bossController {

    @RequestMapping("/boss")
    public String boss() {
        return "boss";
    }
    @RequestMapping("/moneylist")
    public String moneylist() {
        return "boss-moneylist";
    }
    
    @RequestMapping("/plan")
    public String plan() {
        return "boss-plan";
    }
    
    @RequestMapping("/refund")
    public String refund() {
        return "boss-refund";
    }
    
    @RequestMapping("/restorhouse")
    public String restorhouse() {
        return "boss-restorhouse";
    }


}
