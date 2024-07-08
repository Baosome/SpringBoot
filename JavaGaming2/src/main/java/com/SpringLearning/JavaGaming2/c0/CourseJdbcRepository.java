package com.SpringLearning.JavaGaming2.c0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    JdbcTemplate springJdbcTemplate;

    String myQuery =
    """
        insert into course (id, name, author)
        values(1, 'How to be cool', 'Bao');
            """;

    public void insert(){
        springJdbcTemplate.update(myQuery);
    }
}
