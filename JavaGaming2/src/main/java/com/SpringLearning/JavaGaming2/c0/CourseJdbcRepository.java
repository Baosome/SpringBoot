package com.SpringLearning.JavaGaming2.c0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    JdbcTemplate springJdbcTemplate;

    String myInsertQuery =
    """
        insert into course (id, name, author)
        values(?, ?, ?);
    """;

    String myDeleteQuery = """
        delete from course
        where id = ?;
    """;

    public void insert(Course course){
        springJdbcTemplate.update(myInsertQuery, 
        course.getId(), 
        course.getName(), 
        course.getAuthor());
    }

    public void delete(int id){
        springJdbcTemplate.update(myDeleteQuery, 
        id);
    }


}
