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
        repository.insert();
    }
    
}
