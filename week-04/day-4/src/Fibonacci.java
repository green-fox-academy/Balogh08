public class Fibonacci {
    public long fibonacci(long n) {
        if (n < 0) {
            throw new StackOverflowError();
        }

        if (n == 0) {
            return 0;
        }
        if (n ==1) {
            return 1;
        }
        return n = fibonacci(n - 1) + fibonacci(n -2);
    }
}
