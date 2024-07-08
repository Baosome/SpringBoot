package com.SpringLearning.JavaGaming2.c0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJbdcCommandLineRunner implements CommandLineRunner{

    @Autowired
    CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn how to be cool", "Bao"));
        repository.insert(new Course(2, "Learn how to be hot", "David"));
        repository.insert(new Course(3, "Learn how to be handsome", "SBeve"));
        repository.delete(2);
        Course myCourse = repository.select(1); // need setters
        System.out.println(myCourse);
    }
    
}
