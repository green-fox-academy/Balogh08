package teacherstudent;

import java.util.ArrayList;
import java.util.Scanner;



public class Student {
    String name;

    public Student(){

    }

    public Student(String name) {
        this.name = name;
    }

    public void learn(){
        System.out.println(name + " learned a lot today!");
    }

    public void question(Teacher teacher){
        teacher.answer();
    }
}
