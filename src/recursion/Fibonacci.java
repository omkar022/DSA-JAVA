package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 50;
        System.out.println(fibo(n, new long[n + 1]));
    }

    private static long fibo(int n, long[] arr) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (arr[n] != 0) {
            return arr[n];
        }
        arr[n] = fibo(n - 1, arr) + fibo(n - 2, arr);
        return arr[n];
    }
}
