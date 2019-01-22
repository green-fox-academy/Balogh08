import java.util.ArrayList;
import java.util.Arrays;

public class QuoteSwap {
    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        System.out.println(quoteSwap(list));
    }
        public static String quoteSwap(ArrayList listToBeUsed){

            int indexDo = listToBeUsed.indexOf("do");
            int indexCannot = listToBeUsed.indexOf("cannot");
            String correctSentence = "";

            listToBeUsed.set(indexDo, listToBeUsed.get(indexCannot));
            listToBeUsed.set(indexCannot, listToBeUsed.get(indexDo));

            for (int i = 0; i < listToBeUsed.size(); i++) {
                correctSentence = correctSentence + listToBeUsed.get(i) + " ";
            }
            return correctSentence;
        }

}