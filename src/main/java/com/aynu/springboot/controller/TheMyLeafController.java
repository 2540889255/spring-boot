package com.aynu.springboot.controller;

import com.aynu.springboot.database.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TheMyLeafController {

    @RequestMapping("/show")
    public String showmian(Model model){
        UserData userData=new UserData();
        userData.setName("小马");
        userData.setInfo("喜欢飞");
        model.addAttribute("User",userData);
        return "thymeleaf";
    }
}
