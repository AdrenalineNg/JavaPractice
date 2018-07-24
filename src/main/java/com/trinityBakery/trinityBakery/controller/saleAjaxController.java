package com.trinityBakery.trinityBakery.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/saleAjax")
public class saleAjaxController {
    @PostMapping("/salesConfirmOrder")
    public String salesConfirmOrder(HttpServletRequest request){
        String id = request.getParameter("id");
        //根据id更改订单的销售确认状态

        return "success";
    }
    @PostMapping("/salesConfirmRefound")
    public String salesConfirmRefound(HttpServletRequest request){
        String id = request.getParameter("id");
        //更具id更改退款单的销售确认状态
        return "success";
    }
    @PostMapping("/delUser")
    public String delUser(HttpServletRequest request){
        String id = request.getParameter("id");
        //根据id删除用户
        return "success";
    }
}
