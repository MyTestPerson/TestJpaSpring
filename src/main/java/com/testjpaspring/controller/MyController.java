package com.testjpaspring.controller;

import com.testjpaspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {


    @Autowired
    UserService userService;


    @ResponseBody
    @GetMapping(value = "/")
    public String home () {

        return userService.findByUsername("roma").getUsername();

    }


}
