package hw;

import java.util.ArrayList;
import java.util.List;

class School {
    List<Person> members;

    public School() {
        this.members = new ArrayList<>();
    }

    public void addMember(Person person) {
        this.members.add(person);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Person person : members) {
            result.append(person.toString()).append("\n");
        }
        return result.toString();
    }
}
