package matrixrotation;

import java.util.Arrays;

public class MatrixRotation {
    public static void main(String[] args) {
        int[][] myMatrix = {{1, 2, 3, 5}, {4, 5, 6, 5}, {7, 8, 9, 5}, {1, 20, 2, 3}};
        int[][]rotatedMatrix = rotateMatrix(myMatrix);

        Arrays.stream(myMatrix)
                .forEach(row -> System.out.println(Arrays.toString(row)));

        System.out.println();

        Arrays.stream(rotatedMatrix)
                .forEach(row -> System.out.println(Arrays.toString(row)));

    }

    public static int[][] rotateMatrix(int[][] matrixToRotate) {
        int[][] rotatedMatrix = new int[matrixToRotate.length][matrixToRotate.length];
        for (int i = 0; i < matrixToRotate.length; i++) {
            for (int j = 0; j < matrixToRotate.length; j++) {
                rotatedMatrix[i][j] = matrixToRotate[matrixToRotate.length - 1 - j][i];
            }
        }
        return rotatedMatrix;
    }
}
