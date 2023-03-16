package org.example;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String name;
    private List<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void teach(Course course) {
        courses.add(course);
        course.setProfessor(this);
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        for (Course course : courses) {
            students.addAll(course.getStudents());
        }
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getStudentsList() {
        StringBuilder students = new StringBuilder();

        students.append("[");
        for (Course course : courses) {
            for (Student student : course.getStudents()) {
                students.append(student.getName()).append(", ");
            }
        }
        students.append("]");
        return String.valueOf(students);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", courses=" + courses.toString() +
                ", students=" + this.getStudentsList() +
                '}';
    }
}
