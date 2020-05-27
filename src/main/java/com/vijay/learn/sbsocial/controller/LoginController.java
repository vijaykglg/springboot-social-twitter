package com.vijay.learn.sbsocial.controller;
/*
Project : springboot-social-twitter
User    : Vijay Gupta
Date    : May 2020
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }
}
