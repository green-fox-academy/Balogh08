package dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        arrangeDominos();
    }

    public static void arrangeDominos(){

        int randomDomino = (int) (Math.random() * 6);
        Domino firstDomino = initializeDominoes().get(randomDomino);

        List<Domino> organizedDominos = new ArrayList<>();
        organizedDominos.add(firstDomino);

        for (int i = 0; i < initializeDominoes().size() - 1; i++) {
            for (int j = 0; j < initializeDominoes().size(); j++) {
                if (firstDomino.getRightSide() == initializeDominoes().get(j).getLeftSide()){
                    organizedDominos.add(initializeDominoes().get(j));
                    firstDomino = initializeDominoes().get(j);
                    break;
                }
            }
        }
        for (int i = 0; i < organizedDominos.size(); i++) {
            System.out.print(organizedDominos.get(i) + " ");
        }

    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}
