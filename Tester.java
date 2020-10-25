import java.util.Arrays;

public class Tester {

    public static void print(Object obj) {
        if (obj.getClass() == int[].class) {
            System.out.println(Arrays.toString((int[])obj));
        } else {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        // these are not thorough tests, just to make sure it's running
        // and we're not getting any crazy results
        int[] test1DArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        print(ArrayOps.sum(test1DArr)); // 55
        print(ArrayOps.largest(test1DArr)); // 10

        int[][] test2DArr = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        print(ArrayOps.sumRows(test2DArr)); // [3, 12, 21]
        print(ArrayOps.largestInRows(test2DArr)); // [2, 5, 8]
        print(ArrayOps.sum(test2DArr)); // 36

        // test code from #live-instruction
        int[][]  A  =  {  {  1,  0, 12, -1 },
                          {  7, -2,  2,  1 },
                          { -5, -2,  2, -9 }
                       };
        int[]  B  =  {  1, 3, 5 };

        print(ArrayOps.sumRows(A));
        /* expected output:
         * [12, 8, -14]
         */
        print(ArrayOps.largestInRows(A));
        /* expected output:
        /* [12, 7, 2]
         */

         // part 5
         // helper method sumCol
         print(ArrayOps.sumCol(test2DArr, 0)); // 9
         print(ArrayOps.sumCol(test2DArr, 1)); // 12
         print(ArrayOps.sumCol(test2DArr, 2)); // 15

         print(ArrayOps.sumCols(test2DArr)); // [9, 12, 15]

         // helper method allEqual
         print(ArrayOps.allEqual(new int[] {}));  // true
         print(ArrayOps.allEqual(new int[] {1, 1, 1}));  // true
         print(ArrayOps.allEqual(new int[] {0, 1, 1}));  // false
         print(ArrayOps.allEqual(new int[] {1, 0, 1}));  // false
         print(ArrayOps.allEqual(new int[] {1, 1, 0}));  // false
    }

}
