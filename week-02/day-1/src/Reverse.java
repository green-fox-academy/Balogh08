public class Reverse {
    public static void main(String[] args) {
        int[] aj = {3,4,5,6,7};
        int placeHolder = 0;

        for (int i = 0; i < aj.length/2; i++) {
            placeHolder = aj[i];
            aj[i] = aj[(aj.length - 1 - i)];
            aj[(aj.length - 1 - i)] = placeHolder;
            System.out.println(aj[i] + " swapped with " + placeHolder);
        }

        for (int i = 0; i < aj.length; i++) {
            System.out.println(aj[i]);
        }
    }
}
