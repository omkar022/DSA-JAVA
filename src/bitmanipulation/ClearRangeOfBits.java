package bitmanipulation;

public class ClearRangeOfBits {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(10));
        System.out.println(clearRangeOfBits(10, 2, 4));
        System.out.println(Integer.toBinaryString(clearRangeOfBits(10, 2, 4)));

    }

    private static int clearRangeOfBits(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        return n & (a | b);
    }
}