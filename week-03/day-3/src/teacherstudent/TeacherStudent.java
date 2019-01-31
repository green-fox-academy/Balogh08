package teacherstudent;


public class TeacherStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Boti");
        Teacher teacher1 = new Teacher("Subicz");

        student1.question(teacher1);

        teacher1.teach(student1);
    }
}
