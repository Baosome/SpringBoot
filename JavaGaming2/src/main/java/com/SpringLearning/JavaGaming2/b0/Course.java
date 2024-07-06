package com.SpringLearning.JavaGaming2.b0;

public class Course {
    int classID;
    String courseName;
    String Author;

    public Course(int classID, String courseName, String author) {
        this.classID = classID;
        this.courseName = courseName;
        Author = author;
    }

    public int getClassID() {
        return classID;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getAuthor() {
        return Author;
    }

    @Override
    public String toString() {
        return "Course [classID=" + classID + ", courseName=" + courseName + ", Author=" + Author + "]";
    }

}
