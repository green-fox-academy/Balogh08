import java.util.Arrays;
public class UniqueRework {
    public static void main(String[] args) {
        int[] arraySortAndRemoveDuplication = {1,11,34,11,52,61,1,34,11,11,13,11,13,13};
        Arrays.sort(arraySortAndRemoveDuplication);

        int lengthOfArraySortAndRemoveDuplication = arraySortAndRemoveDuplication.length - 1;
        int numberOfUniqElements = 0;

        for (int i = 0; i < lengthOfArraySortAndRemoveDuplication; i++) {
            if (arraySortAndRemoveDuplication[i] != arraySortAndRemoveDuplication[i + 1]){
                numberOfUniqElements = numberOfUniqElements + 1;
            }
        }

        numberOfUniqElements = numberOfUniqElements + 1;
//        System.out.println(numberOfUniqElements);

        int startingValueOfRemovingDuplication = 0;

        int[] arraySortedWithoutDuplication = new int[numberOfUniqElements];

        for (int i = 0; i < arraySortedWithoutDuplication.length ; i++) {
            for (int j = startingValueOfRemovingDuplication; j < lengthOfArraySortAndRemoveDuplication; j++) {

                startingValueOfRemovingDuplication += 1;

                if (arraySortAndRemoveDuplication[j] != arraySortAndRemoveDuplication[j + 1]) {
                    arraySortedWithoutDuplication[i] = arraySortAndRemoveDuplication[j];
                    break;
                }
            }
        }
        arraySortedWithoutDuplication[(arraySortedWithoutDuplication.length-1)] = arraySortAndRemoveDuplication[(lengthOfArraySortAndRemoveDuplication)];
        for (int i = 0; i < arraySortedWithoutDuplication.length; i++) {
            System.out.println("Without Duplication [" + i + "]: " + arraySortedWithoutDuplication[i]);
        }
    }
}

