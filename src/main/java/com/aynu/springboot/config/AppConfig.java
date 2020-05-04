package com.aynu.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "user1")
    public TestUser inituser(){
        TestUser testUser=new TestUser();
        testUser.setName("小黑");
        return  testUser;
    }

}
