package bitmanipulation;

public class GetithBit {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(5));
        System.out.println(getithBit(5, 1));
    }

    private static int getithBit(int n, int i) {
        if ((n & (1 << i)) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
