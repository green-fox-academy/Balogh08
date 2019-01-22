import java.util.Arrays;
import java.util.HashMap;

public class HeWillNever {
    public static void main(String[] args) {
        String out = "";
        int[] notSoCrypticMessage = {1, 12, 1, 2, 11, 1, 7, 11, 1, 49, 1, 3, 11, 1, 50, 11};

        HashMap<Integer, String> map = new HashMap<>();

        map.put(7, "run around and desert you");
        map.put(50, "tell a lie and hurt you");
        map.put(49, "make you cry, ");
        map.put(2, "let you down");
        map.put(12, "give you up, ");
        map.put(1, "Never gonna ");
        map.put(11, "\n");
        map.put(3, "say goodbye ");

        Object[] ascendingKeys = map.keySet().toArray();
        Arrays.sort(ascendingKeys);

        /*for (int i = 0; i < ascendingKeys.length; i++) {
            System.out.println(ascendingKeys[i]);
        }*/

        for (Object key : ascendingKeys) {
            System.out.println(map.get(key));
        }

        System.out.println("-----------------------------");
        /*============SECOND SOLUTION============*/

        Arrays.sort(notSoCrypticMessage);

        int numberOfUniqElements = 0;
        for (int i = 0; i < notSoCrypticMessage.length - 1; i++) {
            if (notSoCrypticMessage[i] != notSoCrypticMessage[i + 1]){
                numberOfUniqElements = numberOfUniqElements + 1;
            }
        }
        numberOfUniqElements = numberOfUniqElements + 1;
        System.out.println(numberOfUniqElements);

        int[] withoutDuplication = new int[numberOfUniqElements];

        int j = 0;
        for (int i = 0; i < withoutDuplication.length; i++) {
            for (j = j; j < notSoCrypticMessage.length - 1; j++){
                if(notSoCrypticMessage[j] != notSoCrypticMessage[j + 1]){
                    withoutDuplication[i] = notSoCrypticMessage[j];
                    j = j +1;
                    break;
                }
            }
        }

        for (int key : withoutDuplication){
            System.out.println(map.get(key));
        }
    }
}
