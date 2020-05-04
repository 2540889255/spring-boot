package com.aynu.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes
@RequestMapping
@Controller
public class TestSessionController {

    @RequestMapping
    public void show(){

    }
}
