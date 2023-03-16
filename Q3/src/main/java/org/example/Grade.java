package org.example;


public class Grade {
    private Student student;
    private int value;

    public Grade(Student student, int value) {
        this.student = student;
        this.value = value;
    }

    public Student getStudent() {
        return student;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "student=" + student.getName() +
                ", value=" + value +
                '}';
    }
}
