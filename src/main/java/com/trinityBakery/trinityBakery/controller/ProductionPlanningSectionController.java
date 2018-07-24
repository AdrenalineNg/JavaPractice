package com.trinityBakery.trinityBakery.controller;


import org.apache.catalina.servlet4preview.http.HttpServletRequest;
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
        //显示计划列表
        return "pps-plan";
    }
    @RequestMapping("/create-plan")
    public String createPlan(HttpServletRequest request){
        String name = request.getParameter("name");
        String num = request.getParameter("num");
        String date = request.getParameter("date");
        //创建生产计划

        return "redirect:/pps-plan";
    }
    @RequestMapping("/change-plan")
    public String changePlan(HttpServletRequest request){
        String name = request.getParameter("c-name");
        String num = request.getParameter("c-num");
        String date = request.getParameter("c-date");
        String id = request.getParameter("p-id");
        //修改生产计划

        return "redirect:/pps-plan";
    }

    @RequestMapping("/del-plan/{id}")
    public String delPlan(@PathVariable("id") Integer id){
        System.out.print(id);
        //删除编号为id的plan
        return "redirect:/pps-plan";
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