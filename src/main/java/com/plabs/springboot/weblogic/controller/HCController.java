package com.plabs.springboot.weblogic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HCController {

    @RequestMapping(path = "/hc", method = RequestMethod.GET)
    public Object getHealth() {
        System.out.println("Inside");
        return "Running;";
    }
}
