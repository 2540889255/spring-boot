package com.aynu.springboot.dao;

import com.aynu.springboot.entities.Product;
import org.springframework.stereotype.Repository;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductDao {

    private static Map<Integer, Product> products=null;

    static {
        products =new HashMap<Integer, Product>();

        products.put(1,new Product(1,"辣条","小黑"));
        products.put(2,new Product(2,"辣条","小黑"));
        products.put(3,new Product(3,"辣xiao","小黑"));
        products.put(4,new Product(4,"辣条","小栏"));
        products.put(5,new Product(5,"辣条","小黑"));
        products.put(6,new Product(6,"辣条","小黑"));
    }

    private static Integer initid=7;
    /**
     * 对商品进行增删改查操作
     */
     public void save(Product product){
        if(product.getId()==null){
            product.setId(initid);
        }

        products.put(product.getId(),product);

     }

     public Collection<Product> getall(){
         return products.values();
     }

     public Product get(Integer id){
         return products.get(id);
     }

     public void delete(Integer id){
        products.remove(id);
     }
}
