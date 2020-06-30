package by.epamtc.array.multidimensional;

public class Matrix05 {

    public static int[][] matrixProduct(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int rowsB = matrixB.length;
        int columnsA = matrixA[0].length;
        int columnsB = matrixB[0].length;

        int[][] product = new int[rowsA][columnsB];
        if (columnsA != rowsB) {
            return product;
        }

        for (int i = 0; i < rowsA; ++i) {
            for (int j = 0; j < columnsB; ++j) {
                for (int k = 0; k < columnsA; ++k) {
                    product[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return product;
    }
}
