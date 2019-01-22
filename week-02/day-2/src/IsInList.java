import java.util.ArrayList;
import java.util.Arrays;

public class IsInList {
    public static void main(String... args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        System.out.println(checkNums(list));
        System.out.println(checkNumsSecond(list));
    }
    public static String checkNums(ArrayList listToBeChecked){
        String result = "";
        if(listToBeChecked.contains(4) && listToBeChecked.contains(8) && listToBeChecked.contains(12) && listToBeChecked.contains(16)){
            result = "true";
        }
        else{
            result = "false";
        }
        return result;
    }



    /*=====SECOND SOLUTION=====*/


    public static String checkNumsSecond(ArrayList listToBeChecked) {

        ArrayList<Integer> backUpList = new ArrayList<>(Arrays.asList(4, 8, 12, 16));
        String result = "";

        if (listToBeChecked.containsAll(backUpList)) {
            result = "true";
        } else {
            result = "false";
        }
        return result;
    }



}
