package dp;

public class MinimumPartition {
    public static void main(String[] args) {
        int[] number = {1, 6, 11, 5};

        System.out.println(minDifference(number));
    }

    private static int minDifference(int[] number) {
        int n = number.length;
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        int W = sum / 2;

        int[][] dp = new int[n + 1][W + 1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (number[i - 1] <= j) {
                    dp[i][j] = Math.max(number[i - 1] + dp[i - 1][j - number[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        int sum1 = dp[n][W];
        int sum2 = sum - sum1;
        return Math.abs(sum1 - sum2);

    }
}
