package ch1;

import edu.princeton.cs.algs4.StdOut;

public class exe1_15 {
    public static int[] histogram(int[] a, int m) {
        int[] n = new int[m];
        for (int j = 0; j < m; j++) {
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == j)
                    count += 1;
            }
            n[j] = count;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 1, 2};
        int m = 5;
        int[] a = histogram(arr, m);
        for (int i = 0; i < m; i++) {
            StdOut.println(i + " " + a[i]);
        }
    }
}
