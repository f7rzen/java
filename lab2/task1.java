package java.lab2;

public class task1 {
    public static class Author {
        private String name;
        private static String email;
        private char gender;
        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }
        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public char getGender() {
            return gender;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String toString() {
            return "Author{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }


    public class TestAuthor {
        public static void main(String[] args) {
            Author author = new Author("Artem", "akudinov04@mai.ru", 'M');

            System.out.println("Name: " + author.getName());
            System.out.println("Email: " + author.getEmail());
            System.out.println("Gender: " + author.getGender());
            author.setEmail("test@example.com");
            System.out.println("Email: " + author.getEmail());
            System.out.println(author.toString());
        }
    }

}
