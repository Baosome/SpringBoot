package com.SpringLearning.JavaGaming2.a4;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass { // singleton - One object instance per Spring IoC Container (NOT Java Singleton)
}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) // different instance
@Component
class PrototypeClass {
}

@Configuration
@ComponentScan
public class BeanScopeApplicationLauncher {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(BeanScopeApplicationLauncher.class);) {
            //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
        }
    }
}
