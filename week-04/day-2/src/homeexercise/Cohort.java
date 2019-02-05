package homeexercise;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    String name;
    List<Student> students = new ArrayList<>();
    List<Mentor> mentors = new ArrayList<>();

    public Cohort(String name) {
        this.name = name;
    }

    public void addStudent(Student name) {
        students.add(name);
    }

    public void addMentor(Mentor name) {
        mentors.add(name);
    }

    public void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
}
