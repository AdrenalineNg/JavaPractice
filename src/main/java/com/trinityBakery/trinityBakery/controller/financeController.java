package com.trinityBakery.trinityBakery.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("finance")
public class financeController {
    @RequestMapping("finance-account-billofloading")
    public String finance_account_billofloading() {
        return "finance-account-billofloading";
    }
    
    @RequestMapping("finance-cashier")
    public String finance_cashier() {
        return "finance-cashier";
    }
    
    @RequestMapping("finance-account")
    public String inance_account() {
        return "finance-account";
    }
    
    @RequestMapping("finance-account-refund")
    public String finance_account_refund() {
        return "finance-account-refund";
    }
    
    @RequestMapping("finance-cashier-refund")
    public String finance_cashier_refund() {
        return "finance-cashier-refund";
    }
}
