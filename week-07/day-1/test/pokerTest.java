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

    @Test
    public void checkHighHand_BothHave2Pairs_returnFirstHand() {
        String[] hand1 = {"2D", "AD", "4D", "4D", "AD",};
        String[] hand2 = {"2D", "2D", "5D", "AD", "AD",};

        int result = pokerMain.checkHighHand(hand1, hand2);
        assertEquals(result, 1);
    }

    @Test
    public void checkHighHand_DrillAgainstPairs_returnFirstHand() {
        String[] hand1 = {"2D", "4D", "4D", "4D", "AD",};
        String[] hand2 = {"2D", "2D", "5D", "AD", "AD",};

        int result = pokerMain.checkHighHand(hand1, hand2);
        assertEquals(result, 1);
    }

    @Test
    public void checkHighHand_Straight_returnFirstHand() {
        String[] hand1 = {"2D", "3D", "4D", "5D", "6D",};
        String[] hand2 = {"2D", "2D", "5D", "AD", "AD",};

        int result = pokerMain.checkHighHand(hand1, hand2);
        assertEquals(result, 1);
    }

    @Test
    public void checkHighHand_BothStraight_returnSecondHand() {
        String[] hand1 = {"2D", "3D", "4D", "5D", "6D",};
        String[] hand2 = {"5D", "6D", "7D", "8D", "9D",};

        int result = pokerMain.checkHighHand(hand1, hand2);
        assertEquals(result, 2);
    }

    @Test
    public void checkHighHand_BicycleStraight_returnFirstHand() {
        String[] hand1 = {"2D", "3D", "4D", "AD", "5D",};
        String[] hand2 = {"5D", "6D", "7D", "8D", "9D",};

        int result = pokerMain.checkHighHand(hand1, hand2);
        assertEquals(result, 1);
    }

    @Test
    public void checkHighHand_StraightAgainstFull_returnFirstHand() {
        String[] hand1 = {"2D", "2D", "4D", "4D", "4D",};
        String[] hand2 = {"5D", "6D", "7D", "8D", "9D",};

        int result = pokerMain.checkHighHand(hand1, hand2);
        assertEquals(result, 1);
    }

    @Test
    public void checkHighHand_FullAgainstFull_returnFirstHand() {
        String[] hand1 = {"2D", "2D", "4D", "4D", "4D",};
        String[] hand2 = {"2D", "2D", "AD", "AD", "2D",};

        int result = pokerMain.checkHighHand(hand1, hand2);
        assertEquals(result, 1);
    }

    @Test
    public void checkHighHand_DrillAgainstStraight_returnSecondHand() {
        String[] hand1 = {"2D", "8D", "4D", "4D", "4D",};
        String[] hand2 = {"2D", "3D", "4D", "AD", "5D",};
        int result = pokerMain.checkHighHand(hand1, hand2);
        assertEquals(result, 2);
    }

    @Test
    public void checkHighHand_FullAgainstPoker_returnSecondHand() {
        String[] hand1 = {"2D", "2D", "4D", "4D", "4D",};
        String[] hand2 = {"2D", "2D", "2D", "AD", "2D",};

        int result = pokerMain.checkHighHand(hand1, hand2);
        assertEquals(result, 2);
    }
}
