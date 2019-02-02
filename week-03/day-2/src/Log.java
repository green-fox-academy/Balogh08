
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.sort;

public class Log {
    public static void main(String[] args) {
        Path filePathOfIp = Paths.get("logs.txt");

        getUniqueIPsAndPostGetRatio(filePathOfIp);
    }


public static void getUniqueIPsAndPostGetRatio(Path sourceFile){

        List<String> arrayFromGetValues = new ArrayList<>();

    try {
            arrayFromGetValues.addAll(Files.readAllLines(sourceFile));
        }catch ( Exception ex){
            System.err.println("Oh, nooo! Something went wrong!");
        }

        String[] arrayToStoreInitializedValues = arrayFromGetValues.toArray(new String[0]);

        String[] arrayUniqueIP = new String[arrayFromGetValues.size()];
        String[] arrayPostGet = new String[arrayFromGetValues.size()];
        String[] splitArray = new String[arrayFromGetValues.size()];

        for (int i = 0; i < arrayFromGetValues.size() ; i++) {
            splitMethod(arrayToStoreInitializedValues, splitArray, arrayUniqueIP, arrayPostGet, i);
        }

        double amountOfGet = 0;
        double amountOfPost = 0;

        for (int i = 0; i < arrayPostGet.length; i++) {
            if (arrayPostGet[i].equals("POST /")){
                amountOfGet += 1;
            }
            else{
                amountOfPost += 1;
            }
        }


        sort(arrayUniqueIP);
        ArrayList<String> uniqueIPsArrayList = new ArrayList<>();

        for (int i = 0; i < arrayUniqueIP.length; i++) {

            try{if(!arrayUniqueIP[i].equals(arrayUniqueIP[i + 1])){
                uniqueIPsArrayList.add(arrayUniqueIP[i]);
            }}catch (ArrayIndexOutOfBoundsException ex){
                uniqueIPsArrayList.add(arrayUniqueIP[i]);
            }

        }

        for (int i = 0; i < uniqueIPsArrayList.size(); i++) {
            System.out.println(uniqueIPsArrayList.get(i));
        }

        double ratioOfPostGet = amountOfPost / amountOfGet;
        double ratioOfGetPost = amountOfGet / amountOfPost;
        System.out.println("Post / Get = " + ratioOfPostGet);
        System.out.println("Get / Post = " + ratioOfGetPost);
    }

    public static void splitMethod(String[] arrayListWhichValuesWillBeSplited, String[] arrayToStoreValues, String[] uniqueIP, String[] arrayPostGet, int index){

        arrayToStoreValues = arrayListWhichValuesWillBeSplited[index].split("  ");
        uniqueIP[index] = arrayToStoreValues[2].trim();
        arrayPostGet[index] = arrayToStoreValues[3].trim();
    }
}
