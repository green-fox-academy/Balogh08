import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class pokerMain {
    public static void main(String[] args) {
        String[] hand1 = {"2D", "3D", "4D", "5D", "6D",};
        String[] hand2 = {"2D", "3D", "4D", "5D", "7D",};

        checkHighHand(hand1, hand2);
    }


    public static int checkHighHand(String[] hand1, String[] hand2) {


        List<Integer> hand1Sorted = sortHand(hand1);

        List<Integer> hand2Sorted = sortHand(hand2);



//        hand1Sorted.stream()
//                .forEach(System.out::println);
//        hand2Sorted.stream()
//                .forEach(System.out::println);

        int hand1pair = 0;
        int hand2pair = 0;

        for (int i = 0; i < 4; i++) {
            if (hand1Sorted.get(i).equals(hand1Sorted.get(i + 1))) {
                hand1pair = hand1Sorted.get(i);
            }
            if (hand2Sorted.get(i).equals(hand2Sorted.get(i + 1))) {
                hand2pair = hand2Sorted.get(i);
            }
        }

        if (hand1pair != hand2pair) {
            if (hand1pair > hand2pair) {
                return 1;
            } else {
                return 2;
            }
        }

        return higherHand(hand1Sorted, hand2Sorted);
    }

    public static List<Integer> sortHand(String[] hand) {
        pokerHand score = new pokerHand();

        List<Integer> sortedHand = Arrays.stream(hand)
                .map(e -> e.charAt(0))
                .map(e-> score.hand.get(e))
                .sorted((a, b) -> a > b ? -1 : 1)
                .collect(Collectors.toList());

        return sortedHand;
    }

    public static int higherHand(List<Integer> hand1Sorted, List<Integer> hand2Sorted) {
        for (int i = 0; i < 5; i++) {
            if (!hand1Sorted.get(i).equals(hand2Sorted.get(i))) {
                if (hand1Sorted.get(i) > hand2Sorted.get(i)) {
                    return 1;
                } else {
                    return 2;
                }
            }
        }
        return 0;
    }
}


