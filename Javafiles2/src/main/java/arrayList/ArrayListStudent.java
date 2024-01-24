package arrayList;

import java.util.ArrayList;

class Student {
    String firstName;
    String lastName;
    double gpa;

    // Constructor
    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }
}

public class ArrayListStudent {
    public static void main(String[] args) {
        // Create an ArrayList of Students
        ArrayList<Student> students = new ArrayList<>();

        // Add students to the ArrayList
        students.add(new Student("John", "Doe", 3.8));
        students.add(new Student("Jane", "Smith", 3.2));
        students.add(new Student("Bob", "Johnson", 3.5));
        students.add(new Student("Alice", "Williams", 3.9));

        // Display students before removal
        System.out.println("Students before removal:");
        for (Student student : students) {
            System.out.println(student.firstName + " " + student.lastName + " - GPA: " + student.gpa);
        }

        // Calculate the average GPA
        double totalGPA = 0;
        for (Student student : students) {
            totalGPA += student.gpa;
        }
        double averageGPA = totalGPA / students.size();

        // Remove students with GPA less than the average GPA
        ArrayList<Student> remainingStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.gpa >= averageGPA) {
                remainingStudents.add(student);
            }
        }

        // Display remaining students
        System.out.println("\nStudents after removal (GPA >= Average GPA):");
        for (Student student : remainingStudents) {
            System.out.println(student.firstName + " " + student.lastName + " - GPA: " + student.gpa);
        }
    }
}