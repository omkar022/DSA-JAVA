package dp;

import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        System.out.println(ways(n, memo));
        for (int i = 0; i < memo.length; i++) {
            System.out.print(memo[i] + " ");
        }
        System.out.println();

    }

    private static int ways(int n, int[] memo) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        memo[n] = ways(n - 1, memo) + ways(n - 2, memo);
        return memo[n];
    }
}
