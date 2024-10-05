package array;

public class TrapRainWater {
    public static void main(String[] args) {
        int[] arr = {3, 0, 0, 2, 0, 4};
        System.out.println(trapWater(arr));
    }

    private static int trapWater(int[] arr) {
        int n = arr.length;

        int[] height = new int[n];
        int ans = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        if (n == 0)
            return 0;
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(arr[i], left[i - 1]);
        }
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i + 1]);
        }
        for (int i = 0; i < n; i++) {
            height[i] = Math.min(left[i], right[i]);
        }
        for (int i = 0; i < n; i++) {
            ans += (height[i] - arr[i]);
        }

        return ans;
    }
}
