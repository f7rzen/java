package java.lab11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class task3 {
    public static class Student {
        private String name;
        private Date birthDate;

        public Student(String name, Date birthDate) {
            this.name = name;
            this.birthDate = birthDate;
        }

        public void setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
        }

        public String getShortFormattedBirthDate() {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
            return sdf.format(birthDate);
        }

        public String getMediumFormattedBirthDate() {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.format(birthDate);
        }

        public String getFullFormattedBirthDate() {
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
            return sdf.format(birthDate);
        }
        
        @Override
        public String toString() {
            return "Студент: " + name +
                    "\nДата рождения в полном формате: " + getFullFormattedBirthDate() +
                    "\nДата рождения в среднем формате: " + getMediumFormattedBirthDate() +
                    "\nДата рождения в коротком формате: " + getShortFormattedBirthDate();
        }
    }

    public static void main(String[] args) {
        Date birthDate = new Date();
        Student student = new Student("Artem Kudinov", birthDate);
        System.out.println(student);
    }
}