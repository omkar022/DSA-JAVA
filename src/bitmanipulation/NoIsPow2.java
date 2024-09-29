package bitmanipulation;

public class NoIsPow2 {
    public static void main(String[] args) {
        int res = 5;
        System.out.println(noIsPow2(res));
    }

    private static boolean noIsPow2(int n) {
        return (n & (n - 1)) == 0;
    }
}
