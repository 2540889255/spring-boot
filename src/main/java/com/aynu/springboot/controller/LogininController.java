package com.aynu.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LogininController {

    @RequestMapping("/index")
    public String login(){

        return "redirect:/login";
    }

/*    @ResponseBody
    @RequestMapping("/login")
    public String login1(){

        return "你到了这";
    }*/

}
