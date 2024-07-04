package com.SpringLearning.JavaGaming2.a3;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component 
// Eager normal recommended, 
// errors are discovered immediately after startup
class ClassA{}

@Component 
// Lazy and on @Bean and 
// @Configuration (applies to all the beans inside) too
@Lazy
class ClassB{
    ClassA classA;

    public ClassB(ClassA classA) {
        super();
        System.out.println("Init logic");
        this.classA = classA;
    }

    void doSomething(){
        System.out.println("Something");
    }
}

@Configuration
@ComponentScan
public class LazyInitLauncherApplication {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (LazyInitLauncherApplication.class);) {
            Arrays.stream(context.getBeanDefinitionNames())
            .forEach(System.out::println);

            System.out.println("test");
            context.getBean(ClassB.class).doSomething();
        }
    }

}
