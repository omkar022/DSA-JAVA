package hashing;

import java.util.HashMap;

public class MajorityElements {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        System.out.println(majority(nums));
    }

    private static int majority(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        for (int key : hm.keySet()) {
            if (hm.get(key) > nums.length / 3) {
                return key;
            }
        }

        return -1;
    }
}
