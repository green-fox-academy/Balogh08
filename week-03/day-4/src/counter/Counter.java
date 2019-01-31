package counter;

public class Counter {
    public static void main(String[] args) {
       countDown(10);
    }

    public static void countDown(int n) {
        if( n < 0) {
            return;
        }
        countDown(n - 1);
        System.out.println(n);
    }
}
