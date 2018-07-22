package com.trinityBakery.trinityBakery.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("pps")
public class ProductionPlanningSectionController {
    
    @RequestMapping(value="login",method= RequestMethod.GET)
    public String userlogin() {
        return "login";
    }
    
    @RequestMapping("pps")
    public String ProductionPlanningSection() {
        return "ProductionPlanningSection";
    }
    
    @RequestMapping("pps-plan")
    public String pps_plan() {
        return "pps-plan";
    }
    
    @RequestMapping("pps-refund")
    public String pps_refund() {
        return "pps-refund";
    }
    
    @RequestMapping("pps-restorhous")
    public String pps_restorhous() {
        return "pps-restorhous";
    }
    
}