package sortingalgo;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] nums = {5, 4, 1, 3, 2};
        System.out.println(Arrays.toString(selection(nums)));

    }

    private static int[] selection(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[smallest] > nums[j]) {
                    smallest = j;
                }
            }
            int temp = nums[smallest];
            nums[smallest] = nums[i];
            nums[i] = temp;

        }
        return nums;
    }
}
