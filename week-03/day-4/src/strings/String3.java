package strings;

public class String3 {
    public static void main(String[] args) {
        String myString = "Hello World!";

        System.out.printf(insertAsterisk(myString));
    }

    public static String insertAsterisk(String wordToAddAsterisk) {
        if (wordToAddAsterisk.length() == 1){
            return wordToAddAsterisk;
        }
        String firstChar;
        firstChar = wordToAddAsterisk.charAt(0) + "*";
        return firstChar + insertAsterisk(wordToAddAsterisk.substring(1));
    }
}
