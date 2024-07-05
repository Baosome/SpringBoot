package com.SpringLearning.JavaGaming2.a6;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject; // instead of autowired
import jakarta.inject.Named; // Instead of component

//@Component
@Named 
class BusinessService{
    DataService dataService;

    @Inject
    public BusinessService(DataService dataService){
        super();
        this.dataService = dataService;
    }

    public DataService gertDataService(){
        return dataService;
    }
}

@Component
class DataService{

}

@Configuration
@ComponentScan
public class CDIContextLauncherApplication {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (CDIContextLauncherApplication.class);) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }

}
