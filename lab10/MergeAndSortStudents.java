package java.lab10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeAndSortStudents {
    public static void main(String[] args) {

        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student("Иван", "Иванов", 4.5));
        studentList1.add(new Student("Мария", "Петрова", 4.2));

        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student("Петр", "Сидоров", 4.8));
        studentList2.add(new Student("Анна", "Кузнецова", 4.0));

        List<Student> mergedList = new ArrayList<>(studentList1);
        mergedList.addAll(studentList2);

        Collections.sort(mergedList, (student1, student2) -> Double.compare(student2.getGPA(), student1.getGPA()));

        // Выводим отсортированный список студентов
        System.out.println("Отсортированный список студентов:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}

class Student {
    private String firstName;
    private String lastName;
    private double GPA;

    public Student(String firstName, String lastName, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (GPA: " + GPA + ")";
    }
}
