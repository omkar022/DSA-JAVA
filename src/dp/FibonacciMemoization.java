package dp;

public class FibonacciMemoization {

    public static int fib(int n, int[] f) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (f[n] != 0) {
            return f[n];
        }
        f[n] = fib(n - 1, f) + fib(n - 2, f);
        return f[n];
    }

    public static void main(String[] args) {
        int n = 6;
        int[] f = new int[n + 1];
        for (int j : f) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(fib(n, f));
        for (int j : f) {
            System.out.print(j + " ");
        }
        System.out.println();

    }

}
