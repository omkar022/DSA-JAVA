package bitmanipulation;

public class ClearithBit {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(10));
        System.out.println(clearithBit(10, 1));
        System.out.println(Integer.toBinaryString(clearithBit(10, 1)));

    }

    private static int clearithBit(int n, int i) {
        return n & (~(1 << i));
    }
}
