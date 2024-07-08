package com.SpringLearning.JavaGaming2.c1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner{

    @Autowired
    CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "JPA: Learn how to be cool af ", "Bao2"));
        repository.insert(new Course(2, "JPA: Learn how to be hot", "David"));
        repository.insert(new Course(3, "JPA: Learn how to be amazing", "SBeve"));
        repository.deleteById(2);
        Course myCourse = repository.selectById(1); // need setters
        System.out.println(myCourse);
    }
    
}
