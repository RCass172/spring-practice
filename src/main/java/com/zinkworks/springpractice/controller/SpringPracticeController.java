package com.zinkworks.springpractice.controller;

import com.zinkworks.springpractice.service.MyFirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringPracticeController {
    @Autowired
    private MyFirstService myFirstService;
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Jack") String name) {
        return myFirstService.greetThisPerson(name);
    }
}
