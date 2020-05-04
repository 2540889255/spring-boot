package com.aynu.springboot;

import com.aynu.springboot.bean.Person;
import com.aynu.springboot.bean.TestBean;
import com.aynu.springboot.config.TestUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTests {
    @Autowired
    Person person;
    @Autowired
    ApplicationContext ioc;

    Logger logger= LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {
        //System.out.println(person);
       Boolean a=ioc.containsBean("helloService");
        //System.out.println(a);
        logger.trace("this is trace logger");
        logger.debug("this is debug logger");
        logger.info("this is info logger");
        logger.warn("this is warn logger");
        logger.error("this is error logger");

    }

    @Autowired
    TestBean testBean;

    @Test
    public void  showtestbean(){
        testBean.setName("luchen");
        System.out.println(testBean.getName());

    }

    @Test
    public void showconfiguser(){
        ApplicationContext ctx=new AnnotationConfigApplicationContext(Application.class);
        TestUser testUser=ctx.getBean(TestUser.class);
        System.out.println(testUser.getName());

    }
}
