package fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));

    }

    public static long fibonacci(long n) {
      if (n == 0) {
          return 0;
      }
      if (n ==1) {
          return 1;
      }
        return n = fibonacci(n - 1) + fibonacci(n -2);
    }
}
