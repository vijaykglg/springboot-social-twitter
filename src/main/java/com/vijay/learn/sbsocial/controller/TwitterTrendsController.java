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
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;

@Controller
public class TwitterTrendsController {
    // Yahoo Where On Earth ID representing the entire world
    private static final long WORLDWIDE_WOE = 1L;
    private static final long MUMBAI_WOE = 2295411;

    private final Twitter twitter;

    @Inject
    public TwitterTrendsController(Twitter twitter) {
        this.twitter = twitter;
    }
    @GetMapping("/twitter/showTrendsPage")
    public String showTrendsPage(Model model) {
        //model.addAttribute("trends", twitter.searchOperations().getLocalTrends(MUMBAI_WOE));
        return "showTrendsPage";
    }

    @GetMapping("/twitter/trends")
    public String showTrends(@RequestParam("woe") Long woe,Model model) {
        model.addAttribute("trends", twitter.searchOperations().getLocalTrends(woe));
        return "trendsResult";
    }
}
