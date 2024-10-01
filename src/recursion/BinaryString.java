package recursion;

public class BinaryString {
    public static void main(String[] args) {

        binaryStringWithoutConsecutive1s(3, 0, " ");
    }

    private static void binaryStringWithoutConsecutive1s(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        if (lastPlace == 0) {
            binaryStringWithoutConsecutive1s(n - 1, 0, str + "0");
            binaryStringWithoutConsecutive1s(n - 1, 1, str + "1");
        } else {
            binaryStringWithoutConsecutive1s(n - 1, 0, str + "0");
        }

    }

}
