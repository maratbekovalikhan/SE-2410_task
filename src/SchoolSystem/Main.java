package SchoolSystem;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        // Add students
        Student student1 = new Student("Harry", "Potter", 21, true);
        student1.addGrade(78);
        student1.addGrade(89);
        student1.addGrade(99);

        Student student2 = new Student("Hermione", "Granger", 19, false);
        student2.addGrade(100);
        student2.addGrade(99);
        student2.addGrade(95);

        // Add teachers
        Teacher teacher1 = new Teacher("Severus", "Snape", 51, true, "Math", 7, 800000);
        Teacher teacher2 = new Teacher("Minerva", "McGonagall", 62, false, "Sociology", 17, 1100000);

        // Add members to school
        school.addMember(student1);
        school.addMember(student2);
        school.addMember(teacher1);
        school.addMember(teacher2);

        // Print all members
        school.printAllMembers();
    }
}