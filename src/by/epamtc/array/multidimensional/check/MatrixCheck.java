package by.epamtc.array.multidimensional.check;

import by.epamtc.array.multidimensional.*;

import java.util.Arrays;

public class MatrixCheck {

    public static void main(String[] args) {

        int[][] matrixOne = Matrix01.formMatrixOne(4);
        int[][] matrixTwo = Matrix02.formMatrixTwo(4);
        int[][] matrixThree = Matrix03.formMatrixThree(8);
        int[][] matrixFour = Matrix04.formMatrixFour(new int[]{4, 3, 2, 12});

        int[][] matrixA = new int[][]{{1, 2, 3, 4}, {4, 3, 2, 1}};
        int[][] matrixB = new int[][]{{2, 1, 3}, {1, 4, 1}, {5, 1, 6}, {1, 7, 1}};
        int[][] product = Matrix05.matrixProduct(matrixA, matrixB);

        printMatrix(matrixOne);
        printMatrix(matrixTwo);
        printMatrix(matrixThree);
        printMatrix(matrixFour);
        printMatrix(product);

        Matrix06.formMagicSquares(3);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println();
    }
}
