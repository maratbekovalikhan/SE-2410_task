package hw;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Harry", "Potter", 21, true),
                new Student("Ron", "Weasley", 20, true),
                new Student("Hermione", "Granger", 19, false),
                new Student("Luna", "Lovegood", 20, false),
                new Student("Draco", "Malfoy", 19, true)
        };

        students[0].addGrade(78);
        students[0].addGrade(89);
        students[0].addGrade(99);
        students[0].addGrade(51);

        students[1].addGrade(78);
        students[1].addGrade(89);
        students[1].addGrade(75);
        students[1].addGrade(63);
        students[1].addGrade(82);

        students[2].addGrade(100);
        students[2].addGrade(99);
        students[2].addGrade(95);
        students[2].addGrade(98);
        students[2].addGrade(100);
        students[2].addGrade(96);
        students[2].addGrade(97);

        students[3].addGrade(46);
        students[3].addGrade(87);
        students[3].addGrade(67);
        students[3].addGrade(79);
        students[3].addGrade(96);
        students[3].addGrade(58);
        students[3].addGrade(83);

        students[4].addGrade(21);
        students[4].addGrade(45);
        students[4].addGrade(0);
        students[4].addGrade(9);
        students[4].addGrade(51);
        students[4].addGrade(43);

        Teacher[] teachers = {
                new Teacher("Severus", "Snape", 51, true, "Math", 7, 800000),
                new Teacher("Albus", "Dumbledore", 71, true, "Philosophy", 25, 1500000),
                new Teacher("Minerva", "McGonagall", 62, false, "Sociology", 17, 1100000),
                new Teacher("Bellatrix", "Lestrange", 35, false, "Programming", 3, 570000),
                new Teacher("Sirius", "Black", 49, true, "Physics", 9, 750000)
        };

        School school = new School();

        for (Student student : students) {
            school.addMember(student);
        }

        for (Teacher teacher : teachers) {
            school.addMember(teacher);
        }

        for (Student student : students) {
            System.out.println(student.name + "'s GPA: " + student.calculateGPA());
        }

        for (Teacher teacher : teachers) {
            System.out.println("Before raise: " + teacher.name + "'s salary: " + teacher.salary);
            if (teacher.yearsOfExperience > 10) {
                teacher.giveRaise(10);
            }
            System.out.println("After raise: " + teacher.name + "'s salary: " + teacher.salary);
        }

        school.members.sort((p1, p2) -> p1.surname.compareTo(p2.surname));

        System.out.println("\nAll School Members:");
        System.out.println(school.toString());
    }
}
