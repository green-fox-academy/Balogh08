public class SwapElements {
    public static void main(String[] args) {
        String[] abc = {"first", "second", "third"};
        String placeHolder = "null";
        placeHolder = abc[0];

        System.out.println("Index 0 value BEFORE swap: " + abc[0] + " and index 2 value BEFORE spaw: " + abc[2]);
        abc[0] = abc[2];
        abc[2] = placeHolder;
        System.out.println("Index 0 AFTER swap: " + abc[0] + " and index 2 AFTER swap: " + abc[2]);
    }
}
