package com.SpringLearning.JavaGaming2.c0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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

    String mySelectQuery = """
        select * from course
        where id = ?;
    """;

    public void insert(Course course){
        springJdbcTemplate.update(myInsertQuery, 
        course.getId(), 
        course.getName(), 
        course.getAuthor());
    }

    public void delete(long id){
        springJdbcTemplate.update(myDeleteQuery, 
        id);
    }

    public Course select(long id){
        return springJdbcTemplate.
            queryForObject(mySelectQuery, new BeanPropertyRowMapper<>(Course.class), id);
    }


}
