package hashing;

import java.util.HashMap;

public class LargestSubArraySum0 {
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10};
        System.out.println(subArrayLength(arr));

    }

    private static int subArrayLength(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int len = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                len = i + 1;
            } else {
                if (hm.containsKey(sum)) {
                    len = Math.max(len, i - hm.get(sum));
                } else {
                    hm.put(sum, i);
                }
            }

        }
        return len;
    }
}
