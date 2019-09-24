package com.springaopsept.aopseptdemo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAop {

    @After(" execution (* com.springaopsept.aopseptdemo.impl.MyImpl.getData(..))")
    public void doSomething(){
        System.out.println("Before Execution of Method");
    }

}
