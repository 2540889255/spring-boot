package com.aynu.springboot.entities;

public class Product {

    private Integer id;

    private String name;

    private String buyber;

    public Product() {
    }

    public Product(Integer id, String name, String buyber) {
        this.id = id;
        this.name = name;
        this.buyber = buyber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuyber() {
        return buyber;
    }

    public void setBuyber(String buyber) {
        this.buyber = buyber;
    }
}
