package homeexercise;

public class Student extends Person{
    String previousOrganization = "The Dalles Wathonka High School";
    int skippedDays = 0;

    public Student() {

    }

    public Student(String name, int age, String gender, String previousOrganization, int skippedDays) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = skippedDays;
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }
}
