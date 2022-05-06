package com.zinkworks.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringPracticeApp {
    public static void main (String... args) {
        SpringApplication.run(
            SpringPracticeApp.class, args);
    }
}
