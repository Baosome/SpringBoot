package com.SpringLearning.JavaGaming2.a5;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
class SomeClass{
    SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready!");
    }

    @PostConstruct
    public void initialize() {
        someDependency.GetReady();
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("Cleaning up stuff");
    }

}

@Component
class SomeDependency {
    public void GetReady() {
        System.out.println("Ready! - Logic here");
    }

}


@Configuration
@ComponentScan
public class PrePostApplicationLauncher {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (PrePostApplicationLauncher.class);) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }

}
