package java.lab9;

public class InsertionSort {

    public static void insertionSort(Student[] students) {
        int j;
        for (int i = 1; i < students.length; ++i) {
            int key = students[i].IDNumber;
            for (j = i; j > 0 && key < students[j - 1].IDNumber ; j--) {
                students[j].IDNumber = students[j - 1].IDNumber;
            }
            students[j].IDNumber = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Иван", 25,5),
                new Student("Мария", 22,4),
                new Student("Алексей", 28,4),
                new Student("Екатерина", 21,5)
        };
        insertionSort(students);

        for (Student student : students) {
            System.out.print(student.Name + " " + student.IDNumber + "\n");
        }
    }
}
