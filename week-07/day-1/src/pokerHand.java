import java.util.HashMap;
import java.util.Map;

public class pokerHand {
    Map<Character, Integer> hand;

    public pokerHand() {
        hand = new HashMap<>();
        hand.put('2', 2);
        hand.put('3', 3);
        hand.put('4', 4);
        hand.put('5', 5);
        hand.put('6', 6);
        hand.put('7', 7);
        hand.put('8', 8);
        hand.put('9', 9);
        hand.put('T', 10);
        hand.put('J', 11);
        hand.put('Q', 12);
        hand.put('K', 13);
        hand.put('A', 14);
    }
}
