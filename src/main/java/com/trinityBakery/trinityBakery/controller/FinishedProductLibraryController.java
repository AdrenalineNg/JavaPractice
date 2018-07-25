package com.trinityBakery.trinityBakery.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trinityBakery.trinityBakery.dao.goodRepository;
import com.trinityBakery.trinityBakery.dao.storageRepository;
import com.trinityBakery.trinityBakery.dao.tihuoRepository;
import com.trinityBakery.trinityBakery.model.detail;
import com.trinityBakery.trinityBakery.model.order;
import com.trinityBakery.trinityBakery.model.tihuo;


@Controller
public class FinishedProductLibraryController {
	@Autowired
	private tihuoRepository trepository;
	@Autowired
	private storageRepository srepository;

	@RequestMapping(value = "/finishedProducLibrary",method = RequestMethod.GET) 
    public String finishedProducLibrary(Map<String, Object> map) {
		List<tihuo> list = new ArrayList<tihuo>();
        list = trepository.findAll();
        map.put("tihuo", list);
        return "finishedProducLibrary";
    }
    
	//库存网页的表结构有问题    sfid,p_name,sto_date, quantity,exp,p_img
    @RequestMapping("storehouse")
    public String storehouse() {
        return "storehouse";
    }

    @RequestMapping("/fpl-change/{id}")
    public String fplChange(@PathVariable("id") String id){
    	tihuo th=new tihuo();
    	th=trepository.getOne(id);
    	th.setTihuo("已提货");
        try {
        	trepository.save(th);
        }
        catch(Exception e) {
       	    return "error";
        }
        return "redirect:/finishedProducLibrary";
    }

    @RequestMapping("/fpl-del/{id}")
    public String fplDel(@PathVariable("id") Integer id){
        System.out.print(id);
        //删除id为id的库存
        return "redirect:/storehouse";
    }
}