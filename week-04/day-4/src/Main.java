import java.util.*;

public class Main {
    public static void main(String[] args) {
        CowsAndBulls game = new CowsAndBulls();

        System.out.println(game.randomNumbers[0]);
        System.out.println(game.randomNumbers[1]);
        System.out.println(game.randomNumbers[2]);
        System.out.println(game.randomNumbers[3]);
        game.guess(1,2,3,4);
    }
}