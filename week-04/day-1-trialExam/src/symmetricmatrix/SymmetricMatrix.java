package symmetricmatrix;


import java.util.ArrayList;
import java.util.Arrays;

public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] myMatrix = new int[3][3];
        myMatrix[0][0] = 0;
        myMatrix[0][1] = 1;
        myMatrix[0][2] = 2;
        myMatrix[1][0] = 1;
        myMatrix[1][1] = 4;
        myMatrix[1][2] = 3;
        myMatrix[2][0] = 2;
        myMatrix[2][1] = 3;
        myMatrix[2][2] = 4;

        System.out.println(Arrays.toString(myMatrix[0]));
        System.out.println(Arrays.toString(myMatrix[1]));
        System.out.println(Arrays.toString(myMatrix[2]));

        System.out.println(isSymmetric(myMatrix));;

    }

    public static boolean isSymmetric(int[][] nameOfMatrix) {

        for (int i = 0; i < nameOfMatrix.length; i++) {
            for (int j = 0; j < nameOfMatrix.length; j++) {
                if (nameOfMatrix[i][j] != nameOfMatrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
