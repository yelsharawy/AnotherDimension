public class ArrayOps {

    public static boolean allEqual(int[] arr) {
        if (arr.length == 0) return true;

        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != first) {
                return false;
            }
        }
        return true;
    }


    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    public static int sum(int[][] matrix) {
        int total = 0;
        for (int[] row : matrix) {
            total += sum(row);
        }
        return total;
    }

    public static int[] sumRows(int[][] matrix) {
        int[] output = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            output[i] = sum(matrix[i]);
        }
        return output;
    }

    public static int sumCol(int[][] matrix, int col) {
        int total = 0;
        for (int r = 0; r < matrix.length; r++) {
            total += matrix[r][col];
        }
        return total;
    }

    public static int[] sumCols(int[][] matrix) {
        int cols = matrix[0].length;
        int[] output = new int[cols];
        for (int c = 0; c < cols; c++) {
            output[c] = sumCol(matrix, c);
        }
        return output;
    }


    public static boolean isRowMagic(int[][] matrix) {
        return allEqual(sumRows(matrix));
    }

    public static boolean isColMagic(int[][] matrix) {
        return allEqual(sumCols(matrix));
    }

    public static boolean isLocationMagic(int[][] matrix, int row, int col) {
        return sum(matrix[row]) == sumCol(matrix, col);
    }



    public static int largest(int[] arr) {
        int result = Integer.MIN_VALUE;
        for (int num : arr) {
            result = Math.max(result, num);
        }
        return result;
    }

    public static int[] largestInRows(int[][] matrix) {
        int[] output = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            output[i] = largest(matrix[i]);
        }
        return output;
    }
}
