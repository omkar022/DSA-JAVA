package hashing;

import java.util.HashMap;

public class SubArraySumEqualsToK {
    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        System.out.println(sumEqualKCountSubArray(arr, -10));
    }

    private static int sumEqualKCountSubArray(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int sum = 0;
        int ans = 0;

        hm.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (hm.containsKey(sum - k)) {
                ans += hm.get(sum - k);
            }

            hm.put(sum, hm.getOrDefault(sum, 0) + 1);

        }
        return ans;
    }
}
