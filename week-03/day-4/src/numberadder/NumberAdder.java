package numberadder;

public class NumberAdder {
    public static void main(String[] args) {

        System.out.println(addNum(10));
    }
    public static int addNum (int n) {
       if( n < 1) {
           return 0;
       }
       n += addNum(n - 1);
       return n;
    }
}
