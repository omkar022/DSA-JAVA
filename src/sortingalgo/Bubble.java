package sortingalgo;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] nums = {5, 4, 1, 3, 2};
        System.out.println(Arrays.toString(bubble(nums)));
    }

    private static int[] bubble(int[] nums) {
        boolean swaps;

        for (int i = 0; i < nums.length - 1; i++) {
            swaps = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swaps = true;
                }
            }
            if (!swaps) {
                break;
            }
        }

        return nums;
    }
}
