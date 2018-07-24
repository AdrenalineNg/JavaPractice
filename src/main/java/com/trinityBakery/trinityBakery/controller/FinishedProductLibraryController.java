package com.trinityBakery.trinityBakery.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FinishedProductLibraryController {
    
    @RequestMapping("finishedProducLibrary")
    public String finishedProducLibrary() {
        return "finishedProducLibrary";
    }
    
    @RequestMapping("storehouse")
    public String storehouse() {
        return "storehouse";
    }

    @RequestMapping("/fpl-change/{id}")
    public String fplChange(@PathVariable("id") Integer id){
        System.out.print(id);
        //更改id为id的提货单状态
        return "redirect:/storehouse";
    }

    @RequestMapping("/fpl-del/{id}")
    public String fplDel(@PathVariable("id") Integer id){
        System.out.print(id);
        //删除id为id的库存
        return "redirect:/storehouse";
    }
}