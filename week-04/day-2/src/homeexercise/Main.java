package homeexercise;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.introduce();
        person1.getGoal();

        Student stud1 = new Student();
        stud1.skipDays(10);
        stud1.introduce();
        stud1.getGoal();

        Mentor mentor1 = new Mentor();
        mentor1.introduce();
        mentor1.getGoal();
    }
}
