package com.scm.smartcontactmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

//    home
    @RequestMapping("/home")
    public String getHomePage(Model model){
        model.addAttribute("name","Welcome to my youtube channel");
        model.addAttribute("link","https://www.youtube.com/watch?v=SAqi7zmW1fY&t=5102s");
        return "home";
    }


//    about
    @RequestMapping("/about")
    public String aboutUsPage(Model model){
        model.addAttribute("isLogin",false);
        return "aboutUs";
    }

//    services
    @RequestMapping("/service")
    public String servicePage(){
        return "service";
    }

//    Contact
    @RequestMapping("/contact")
    public String contactPage(){
        return "contact";
    }

//    LogIn
    @RequestMapping("/login")
    public String login(){
        return "logIn";
    }

//     SignUp
    @RequestMapping("/signup")
    public String signUp(){
        return "signUp";
    }

}
