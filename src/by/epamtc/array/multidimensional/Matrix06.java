package by.epamtc.array.multidimensional;

public class Matrix06 {

    public static void formMagicSquares(int n) {
        int[] arr = initializeMatrix(n);
        int elementsCount = arr.length;

        while (true) {
            int j = elementsCount - 2;
            while ((j != -1) && (arr[j] >= arr[j + 1])) {
                j--;
            }
            if (j == -1) {
                break;
            }

            int k = elementsCount - 1;
            while (arr[j] >= arr[k]) {
                k--;
            }
            swap(arr, j, k);

            int left = j + 1;
            int right = elementsCount - 1;
            while (left < right) {
                swap(arr, left++, right--);
            }

            if (isMagic(arr)) {
                printMagic(arr);
            }
        }
    }

    private static int[] initializeMatrix(int n) {
        int[] matrix = new int[n * n];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = i + 1;
        }
        return matrix;
    }

    private static void swap(int[] a, int i, int j) {
        int s = a[i];
        a[i] = a[j];
        a[j] = s;
    }

    private static boolean isMagic(int[] square) {

        int n = (int) Math.sqrt(square.length);
        int magicConst = (int) (n * (Math.pow(n, 2) + 1) / 2);

        for (int i = 0; i < n; i++) {
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                colSum += square[(n * j) + i];
            }
            if (colSum != magicConst) {
                return false;
            }
        }

        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        int leftDirect = 0;
        int rightDirect = n - 1;

        for (int i = 0; i < square.length; i += n) {

            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += square[i + j];
            }
            if (rowSum != magicConst) {
                return false;
            }

            leftDiagonalSum += square[i + leftDirect];
            leftDirect++;

            rightDiagonalSum += square[i + rightDirect];
            rightDirect--;

        }
        if (leftDiagonalSum != magicConst) {
            return false;
        }
        return rightDiagonalSum == magicConst;
    }

    private static void printMagic(int[] square) {
        int n = (int) Math.sqrt(square.length);

        for (int i = 0; i < square.length; i += n) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%04d ", square[i + j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}