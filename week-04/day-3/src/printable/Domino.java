package printable;

public class Domino implements Printable {
    private  int left;
    private  int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    @Override
    public void printAllFields() {
        System.out.println("[" + getLeftSide() + ", " + getRightSide() + "]");
    }
}
