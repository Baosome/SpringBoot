package com.SpringLearning.JavaGaming2.b0;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
            new Course(1, "Learn Web API", "Bao"),
            new Course(2, "Learn AWS", "Bao 2"),
            new Course(3, "Learn Something", "Bao 2"),
            new Course(4, "Learn ChatGPT", "Bao 3")
        );
    }

}
