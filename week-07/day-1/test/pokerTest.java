import org.junit.Test;

import static org.junit.Assert.*;

public class pokerTest {

    @Test
    public void checkHighHand_AllEquals_returnTrue() {
        String[] hand1 = {"2D", "3D", "4D", "5D", "6D",};
        String[] hand2 = {"2D", "3D", "4D", "5D", "6D",};

        int result = pokerMain.checkHighHand(hand1, hand2);
assertEquals(result, 0);
    }

    @Test
    public void checkHighHand_HighestIsHigher_returnFirstHand() {
        String[] hand1 = {"2D", "3D", "4D", "5D", "AD",};
        String[] hand2 = {"2D", "3D", "4D", "5D", "6D",};

        int result = pokerMain.checkHighHand(hand1, hand2);
        assertEquals(result, 1);
    }

    @Test
    public void checkHighHand_RandomCardHigher_returnFirstHand() {
        String[] hand1 = {"2D", "9D", "4D", "5D", "6D",};
        String[] hand2 = {"2D", "3D", "4D", "5D", "6D",};

        int result = pokerMain.checkHighHand(hand1, hand2);
        assertEquals(result, 1);
    }

    @Test
    public void checkHighHand_RandomCardHigher2_returnSecondHand() {
        String[] hand1 = {"2D", "3D", "4D", "5D", "AD",};
        String[] hand2 = {"2D", "3D", "4D", "KD", "AD",};

        int result = pokerMain.checkHighHand(hand1, hand2);
        assertEquals(result, 2);
    }

    @Test
    public void checkHighHand_RandomCardHigher3_returnFisrtHand() {
        String[] hand1 = {"2D", "5D", "7D", "KD", "AD",};
        String[] hand2 = {"2D", "3D", "7D", "KD", "AD",};

        int result = pokerMain.checkHighHand(hand1, hand2);
        assertEquals(result, 1);
    }

    @Test
    public void checkHighHand_HasPair_returnFirstHand() {
        String[] hand1 = {"2D", "3D", "4D", "4D", "AD",};
        String[] hand2 = {"2D", "3D", "4D", "KD", "AD",};

        int result = pokerMain.checkHighHand(hand1, hand2);
        assertEquals(result, 1);
    }

    @Test
    public void checkHighHand_BothHasPair_returnFirstHand() {
        String[] hand1 = {"2D", "3D", "4D", "4D", "AD",};
        String[] hand2 = {"3D", "3D", "4D", "KD", "AD",};

        int result = pokerMain.checkHighHand(hand1, hand2);
        assertEquals(result, 1);
    }

    @Test
    public void checkHighHand_HasTheSamePair_returnSecondHand() {
        String[] hand1 = {"2D", "3D", "4D", "4D", "AD",};
        String[] hand2 = {"2D", "4D", "4D", "KD", "AD",};

        int result = pokerMain.checkHighHand(hand1, hand2);
        assertEquals(result, 2);
    }

    @Test
    public void checkHighHand_HasTheSamePairAndAnExtra_returnFirstHand() {
        String[] hand1 = {"2D", "AD", "4D", "4D", "AD",};
        String[] hand2 = {"2D", "4D", "4D", "KD", "AD",};

        int result = pokerMain.checkHighHand(hand1, hand2);
        assertEquals(result, 1);
    }

    @Test
    public void checkHighHand_HasTwoPairsAndOne_returnFirstHand() {
        String[] hand1 = {"2D", "AD", "4D", "4D", "AD",};
        String[] hand2 = {"2D", "4D", "5D", "AD", "AD",};

        int result = pokerMain.checkHighHand(hand1, hand2);
        assertEquals(result, 1);
    }
}
