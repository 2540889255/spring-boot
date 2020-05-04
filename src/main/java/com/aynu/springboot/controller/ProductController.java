package com.aynu.springboot.controller;

import com.aynu.springboot.dao.ProductDao;
import com.aynu.springboot.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductDao productDao;
    //显示所有商品信息
    @RequestMapping("/product")
    public String list(Model model){
        Collection <Product> products=productDao.getall();
        model.addAttribute("products",products);
        return "product/products";
    }
    //根据id显示商品信息
    @RequestMapping("/product/{id}")
    public String get(@PathVariable("id")Integer id,Model model){
        Product product=productDao.get(id);
        model.addAttribute("products",product);
        return "product/add";
    }
    //根据id删除商品信息
    @PostMapping("/product/delete/{id}")
    public String delete(@PathVariable("id")Integer id){
        productDao.delete(id);

        return "redirect:/product";
    }
    //编辑商品的信息 通过表单提交的
    @PostMapping("/product")
    public String edit(Product product) {
        productDao.save(product);
        return "redirect:/product";
    }

    @GetMapping("/product")
    @ResponseBody
    public Collection<Product> showproduct(Model model){
        Collection <Product> products=productDao.getall();
        model.addAttribute("products",products);
        return products;
    }


}
