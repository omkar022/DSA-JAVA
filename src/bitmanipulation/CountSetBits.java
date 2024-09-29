package bitmanipulation;

public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(5));
        System.out.println(setithBit(5));
    }

    private static int setithBit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

}
