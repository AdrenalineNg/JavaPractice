package com.trinityBakery.trinityBakery.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("sale")
public class saleController {
    @RequestMapping("login")
    public String login() {
        return "login";
    }
    
    @RequestMapping("sale")
    public String sale() {
        return "sale";
    }
    
    @RequestMapping("sale_user")
    public String sale_user() {
        return "sale-user";
    }
    
    @RequestMapping("sale/order/detail")
    public String sale_order_detail() {
        return "saleo-rder-detail";
    }
    
    @RequestMapping("/sale/refund")
    public String sale_refund() {
        return "sale-refund";
    }
    
    @RequestMapping("/sale/refund/detail")
    public String sale_refund_detail() {
        return "sale-refund-detail";
    }
}
