package com.aynu.springboot.springaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AllAspect {

    @Pointcut("execution(* com.aynu.springboot.controller.*.*(..))")
    public void pointcut(){
        System.out.println("我成功的切入到了你们的所有方法");
    }

    @Around("com.aynu.springboot.springaop.AllAspect.pointcut()")
    public Object around(ProceedingJoinPoint pjp){
        long start=System.currentTimeMillis();
        Object proceed=null;
        try {
            proceed =pjp.proceed();
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        long end =System.currentTimeMillis();
        System.out.println(end-start);
        return proceed;


    }
}
