package recursion;

public class XPowN {
    public static void main(String[] args) {
        System.out.println(pow(2, 10));
        System.out.println(pow(2, 10));
    }

    // O(n)
    private static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * pow(x, n - 1);
    }

    // O(logn)
    private int optiPow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPow = optiPow(x, n / 2);
        int halfPowSq = halfPow * halfPow;
        if (n % 2 != 0) {
            halfPowSq = x * halfPowSq;
        }
        return halfPowSq;
    }
}
