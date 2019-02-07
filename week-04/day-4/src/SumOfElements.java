import java.util.ArrayList;

public class SumOfElements {

    public static int sum(ArrayList<Integer> yourArrayList) {
        if (yourArrayList.equals(null)) {
            throw new NullPointerException();
        }

        if (yourArrayList.size() == 0) {
            throw new IllegalArgumentException();
        }

        int sum = 0;
        for (Integer elements: yourArrayList
             ) {
            sum += elements;
        }
        return sum;
    }
}
