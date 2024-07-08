package com.SpringLearning.JavaGaming2.c2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner{

    // @Autowired
    // CourseSpringJpaRepository repository;

    @Autowired
    CourseSpringJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Spring JPA: Learn how to be cool af ", "Bao2"));
        repository.save(new Course(2, "Spring JPA: Learn how to be hot", "David"));
        repository.save(new Course(3, "Spring JPA: Learn how to be amazing", "SBeve"));
        repository.deleteById(2l);

        System.out.println(repository.findById(1l));
        System.out.println(repository.findAll());
        System.out.println("-----------------------");
        System.out.println(repository.count());
        System.out.println("-----------------------");
        System.out.println(repository.findByAuthor("SBeve"));
        
    }
    
}
