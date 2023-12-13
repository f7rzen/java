package java.lab9;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>{

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getGPA() == student2.getGPA()) {
            return 0;
        }

        if (student1.getGPA() < student2.getGPA()) {
            return -1;
        }

        return 1;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Иван", 25,5),
                new Student("Мария", 22,4),
                new Student("Алексей", 28,3),
                new Student("Екатерина", 21,2)
        };

        for (Student student : students) {
            System.out.print(student.Name + " итоговый балл: " + student.GPA + "\n");
        }
    }
}
