package com.SpringLearning.JavaGaming2.c2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringJpaRepository  extends JpaRepository<Course, Long>{
    List<Course> findByAuthor(String author);

    List<Course> findByName(String name);
}
