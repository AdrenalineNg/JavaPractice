package com.trinityBakery.trinityBakery.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductionPlanningSectionController {
    
    @RequestMapping("pps")
    public String ProductionPlanningSection() {
        //返回生产计划科订单列表
        return "ProductionPlanningSection";
    }

    @RequestMapping("/pps-order-view/{id}")
    public String ppsOrderDetail(@PathVariable("id") Integer id){
        System.out.print(id);
        //订单详情
        return "pps-order-detail";
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