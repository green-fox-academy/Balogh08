public class SumAll {
    public static void main(String[] args) {
        int[] ai = {3,4,5,5,6,7};
        int sumOfAi = 0;

        for (int i = 0; i < ai.length; i++) {
            sumOfAi = sumOfAi + ai[i];
        }
        System.out.println(sumOfAi);
    }
}
