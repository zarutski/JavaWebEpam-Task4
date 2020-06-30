package by.epamtc.array.multidimensional;

public class Matrix02 {

    public static int[][] formMatrixTwo(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    matrix[i][j] = (i + 1) * (i + 2);
                    continue;
                }
                matrix[i][j] = 0;
            }
        }
        return matrix;
    }
}
