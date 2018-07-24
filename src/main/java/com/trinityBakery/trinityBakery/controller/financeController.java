package com.trinityBakery.trinityBakery.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class financeController {
    @RequestMapping("finance-account-billofloading")
    public String finance_account_billofloading() {
        return "finance-account-billofloading";
    }
    
    @RequestMapping("finance-cashier")
    public String finance_cashier() {
        //出纳看见的订单
        return "finance-cashier";
    }
    @RequestMapping("/cashier-confirm-order/{id}")
    public String cashierConfirmOrder(@PathVariable("id") Integer id){
        System.out.print(id);
        //出纳改变订单付款状态
        return "redirect:/finance-cashier";
    }
    
    @RequestMapping("finance-account")
    public String inance_account() {
        //会计能看见的订单
        return "finance-account";
    }

    @RequestMapping("/account-confirm/{id}")
    public String accountConfirm(@PathVariable("id") Integer id){
        //会计确认id为id的订单，生产提货单
        System.out.print(id);
        return "redirect:/finance-account";
    }

    @RequestMapping("/account-confirm-refound/{id}")
    public String accountConfirmRefound(@PathVariable("id") Integer id){
        System.out.print(id);
        //会计确认id为id的退款单
        return "redirect:/finance-account-refund";
    }
    
    @RequestMapping("finance-account-refund")
    public String finance_account_refund() {
        //会计的退款单
        return "finance-account-refund";
    }
    
    @RequestMapping("finance-cashier-refund")
    public String finance_cashier_refund() {
        //出纳的退款单
        return "finance-cashier-refund";
    }
    @RequestMapping("/cashier-confirm-refound/{id}")
    public String cashierConfirmRefound(@PathVariable Integer id){
        System.out.print(id);
        //会计更改订单的付款状态
        return "redirect:/finance-cashier-refund";
    }

}
