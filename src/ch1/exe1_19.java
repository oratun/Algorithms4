package ch1;

import edu.princeton.cs.algs4.StdOut;

public class exe1_19 {
    // Fibonacci
    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    public static long Fib(int N) {
        long[] f = new long[N + 1];
        return Fib(N, f);
    }

    public static long Fib(int N, long[] f) {
        if (f[N] == 0) {
            if (N == 1) {
                f[N] = 1;
            } else if (N > 1) {
                f[N] = Fib(N - 1, f) + Fib(N - 2, f);
            }
        }
        return f[N];
    }

    public static void main(String[] args) {
        for (int N = 0; N < 10; N++)
            StdOut.println(N + " " + Fib(N));
    }
}

