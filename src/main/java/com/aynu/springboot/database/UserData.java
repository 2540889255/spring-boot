package com.aynu.springboot.database;

import java.io.Serializable;

/**
 *
 */

public class UserData implements Serializable {

    private  String name;
    private  String info;

    public UserData() {
    }

    public UserData(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
