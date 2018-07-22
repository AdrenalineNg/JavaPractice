package com.trinityBakery.trinityBakery.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("finishedProducLibrary")
public class FinishedProductLibraryController {
    
    @RequestMapping(value="login",method= RequestMethod.GET)
    public String userlogin() {
        return "login";
    }
    
    @RequestMapping("finishedProducLibrary")
    public String finishedProducLibrary() {
        return "finishedProducLibrary";
    }
    
    @RequestMapping("storehouse")
    public String storehouse() {
        return "storehouse";
    }

}