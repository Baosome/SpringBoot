package HelloWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GamingApp2 {
    public static void main(String[] args) {
        // 1: Launch Spring Context

        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        ){
            // 2: Configure the spring context
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person3"));
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean("person4Qualifier"));
    
        }    
    }

}
