package com.SpringLearning.JavaGaming2.c1;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
    
    @PersistenceContext //instead of autowired
    EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course); // everything is auto matched
    }

    public Course selectById(long id){
       return entityManager.find(Course.class, id);
    }

    public void deleteById(long id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course); 
    }


}
