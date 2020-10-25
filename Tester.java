import java.util.Arrays;

public class Tester {

    public static void main(String[] args) {
        // these are not thorough tests, just to make sure it's running
        // and we're not getting any crazy results
        int[] test1DArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(ArrayOps.sum(test1DArr)); // 55
        System.out.println(ArrayOps.largest(test1DArr)); // 10

        int[][] test2DArr = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        System.out.println(Arrays.toString(ArrayOps.sumRows(test2DArr))); // [3, 12, 21]
        System.out.println(Arrays.toString(ArrayOps.largestInRows(test2DArr))); // [2, 5, 8]
        System.out.println(ArrayOps.sum(test2DArr)); // 36

        // test code from #live-instruction
        int[][]  A  =  {  {  1,  0, 12, -1 },
                          {  7, -2,  2,  1 },
                          { -5, -2,  2, -9 }
                       };
        int[]  B  =  {  1, 3, 5 };

        System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
        /* expected output:
         * [12, 8, -14]
         */
        System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
        /* expected output:
        /* [12, 7, 2]
         */

         // part 5
         // helper method sumCol
         System.out.println(ArrayOps.sumCol(test2DArr, 0)); // 9
         System.out.println(ArrayOps.sumCol(test2DArr, 1)); // 12
         System.out.println(ArrayOps.sumCol(test2DArr, 2)); // 15
    }

}
