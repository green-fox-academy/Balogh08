package teacherstudent;

import java.util.ArrayList;


public class Teacher {
    String name;

    public Teacher() {

    }

    public Teacher(String name) {
        this.name = name;
    }

    public void answer() {
        System.out.println(name + " answered the student's question");
    }

    public void teach(Student student) {
        student.learn();
    }
}
