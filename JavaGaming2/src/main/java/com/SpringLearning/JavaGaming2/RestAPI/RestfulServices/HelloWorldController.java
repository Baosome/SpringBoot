package com.SpringLearning.JavaGaming2.RestAPI.RestfulServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// Rest API
@RestController
public class HelloWorldController {

    @GetMapping(path = "/HelloWorld")
    String HelloWorld(){
        return "Hello World";
    }

    // APIs Usually return JSON back, Spring allows us to return Bean
    @GetMapping(path = "/HelloBean")
    HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "/HelloWorld/{name}")
    HelloWorldBean helloWorldName(@PathVariable String name) {
        return new HelloWorldBean("Hello World " + name);
    }

}
