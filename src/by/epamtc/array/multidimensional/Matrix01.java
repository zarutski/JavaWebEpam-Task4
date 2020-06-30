package by.epamtc.array.multidimensional;

public class Matrix01 {

    public static int[][] formMatrixOne(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            int evenRowValue = 1;
            int oddRowValue = n;

            for (int j = 0; j < n; j++) {
                if (i % 2 == 1) {
                    matrix[i][j] = oddRowValue--;
                } else {
                    matrix[i][j] = evenRowValue++;
                }
            }
        }
        return matrix;
    }
}