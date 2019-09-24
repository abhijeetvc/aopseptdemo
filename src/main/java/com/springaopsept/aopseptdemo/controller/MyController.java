package com.springaopsept.aopseptdemo.controller;

import com.springaopsept.aopseptdemo.impl.MyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyImpl myImpl;
    @GetMapping(value="/check")
    public String check(){
        return myImpl.getData();
    }
}
