import java.util.ArrayList;

public class SumOfElements {
    ArrayList<Integer> integerArrayList;

    public SumOfElements(ArrayList<Integer> integerArrayList){
        this.integerArrayList = integerArrayList;
    }

    public int Sum() {
        int sum = 0;
        for (Integer elements: integerArrayList
             ) {
            sum += elements;
        }
        return sum;
    }
}
