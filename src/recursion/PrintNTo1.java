package recursion;

public class PrintNTo1 {
    public static void main(String[] args) {
        printNTo1(10);
    }

    private static void printNTo1(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        System.out.print(n + " ");
        printNTo1(n - 1);

    }
}
