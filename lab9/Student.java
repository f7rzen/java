package java.lab9;

public class Student {
    String Name;
    int IDNumber;
    int GPA;

    public Student(String name, int IDNumber, int GPA) {
        this.Name = name;
        this.IDNumber = IDNumber;
        this.GPA = GPA;
    }

    public int getGPA() {
        return GPA;
    }
}
