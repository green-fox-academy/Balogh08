import java.util.ArrayList;
import java.util.Arrays;

public class ElementFinder {
    public static void main(String... args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));
    }

    public static String containsSeven(ArrayList arrayToBeChecked){

        String isItSeven = "";

        if (arrayToBeChecked.size() == 7){
            isItSeven = "Hoorray";
        }
        else{
            isItSeven = "Noooooo";
        }
        return isItSeven;
    }
}
