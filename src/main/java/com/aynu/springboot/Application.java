package com.aynu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Application implements WebMvcConfigurer {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

    /*@Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration ir=registry.addInterceptor(new interceptor());
        ir.addPathPatterns("/*");
    }*/
}
