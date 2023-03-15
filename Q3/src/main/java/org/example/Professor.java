package org.example;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String name;
    private List<Course> courses;
    private List<Student> students;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void teach(Course course) {
        courses.add(course);
        course.setProfessor(this);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
