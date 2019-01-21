import java.util.Arrays;
public class Unique {
    public static void main(String[] args) {
        int[] parameters = {1,11,34,11,52,61,1,34,11,11,11};
        Arrays.sort(parameters);
        for (int i = 0; i < parameters.length-1; i++) {
            System.out.println(parameters[i]);
        }

        int numberOfUniqElements = 0;
        for (int i = 0; i < parameters.length - 1; i++) {
            if (parameters[i] != parameters[i + 1]){
                numberOfUniqElements = numberOfUniqElements + 1;
            }
        }
        numberOfUniqElements = numberOfUniqElements + 1;
        System.out.println(numberOfUniqElements);
        int j = 0;
        int[] withoutDuplication = new int[numberOfUniqElements];
        for (int i = 0; i < withoutDuplication.length ; i++) {
            for (j = j; j < parameters.length - 1; j++) {
                if (parameters[j] != parameters[j + 1]) {
                    withoutDuplication[i] = parameters[j];
                    j = j +1;
                    break;
                }
            }
        }
        withoutDuplication[(withoutDuplication.length-1)] = parameters[(parameters.length-1)];
        for (int i = 0; i < withoutDuplication.length; i++) {
            System.out.println("Without Duplication [" + i + "]: " + withoutDuplication[i]);
        }
    }
}
