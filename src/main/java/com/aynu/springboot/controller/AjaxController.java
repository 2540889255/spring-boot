package com.aynu.springboot.controller;

import com.aynu.springboot.entities.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AjaxController {

    @RequestMapping("/testajax")
    @ResponseBody
    public void ajax(String name,HttpServletResponse response) throws IOException {
        if("admin".equals(name)){
            response.getWriter().print("true");
        }else{
            response.getWriter().print("flase");
        }
    }

    @RequestMapping("/testajax1")
    @ResponseBody
    public List<Product> ajax(){
        List<Product> list=new ArrayList<Product>();
        list.add(new Product(1,"辣条1","小黑"));
        list.add(new Product(2,"辣条2","小黑"));
        list.add(new Product(3,"辣条3","小黑"));
        list.add(new Product(4,"辣条4","小黑"));

        return list;


    }

    @RequestMapping("/test1")
    public String  testajax2(){
        return "test2";
    }

    @RequestMapping("/test3")
    public String  testajax1(){
        return "test2";
    }

    @RequestMapping("/test2")
    @ResponseBody
    public String testajax3(String username,String password){
        String msg=null;
        if (password!=null){
            if ("123456".equals(password)){
                msg="ok";
            }else{
                msg="密码不正确";
            }
        }
        if (username!=null){
            if("admin".equals(username)){
                msg="ok";
            }else{
                msg="用户名不正确";
            }
        }


        return msg;
    }


}
