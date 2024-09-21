package com.SpringLearning.JavaGaming2.RestAPI.RestfulServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RestfulApplication extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(RestfulApplication.class, args);
    }
}
