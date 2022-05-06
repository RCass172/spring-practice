package com.zinkworks.springpractice;

import com.zinkworks.springpractice.service.MyFirstService;
import com.zinkworks.springpractice.service.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringPracticeApp {
    public static void main (String... args) {
        SpringApplication.run(
            SpringPracticeApp.class, args);

        MyFirstService impService = new Test();
        impService.greetThisPerson("Ruth");
    }
}
