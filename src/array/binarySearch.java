package array;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8, 10};
        int key = 10;
        System.out.println(binary(arr, key));
    }

    private static int binary(int[] arr, int key) {
        int si = 0, ei = arr.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return -1;
    }
}
