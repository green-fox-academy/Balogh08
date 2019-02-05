package homeexercise;

public class Mentor extends Person {
    String level = "intermediate";

    public Mentor() {

    }

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
    }

    @Override
    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ", " + level + " mentor.");
    }
}
