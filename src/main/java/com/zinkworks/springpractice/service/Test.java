package com.zinkworks.springpractice.service;

import org.springframework.stereotype.Service;

@Service("myFirstService")
public class Test implements MyFirstService {

    @Override
    public String greetThisPerson(String name) {
        return "Do something " + name;
    }
}