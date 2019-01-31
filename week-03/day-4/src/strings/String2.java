package strings;

public class String2 {
    public static void main(String[] args) {
        String myString = "Hello x-men!";
        char remove = 'x';
        System.out.println(removeLetter(myString, remove));
    }

    public static String removeLetter(String wordFromRemove, char charToBeRemoved) {
        if (wordFromRemove.length() == 0) {
            return wordFromRemove;
        }
        char firstChar;

        firstChar = wordFromRemove.charAt(0);

        if (firstChar == charToBeRemoved){
            return removeLetter(wordFromRemove.substring(1),charToBeRemoved);
        }

        return firstChar + removeLetter(wordFromRemove.substring(1),charToBeRemoved);
    }
}
