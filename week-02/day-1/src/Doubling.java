public class Doubling {


    public static void main(String[] args) {
        int baseNum = 123;
        doubling(baseNum);
        System.out.println(" Double of baseNum: " + doubling(baseNum));
    }

    public static int doubling(int ertek){
            ertek = (2 * ertek);
            return ertek;
        }
}