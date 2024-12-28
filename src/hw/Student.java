package hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Student extends Person {
    int studentID;
    List<Integer> grades;

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = new Random().nextInt(9000) + 1000;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        }
    }

    public double calculateGPA() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        String genderStr = gender ? "Male" : "Female";
        return String.format("Hi, I am %s %s, a %d-year-old %s. I am a student with ID %d.", name, surname, age, genderStr, studentID);
    }
}
