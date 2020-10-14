package com.testjpaspring.controller;

import com.testjpaspring.model.User;
import com.testjpaspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {


    @Autowired
    UserService userService;





    @GetMapping(value = "/")
    public String home () {
        return "/home";

    }





    @GetMapping(value = "/user")
    public String user (Model model) {

        User user = userService.findByUsername("roma");
        model.addAttribute("message",user.getUsername());

        return "/user";

    }


}
