package com.springaopsept.aopseptdemo.impl;

import com.springaopsept.aopseptdemo.repository.MyInterface;
import org.springframework.stereotype.Service;

@Service
public class MyImpl implements MyInterface {

    @Override
    public String getData() {
        System.out.println("Hiiiiiiiiiiiiiiiiiiii");
        return "Hello Aop";
    }
}
