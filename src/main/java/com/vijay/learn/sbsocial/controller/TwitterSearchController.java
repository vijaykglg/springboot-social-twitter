package com.vijay.learn.sbsocial.controller;
/*
Project : springboot-social-twitter
User    : Vijay Gupta
Date    : May 2020
*/

import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;

@Controller
public class TwitterSearchController {
    private final Twitter twitter;

    @Inject
    public TwitterSearchController(Twitter twitter) {
        this.twitter = twitter;
    }

    @GetMapping("/twitter/search")
    public String showTrends(@RequestParam("query") String query, Model model) {
        model.addAttribute("timeline", twitter.searchOperations().search(query).getTweets());
        return "searchresult";
    }

    @GetMapping("/twitter/showSearchPage")
    public String showTrends(Model model) {

        return "search";
    }
}
