package printable;

public class Main {
    public static void main(String[] args) {
        Domino myDomino = new Domino(1,7);
        myDomino.printAllFields();

        Thing myThing = new Thing("Do the laundry");
        myThing.printAllFields();
    }
}
