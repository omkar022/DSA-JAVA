package bitmanipulation;

public class UpdateithBit {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(10));
        System.out.println(updateithBit(10, 1, 1));
        System.out.println(Integer.toBinaryString(updateithBit(10, 1, 1)));

    }

    private static int updateithBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearithBit(n, i);
        } else {
            return setithBit(n, i);
        }
    }

    private static int clearithBit(int n, int i) {
        return n & (~(1 << i));
    }

    private static int setithBit(int n, int i) {
        return (n | (1 << i));
    }
}
