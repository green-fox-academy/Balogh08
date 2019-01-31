package bunny2;

public class Bunny2 {
    public static void main(String[] args) {
        System.out.println(numberOfWeirdBunniesEars(10));
    }
    public static int numberOfWeirdBunniesEars(int n) {
        if (n <= 0){
            return 0;
        }

        if (n % 2 == 0) {
            return 3 + numberOfWeirdBunniesEars(n -1);
        }
        
        return 2 + numberOfWeirdBunniesEars(n -1);
    }
}
