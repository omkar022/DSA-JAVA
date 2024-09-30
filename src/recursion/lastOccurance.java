package recursion;

public class lastOccurance {
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(lastOccur(arr, 5, arr.length - 1));
    }

    private static int lastOccur(int[] arr, int key, int i) {
        if (i < 0) {
            return -1;
        }
        if (key == arr[i]) {
            return i;
        }
        return lastOccur(arr, key, i - 1);
    }
}
