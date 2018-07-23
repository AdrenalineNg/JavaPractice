package com.trinityBakery.trinityBakery.controller;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.trinityBakery.trinityBakery.dao.goodRepository;
import com.trinityBakery.trinityBakery.model.good;



@Controller
public class userController {
	@Autowired
	private goodRepository goodrepository;



    @RequestMapping(value = "/shopping",method = RequestMethod.GET)
    public String shoppingxianshi(Map<String, Object> map) {
        List<good> list = new ArrayList<good>();
        list = goodrepository.findAll();
        map.put("production", list);
        return "shopping";
    }

    
    @RequestMapping("shoppingcart")
    public String shoppingcart() {
        return "shoppingcart";
    }
    
    @RequestMapping("user-order")
    public String user_order() {
        return "user-order";
    }
    
    @RequestMapping("/user-order-detail/{id}")
    public String user_order_detail(@PathVariable("id") Integer id) {
        //通过id 查询订单详情
        System.out.print(id);
        return "user-order-detail";
    }
    
    @RequestMapping("user-refund")
    public String user_refund() {
        return "user-refund";
    }
    
    @RequestMapping("user-refund-detail/{id}")
    public String user_refund_detail(@PathVariable("id") Integer id) {
        //通过id 查询退款单详情
        System.out.print(id);
        return "user-refund-detail";
    }

}