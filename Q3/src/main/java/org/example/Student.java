package org.example;


import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String major;
    private int semester;
    private List<Course> courses;

    public Student(String name, String major, int semester) {
        this.name = name;
        this.major = major;
        this.semester = semester;
        this.courses = new ArrayList<>();
    }

    public void enroll(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", semester=" + semester +
                '}';
    }
}

