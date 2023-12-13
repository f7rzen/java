package java.lab10;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA {
    private Student[] students;

    public SortingStudentsByGPA(Student[] students) {
        this.students = students;
    }

    public void setArray(Student[] students) {
        this.students = students;
    }

    public void quicksort() {
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                // Сортировка в порядке убывания среднего балла
                return Double.compare(student2.getGPA(), student1.getGPA());
            }
        });
    }

    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Иван", "Иванов", 4.5),
                new Student("Мария", "Петрова", 4.2),
                new Student("Петр", "Сидоров", 4.8),
                new Student("Анна", "Кузнецова", 4.0),
        };

        SortingStudentsByGPA sorter = new SortingStudentsByGPA(students);

        System.out.println("Исходный массив студентов:");
        sorter.outArray();

        sorter.quicksort();
        System.out.println("\nОтсортированный массив студентов по среднему баллу:");
        sorter.outArray();
    }
}
