package backtracking;

public class BTArrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        btArrayChange(arr, 0, 1);
        print(arr);

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void btArrayChange(int[] arr, int i, int val) {
        if (arr.length == i) {
            print(arr);
            return;
        }
        arr[i] = val;
        btArrayChange(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }
}

