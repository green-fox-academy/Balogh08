public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        System.out.println(quote.replace("It you", "It always takes longer than you"));

    }
   /* public StringBuilder insert() {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        int from = quote.indexOf("you");
        String toBeAdded = "always takes longer than";
        StringBuilder newQuote = new StringBuilder();
        System.out.println(newQuote.insert(from, toBeAdded));
        System.out.println(quote);
    }*/


}
