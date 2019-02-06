package charsequence;

public class Main {
    public static void main(String[] args) {
        Gnirts myName = new Gnirts("Botond Balogh");
        System.out.println(myName.length());
        System.out.println(myName.charAt(5));
        System.out.println(myName.subSequence(0, myName.length()));

        Shifter myWord = new Shifter("Géza, kék az ég!", 6);
        System.out.println(myWord.charAt(0));
        System.out.println(myWord.subSequence(0, 16));
        System.out.println(myWord.length());
    }
}
