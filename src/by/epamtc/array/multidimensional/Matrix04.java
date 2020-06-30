package by.epamtc.array.multidimensional;

public class Matrix04 {

    public static int[][] formMatrixFour(int[] array) {
        int[][] matrix = new int[array.length][array.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) Math.pow(array[j], i + 1);
            }
        }

        return matrix;
    }
}
