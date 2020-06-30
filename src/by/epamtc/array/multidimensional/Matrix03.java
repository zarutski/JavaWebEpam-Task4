package by.epamtc.array.multidimensional;

public class Matrix03 {

    public static int[][] formMatrixThree(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            int indent = i + 1;

            if (i < n / 2) {
                while (indent <= (n - i)) {
                    matrix[i][n - indent] = 1;
                    indent++;
                }
            } else {
                while (indent >= (n - i)) {
                    matrix[i][n - indent] = 1;
                    indent--;
                }
            }
        }

        return matrix;
    }
}
