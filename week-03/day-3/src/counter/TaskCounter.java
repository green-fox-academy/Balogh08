package counter;

public class TaskCounter {
    public static void main(String[] args) {
        Counter myNumber = new Counter(10);
        System.out.println(myNumber.get());
        myNumber.add();
        System.out.println(myNumber.get());
        myNumber.add(100);
        System.out.println(myNumber.get());
        myNumber.reset();
        System.out.println(myNumber.get());



    }
}
