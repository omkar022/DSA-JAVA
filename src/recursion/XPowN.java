package recursion;

public class XPowN {
    public static void main(String[] args) {
        System.out.println(pow(2, 10));
    }

    private static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * pow(x, n - 1);
    }
}
