package com.trinityBakery.trinityBakery.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class saleController {    
    @RequestMapping("sale")
    public String sale() {
        return "sale";
    }
    
    @RequestMapping("sale-user")
    public String sale_user() {
        return "sale-user";
    }
    
    @RequestMapping("sale-order-detail")
    public String sale_order_detail() {
        return "sale-order-detail";
    }
    
    @RequestMapping("sale-refund")
    public String sale_refund() {
        return "sale-refund";
    }
    
    @RequestMapping("sale-refund-detail")
    public String sale_refund_detail() {
        return "sale-refund-detail";
    }
}
