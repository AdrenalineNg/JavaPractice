package com.trinityBakery.trinityBakery.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pps")
public class ProductionPlanningSectionController {
    
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