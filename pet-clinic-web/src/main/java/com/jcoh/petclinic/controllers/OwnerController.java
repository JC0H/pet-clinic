package com.jcoh.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"","/","/owners/index","/owners/index.html"})
    public String listOfOwners(){
        return "owners/index";
    }
}
