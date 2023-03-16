package org.example;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private Professor professor;
    private List<Student> students;
    private List<Grade> grades;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void grade(Student student, int value) {
        grades.add(new Grade(student, value));
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public Professor getProfessor() {
        return professor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", grades=" + grades.toString() +
                '}';
    }
}
