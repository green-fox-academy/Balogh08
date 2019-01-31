package power;

public class Power {
    public static void main(String[] args) {
        int base = 3;
        int n = 3;

        System.out.println(power(base,n));
    }

    public static int power(int base, int power) {
        if (power <= 0) {
            return 1;
        }

        return (base * power(base, power-1));
    }

}
