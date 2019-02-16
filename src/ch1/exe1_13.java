package ch1;

import edu.princeton.cs.algs4.StdOut;

public class exe1_13 {
    // 打印M行N列的二维数组的转置
    private static void printout(int[][] a1) {
        for (int i = 0; i < a1[0].length; i++) {
            for (int j = 0; j < a1.length; j++) {
                StdOut.print(a1[j][i] + " ");
            }
            StdOut.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {4, 5, 6}};
        printout(arr);
    }
}
