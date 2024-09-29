package recursion;

public class Print1ToN {
    public static void main(String[] args) {
        print1ToN(1);
    }

    private static void print1ToN(int n) {
        if (n == 10) {
            System.out.print(10 + " ");
            return;
        }
        System.out.print(n + " ");
        print1ToN(n + 1);
    }
}
