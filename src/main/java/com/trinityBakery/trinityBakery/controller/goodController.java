package com.trinityBakery.trinityBakery.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.trinityBakery.trinityBakery.dao.goodRepository;
import com.trinityBakery.trinityBakery.model.admin;
import com.trinityBakery.trinityBakery.model.good;


public class goodController {
    @Autowired
    private goodRepository grepository;
    good g = new good();
    g.setG_name(name);
    g.setG_price(price);
    g.setG_id(id);
    g.setG_img(img);
    gRepository.save(g);


}
