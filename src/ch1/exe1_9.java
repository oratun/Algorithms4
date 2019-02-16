package ch1;

import edu.princeton.cs.algs4.StdOut;

public class exe1_9 {
    // 十进制转二进制10-> 5 2 1 0   1010
    public static String toBinaryString(int n) {
        String s = "";
        int reminder = n % 2;
        int k = n;
        s = k % 2 + s;
        while (k != 0) {
            k /= 2;
            s = k % 2 + s;
        }
        return s;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String s = toBinaryString(a);
        StdOut.println(s);
    }
}
