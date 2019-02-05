package homeexercise;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.introduce();
        person1.getGoal();

        Student student1 = new Student();
        student1.skipDays(10);
        student1.introduce();
        student1.getGoal();

        Mentor mentor1 = new Mentor();
        mentor1.introduce();
        mentor1.getGoal();

        Sponsor sponsor1 = new Sponsor();
        sponsor1.hire();
        sponsor1.introduce();
        sponsor1.getGoal();

        Cohort greenFox = new Cohort("Green Fox");
        greenFox.addMentor(mentor1);
        greenFox.addStudent(student1);
        greenFox.info();
    }
}
