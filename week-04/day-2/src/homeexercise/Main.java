package homeexercise;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Laci", 30,"male");
        person1.introduce();
        person1.getGoal();

        Student stud1 = new Student("Boti", 23, "male", "CUB" ,0);
        stud1.skipDays(10);
        stud1.introduce();
        stud1.getGoal();
    }
}
