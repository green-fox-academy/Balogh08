package matrixpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixPractice {
    //    ### Exercise 1
//            - Write a method which takes two matrices as parameters and returns a new matrix.
//- The method should compare each element in the input matrices and fill the
//    returned matrix with the greater values.
//            - You only have to deal with square matrices. A square matrix is a matrix with the
//    same number of rows and columns.
//            - Write 2 different test cases for the method.
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 1, 1,}, {1, 1, 1,}, {1, 1, 1,}};
        int[][] matrix2 = {{1, 2, 1,}, {0, 2, 0,}, {1, 2, 1,}};
        int[][] matrix3 = {{1, 2, 1,5}, {0, 2, 0, 3}, {1, 2, 1, 9}, {5, 6, 5, 6}};
        int[][] matrix4 = {{1, 2, 1, 100}, {0, 2, 0, 2}, {1, 2, 1, 9}, {6, 5, 6, 5}};


        int[][] commonMatrix = compareMatrix(matrix1, matrix2);
        Arrays.stream(commonMatrix)
                .forEach(row -> System.out.println(Arrays.toString(row)));

        System.out.println();

        int[][] secondCommonMatrix = compareMatrix(matrix3, matrix4);
        Arrays.stream(secondCommonMatrix).forEach(row -> System.out.println(Arrays.toString(row)));
    }

    public static int[][] compareMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] commonMatrix = new int[firstMatrix.length][firstMatrix.length];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix.length; j++) {
                if (firstMatrix[i][j] >= secondMatrix[i][j]) {
                    commonMatrix[i][j] = firstMatrix[i][j];
                } else {
                    commonMatrix[i][j] = secondMatrix[i][j];
                }
            }
        }
        return commonMatrix;
    }
}
