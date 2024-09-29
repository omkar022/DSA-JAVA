package bitmanipulation;

public class ClearLastithBit {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(10));
        System.out.println(clearLastithBit(10, 2));
        System.out.println(Integer.toBinaryString(clearLastithBit(10, 2)));

    }

    private static int clearLastithBit(int n, int i) {
        return n & ((-1 << i));
    }
}
