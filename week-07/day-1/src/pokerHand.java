import java.util.HashMap;
import java.util.Map;

public class pokerHand {
    Map<Character, Integer> hand;
    private boolean pair = false;
    private boolean twoPair = false;
    private boolean drill = false;

    public pokerHand() {
        hand = new HashMap<>();
        hand.put('2', 1);
        hand.put('3', 2);
        hand.put('4', 3);
        hand.put('5', 4);
        hand.put('6', 5);
        hand.put('7', 6);
        hand.put('8', 7);
        hand.put('9', 8);
        hand.put('T', 9);
        hand.put('J', 10);
        hand.put('Q', 11);
        hand.put('K', 12);
        hand.put('A', 13);
    }
}
