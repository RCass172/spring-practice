package com.zinkworks.springpractice.service;

public class Test implements MyFirstService {

    @Override
    public String greetThisPerson(String name) {
        System.out.println("Do something " + name);
        return name;
    }
}