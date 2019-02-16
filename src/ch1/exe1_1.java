import edu.princeton.cs.algs4.StdOut;

public class exe1_1 {
    public static void main(String[] args) {
        // 1.1.1~1.1.2
        StdOut.println((0 + 15) / 2);
        StdOut.println(2.0e-6 * 100000000.1);
        StdOut.println();
        StdOut.println(true && false || true && true);
        StdOut.println((1 + 2.236) / 2);
        StdOut.println(1 + 2 + 3 + 4.0);
        StdOut.println(4.1 >= 4);
        StdOut.println(1 + 2 + "3");
        // 1.1.3
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a == b && b == c) StdOut.println("equal");
        else StdOut.println("not equal");

        // 1.1.8
        System.out.println((char) ('a' + 4));
    }
}
