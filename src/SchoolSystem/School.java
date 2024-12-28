package SchoolSystem;

import java.util.ArrayList;

public class School {
    private ArrayList<Person> members;

    public School() {
        members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    public void printAllMembers() {
        for (Person member : members) {
            System.out.println(member.toString());
        }
    }
}