package com.SpringLearning.JavaGaming2.a1;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//Business Classes
// Dep 1
// Dependency2

@Component
class BusinessClass {
    //@Autowired -- Field injection
    Dependency1 dependency1;
    
    Dependency2 dependency2;

    public Dependency1 getDependency1() {
        return dependency1;
    }
    /*
     * It is recommended using constructor injection. Since you only need it once. 
     */
    @Autowired // Constructor injection don't need @autowired it would still work.
    public BusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        System.out.println("Contructor injection");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    @Autowired // Setter / Getter injection
    public void setDependency1(Dependency1 dependency1) {
        System.out.println("Setter injection - set dependency 1");
        this.dependency1 = dependency1;
    }

    public Dependency2 getDependency2() {
        return dependency2;
    }

    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        this.dependency2 = dependency2;
    }

    public String toString(){
        return "Using " + dependency1 + " and " + dependency2;
    }

}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class GamingApp5DepInjection {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (GamingApp5DepInjection.class);) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(BusinessClass.class));
        }
    }

}
