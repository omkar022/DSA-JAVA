package recursion;

public class Tiling {
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }

    private static int tiling(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return tiling(n - 1) + tiling(n - 2);
    }
}
