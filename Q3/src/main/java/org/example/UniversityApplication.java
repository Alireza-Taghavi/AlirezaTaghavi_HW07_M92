package org.example;

/**
 * Hello world!
 *
 */
public class UniversityApplication
{
    public static void main( String[] args )
    {
        // Create students
        Student reza = new Student("Reza Mohammadi", "Mechanics", 5);
        Student homan = new Student("Homan Ahmadi", "Mathematics", 4);
        Student nilufar = new Student("Nilufar Hajipour", "Mathematics", 6);

        // Create professors
        Professor yar = new Professor("Yar Ahmadi");
        Professor rezaei = new Professor("Rezaei");

        // Create courses
        Course math1 = new Course("Math 1");
        Course math2 = new Course("Math 2");
        Course physics2 = new Course("Physics 2");

        // Assign professors to courses
        yar.teach(math1);
        rezaei.teach(physics2);
        yar.teach(math2);

        // Enroll students in courses
        reza.enroll(math1);
        reza.enroll(physics2);
        homan.enroll(math1);
        nilufar.enroll(math1);
        nilufar.enroll(math2);

        // Grade students in courses
        math1.grade(reza, 17);
        math1.grade(homan, 14);
        math1.grade(nilufar, 16);
        math2.grade(nilufar, 18);
        physics2.grade(reza, 15);

        // Print students for each professor
        System.out.println("Students of Professor Yar Ahmadi:");
        for (Student student : yar.getStudents()) {
            System.out.println(student.getName());
        }

        System.out.println("Students of Professor Rezaei:");
        for (Student student : rezaei.getStudents()) {
            System.out.println(student.getName());
        }

        // Print professors for each student
        System.out.println("Professors of Reza Mohammadi:");
        for (Course course : reza.getCourses()) {
            System.out.println(course.getProfessor().getName());
        }

        System.out.println("Professors of Nilufar Hajipour:");
        for (Course course : nilufar.getCourses()) {
            System.out.println(course.getProfessor().getName());
        }
    }
}
