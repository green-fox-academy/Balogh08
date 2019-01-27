import java.util.ArrayList;

public class SubInt {
    public static void main(String[] args) {
        System.out.println(subInt(0, new int[] {1, 0, 11, 34, 52, 61, 10}));
      System.out.println(subInt(4, new int[] {1, 11, 34, 52, 61}));
        System.out.println(subInt(8, new int[] {1, 11, 34, 52, 61}));
        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));

    }

    public static ArrayList subInt(Integer numberToBeChecked, int[] arrayFrom){
        ArrayList<Integer> arrayListToBeReturned = new ArrayList<>();
        ArrayList<Integer> arrayFromConvertedToArrayList = new ArrayList<>();

        for (int i = 0; i < arrayFrom.length; i++) {
            arrayFromConvertedToArrayList.add(i,arrayFrom[i]);
        }

        for (int i = 0; i < arrayFrom.length; i++) {
            if (((Integer) arrayFrom[i]).toString().contains(numberToBeChecked.toString())) {
                arrayListToBeReturned.add(arrayFromConvertedToArrayList.indexOf(arrayFrom[i]));

            }
        }

        return arrayListToBeReturned;
    }
}