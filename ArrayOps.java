public class ArrayOps {

    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    public static int largest(int[] arr) {
        int result = Integer.MIN_VALUE;
        for (int num : arr) {
            result = Math.max(result, num);
        }
        return result;
    }

    public static int[] sumRows(int[][] matrix) {
        int[] output = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            output[i] = sum(matrix[i]);
        }
        return output;
    }
}
