package strings;

public class String1 {
    public static void main(String[] args) {
        String myString = "megszentségteleníthetetlenségeskedéseitekért";
        char from = 'e';
        char to = 'i';
        System.out.println(string1(myString, from, to));
    }

    public static String string1(String wordToBeModified, char from, char to) {
        if(wordToBeModified.length() == 0) {
            return wordToBeModified;
        }
        char first;

/*        first = (from == wordToBeModified.charAt(0)) ? to : wordToBeModified.charAt(0);*/

        if ( from == wordToBeModified.charAt(0)){
            first = to;
        }
        else {
            first = wordToBeModified.charAt(0);
        }
        return first + string1(wordToBeModified.substring(1), from, to);
    }
}
