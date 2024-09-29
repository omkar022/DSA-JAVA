package bitmanipulation;

public class SetithBit {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(5));
        System.out.println(setithBit(5, 1));
    }

    private static int setithBit(int n, int i) {
        if ((n | (1 << i)) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
