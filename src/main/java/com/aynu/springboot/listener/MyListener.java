package com.aynu.springboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("web programess is going");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("web server is dead");
    }
}
