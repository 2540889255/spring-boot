package com.aynu.springboot.bean;

import org.springframework.stereotype.Component;

@Component
public class TestBean {

    private String name;

    public TestBean() {
    }

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
