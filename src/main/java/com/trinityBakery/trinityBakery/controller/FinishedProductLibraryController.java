package com.trinityBakery.trinityBakery.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("finishedProducLibrary")
public class FinishedProductLibraryController {
    
    @RequestMapping("finishedProducLibrary")
    public String finishedProducLibrary() {
        return "finishedProducLibrary";
    }
    
    @RequestMapping("storehouse")
    public String storehouse() {
        return "storehouse";
    }

}