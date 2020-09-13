package homework3;

public class Task3 {
    static class Student {
        String firstName, lastName, group;
        double averageMark;

        public Student(String firstName, String lastName, String group, double averageMark) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.group = group;
            this.averageMark = averageMark;
        }

        public int getScholarship() {
            if (averageMark == 5) {
                return 100;
            } else {
                return 80;
            }
        }
    }

    static class Aspirant extends Student {
        public Aspirant(String firstName, String lastName, String group, double averageMark) {
            super(firstName, lastName, group, averageMark);
        }

        @Override
        public int getScholarship() {
            if (averageMark == 5) {
                return 200;
            } else {
                return 180;
            }

        }
    }

    public static void main(String[] args) {
        Student aspirant1 = new Aspirant("Gleb", "Golovanov", "1117", 5);
        Student[] students = {new Student("Ivan", "Ivanov", "111", 5), new Student("Kifir", "Kifirov", "112", 4.5), new Aspirant("Vitalic", "Kravchenko", "228", 2), aspirant1};
        for (Student student : students) {
            student.getScholarship();
            System.out.println(student.getScholarship());
        }


    }
}
