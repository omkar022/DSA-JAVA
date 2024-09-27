package sortingalgo;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] nums = {5, 4, 1, 3, 2};
        System.out.println(Arrays.toString(insertion(nums)));
    }

    private static int[] insertion(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i - 1;
            while (prev >= 0 && nums[prev] > curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            nums[prev + 1] = curr;
        }
        return nums;
    }
}
