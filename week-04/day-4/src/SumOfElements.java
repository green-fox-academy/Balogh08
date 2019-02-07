import java.util.ArrayList;

public class SumOfElements {

    public static int sum(ArrayList<Integer> yourArrayList) {
        if (yourArrayList.equals(null)) {
            throw new NullPointerException();
        }

        int sum = 0;
        for (Integer elements: yourArrayList
             ) {
            sum += elements;
        }
        return sum;
    }
}
