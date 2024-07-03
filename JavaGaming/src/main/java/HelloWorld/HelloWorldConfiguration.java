package HelloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Address(String street, String city) {};
record Person(String name, int age, Address address) {  };

@Configuration
public class HelloWorldConfiguration {
    
    @Bean
    public String name() {
        return "Bao";
    }

    @Bean
    public int age() {
        return 20;
    }

    @Bean
    public Person person() {
        return new Person("Sbeve", 12, new Address("44th", "New York"));
    }

    @Bean Person person2() {
        return new Person(name(), age(), address2());
    }   

    @Bean Person person3(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }

    @Bean Person person4Qualifier(String name, int age, @Qualifier("addressQualifier") Address address) {
        return new Person(name, age, address);
    }

    @Bean(name = "address2")
    @Primary
    public Address address2() {
        return new Address("23rd", "China");
    }

    @Bean(name = "address3")
    @Qualifier("addressQualifier")
    public Address address3() {
        return new Address("45rd", "Vegas");
    }
}
