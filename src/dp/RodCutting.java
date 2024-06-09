package dp;

public class RodCutting {
    public static void main(String[] args) {

        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        int[] length = {1, 2, 3, 4, 5, 6, 7, 8};
        int rodLength = 8;
        System.out.println(maxProfit(price, length, rodLength));
    }

    private static int maxProfit(int[] price, int[] length, int rodLength) {
        int[][] dp = new int[price.length + 1][rodLength + 1];
        for (int i = 1; i < price.length + 1; i++) {
            for (int j = 1; j < rodLength + 1; j++) {
                if (length[i - 1] <= j) {
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - length[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        for (int[] f : dp) {
            for (int s : f) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        return dp[length.length][rodLength];
    }
}
