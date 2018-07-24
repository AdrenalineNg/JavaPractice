package com.trinityBakery.trinityBakery.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trinityBakery.trinityBakery.dao.orderRepository;
import com.trinityBakery.trinityBakery.dao.refundRepository;
import com.trinityBakery.trinityBakery.model.good;
import com.trinityBakery.trinityBakery.model.order;
import com.trinityBakery.trinityBakery.model.refund;


@Controller

public class saleController {    
	
	@Autowired
	private orderRepository orepository;
	@Autowired
	private refundRepository rrepository;
	

	@RequestMapping(value = "/sale",method = RequestMethod.GET)
    public String sale(Map<String, Object> map) {
		List<order> list = new ArrayList<order>();
        list = orepository.findAll();
        map.put("order", list);
        return "sale";
    }
    
    @RequestMapping("sale-user")
    public String sale_user() {
        return "sale-user";
    }
    
    @RequestMapping("/sale-order-detail/{id}")
    public String sale_order_detail(@PathVariable("id") Integer id) {
        //根据id获取详情
        return "sale-order-detail";
    }
    
	@RequestMapping(value = "/sale-refund",method = RequestMethod.GET)
    public String sale_refund(Map<String, Object> map) {
    	List<refund> list = new ArrayList<refund>();
        list = rrepository.findAll();
        map.put("refund", list);
        return "sale-refund";
    }
    
    @RequestMapping("/sale-refund-detail/{id}")
    public String sale_refund_detail(@PathVariable("id") Integer id) {
        //更具id获取详情
        return "sale-refund-detail";
    }
    @RequestMapping("/sale-create-user")
    public String saleCreateUser(HttpServletRequest request){
        String username =request.getParameter("c-username");
        String contact = request.getParameter("c-contect");
        String rank = request.getParameter("c-rank");
        String address = request.getParameter("c-address");
        String tel = request.getParameter("c-tel");
        String email = request.getParameter("c-email");

        //创建客户

        return "sale-user";
    }
    @RequestMapping("/sale-change-user")
    public String saleChangeUser(HttpServletRequest request){
        String id = request.getParameter("ch-user-id");
        String username =request.getParameter("ch-username");
        String contact = request.getParameter("ch-contect");
        String rank = request.getParameter("ch-rank");
        String address = request.getParameter("ch-address");
        String tel = request.getParameter("ch-tel");
        String email = request.getParameter("ch-email");

        //更新客户信息

        return "sale-user";
    }

    @PostMapping("sale-search-user")
    public String saleSearchUser(HttpServletRequest request){
        String name = request.getParameter("search-name");
        //查询客户名称为name的客户

        return "sale-user";
    }
}
