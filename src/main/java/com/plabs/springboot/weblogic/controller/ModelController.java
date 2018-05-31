package com.plabs.springboot.weblogic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelController {

    @RequestMapping(path = "/welcome",
    method = RequestMethod.GET)
    public String welcome(Model model) {
        System.out.println("inside welcome");
        return "index";
    }

    @RequestMapping(path = "/c1",
            method = RequestMethod.GET)
    public ModelAndView c1() {
        System.out.println("inside c1");
        return new ModelAndView("index");
    }
}
