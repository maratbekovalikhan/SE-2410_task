package hw;

class Teacher extends Person {
    String subject;
    int yearsOfExperience;
    int salary;

    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void giveRaise(int percentage) {
        this.salary += this.salary * percentage / 100;
    }

    @Override
    public String toString() {
        String genderStr = gender ? "Male" : "Female";
        return String.format("Hi, I am %s %s, a %d-year-old %s. I teach %s.", name, surname, age, genderStr, subject);
    }
}
