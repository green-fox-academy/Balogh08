package bunny1;

public class Bunny1 {
    public static void main(String[] args) {
        System.out.println(numberOfBunniesEars(3));
    }
    public static int numberOfBunniesEars(int n) {
        if(n <= 0) {
            return 0;
        }
        return 2 + numberOfBunniesEars(n -1);
    }
}
