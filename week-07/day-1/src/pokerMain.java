import com.sun.javafx.scene.control.skin.IntegerFieldSkin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class pokerMain {
    public static void main(String[] args) {
        String[] hand1 = {"2D", "2D", "2D", "5D", "5D",};
        String[] hand2 = {"6D", "7D", "8D", "9D", "TD",};

        checkHighHand(hand1, hand2);
    }


    public static int checkHighHand(String[] hand1, String[] hand2) {


        List<Integer> hand1Sorted = sortHand(hand1);

        List<Integer> hand2Sorted = sortHand(hand2);

//        hand1Sorted.stream()
//                .forEach(System.out::println);
//        hand2Sorted.stream()
//                .forEach(System.out::println);

//        int hand1pair = 0;
//        int hand2pair = 0;
//

        checkFull(hand1Sorted);
        checkFull(hand2Sorted);

        checkStraight(hand1Sorted);
        checkStraight(hand2Sorted);

        checkDrill(hand1Sorted);
        checkDrill(hand2Sorted);

        checkPairs(hand1Sorted);
        checkPairs(hand2Sorted);

        List<Integer> firstHand = sortIntegerHand(hand1Sorted);
        List<Integer> secondHand = sortIntegerHand(hand2Sorted);

        firstHand
                .forEach(System.out::println);

        System.out.println();

        secondHand
                .forEach(System.out::println);

        return higherHand(firstHand, secondHand);
    }

    public static List<Integer> sortHand(String[] hand) {
        pokerHand score = new pokerHand();

        List<Integer> sortedHand = Arrays.stream(hand)
                .map(e -> e.charAt(0))
                .map(e -> score.hand.get(e))
                .sorted((a, b) -> a > b ? -1 : 1)
                .collect(Collectors.toList());

        return sortedHand;
    }

    public static List<Integer> sortIntegerHand(List<Integer> hand) {
        return hand.stream()
                .sorted((a, b) -> a > b ? -1 : 1)
                .collect(Collectors.toList());
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

    public static List<Integer> checkPairs(List<Integer> hand) {
        boolean ready = isReady(hand);
        if (!ready) {
            for (int i = 0; i < 4; i++) {
                if (hand.get(i).equals(hand.get(i + 1))) {
                    hand.set(i, hand.get(i) + 13);
                    hand.set(i + 1, hand.get(i + 1) + 13);
                }
            }
        }
        return hand;
    }

    public static List<Integer>checkDrill(List<Integer> hand) {
        boolean ready = isReady(hand);
        if(!ready) {
            for (int i = 0; i < 3; i++) {
                if (hand.get(i).equals(hand.get(i + 2))) {
                    hand.set(i, hand.get(i) + 2 * 13);
                    hand.set(i + 1, hand.get(i + 1) + 2 * 13);
                    hand.set(i + 2, hand.get(i + 2) + 2 * 13);
                }
            }
        }
        return hand;
    }

    public static List<Integer>checkStraight(List<Integer> hand) {
        boolean ready = isReady(hand);
        boolean isStraight = false;
        if(!ready) {
            for (int i = 0; i < 4; i++) {
                if ((hand.get(i)) - 1 == hand.get(i + 1)) {
                    isStraight = true;
                }
            }

            if ((hand.get(0)) == 1 && (hand.get(1)) == 2 && (hand.get(2)) == 3 && (hand.get(3)) == 4 && (hand.get(4)) == 13) {
                isStraight = true;
            }

            if (isStraight) {
                for (int i = 0; i < 5; i++) {
                    if (hand.get(i) != 13) {
                        hand.set(i, hand.get(i) + 3 * 13);
                    } else {
                        hand.set(i, hand.get(i) + 2 * 13);
                    }
                }
            }
        }
        return hand;
    }

    public static List<Integer>checkFull(List<Integer> hand) {
        boolean ready = isReady(hand);

        if(!ready) {
            for (int i = 0; i < 3; i++) {
                if (hand.get(i).equals(hand.get(i + 2))) {
                    hand.set(i, hand.get(i) + 5 * 13);
                    hand.set(i + 1, hand.get(i + 1) + 5 * 13);
                    hand.set(i + 2, hand.get(i + 2) + 5 * 13);
                }
            }
        }
        ready = isReady(hand);
        if (ready) {
            for (int i = 0; i < 4; i++) {
                if (hand.get(i) < 14 && hand.get(i).equals(hand.get(i + 1))) {
                    hand.set(i, hand.get(i) + 4 * 13);
                    hand.set(i + 1, hand.get(i + 1) + 4 *13);
                    return hand;
                }
            }
        }

        return hand;
    }

    public static boolean isReady(List<Integer> hand) {
        boolean ready = false;
        for (Integer card : hand) {
            if (card > 13) {
                ready = true;
            }
        }
        return ready;
    }
}