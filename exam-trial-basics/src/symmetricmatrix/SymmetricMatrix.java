package symmetricmatrix;


import java.util.Arrays;

public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] firstMatrix = new int[3][3];
        firstMatrix[0][0] = 0;
        firstMatrix[0][1] = 1;
        firstMatrix[0][2] = 2;
        firstMatrix[1][0] = 1;
        firstMatrix[1][1] = 4;
        firstMatrix[1][2] = 3;
        firstMatrix[2][0] = 2;
        firstMatrix[2][1] = 3;
        firstMatrix[2][2] = 4;

        int[][] secondMatrix = new int[3][3];
        secondMatrix[0][0] = 7;
        secondMatrix[0][1] = 7;
        secondMatrix[0][2] = 7;
        secondMatrix[1][0] = 6;
        secondMatrix[1][1] = 5;
        secondMatrix[1][2] = 7;
        secondMatrix[2][0] = 1;
        secondMatrix[2][1] = 2;
        secondMatrix[2][2] = 1;



        System.out.println(Arrays.toString(firstMatrix[0]));
        System.out.println(Arrays.toString(firstMatrix[1]));
        System.out.println(Arrays.toString(firstMatrix[2]));
        System.out.println("Matrix symmetric: " + isSymmetric(firstMatrix));;

        System.out.println(Arrays.toString(secondMatrix[0]));
        System.out.println(Arrays.toString(secondMatrix[1]));
        System.out.println(Arrays.toString(secondMatrix[2]));
        System.out.println("Matrix symmetric: " + isSymmetric(secondMatrix));;

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
