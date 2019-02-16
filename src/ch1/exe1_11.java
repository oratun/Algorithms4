package ch1;

import edu.princeton.cs.algs4.StdOut;

import java.util.Locale;

public class exe1_11 {
    public static void prt(boolean a) {
        // 若为真打印星号, 为假打印空格
        if (a)
            StdOut.print("*");
        else
            StdOut.print(" ");
    }

    public static void printArray(boolean[][] a) {
        //  打印二维布尔数组
        for (int i = 0; i < a.length; i++) {
            StdOut.print(i);
            for (int j = 0; j < a[i].length; j++) {

                prt(a[i][j]);
            }
            StdOut.println();
        }
    }

    private static void printout(boolean[][] a1) {
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                if (a1[i][j]) {
                    System.out.println(String.format(Locale.CHINA, "%d  %d *", i + 1, j + 1));
                } else {
                    System.out.println(String.format(Locale.CHINA, "%d  %d /", i + 1, j + 1));
                }
            }
        }
    }

    public static void main(String[] args) {
        boolean[][] arr = {{true, false, true}, {false, true, true}};
//        printArray(arr);
        printout(arr);
    }
}
