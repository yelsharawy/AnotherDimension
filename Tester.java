import java.util.Arrays;

public class Tester {

    public static void main(String[] args) {
        int[] test1DArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(ArrayOps.sum(test1DArr)); // 55
        System.out.println(ArrayOps.largest(test1DArr)); // 10

        int[][] test2DArr = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        System.out.println(Arrays.toString(ArrayOps.sumRows(test2DArr))); // [3, 12, 21]
        
    }

}
