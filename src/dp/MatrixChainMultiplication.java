package dp;

public class MatrixChainMultiplication {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3};
        System.out.println(minCost(arr, 1, arr.length - 1));
        int[][] dp = new int[arr.length][arr.length];
        System.out.println(minCostMemo(arr, 1, arr.length - 1, dp));
        System.out.println(minCostTab(arr));
    }

    private static int minCostTab(int[] arr) {
        int n = arr.length;


        int[][] dp = new int[n][n];

        for (int len = 2; len < n; len++) {
            for (int i = 1; i < n - len + 1; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost1 = dp[i][k];
                    int cost2 = dp[k + 1][j];
                    int cost3 = arr[i - 1] * arr[k] * arr[j];
                    int finalCost = cost1 + cost2 + cost3;
                    dp[i][j] = Math.min(dp[i][j], finalCost);
                }
            }

        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        return dp[1][n - 1];
    }

    private static int minCostMemo(int[] arr, int i, int j, int[][] dp) {
        if (i == j) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        for (int k = i; k < j; k++) {
            int cost1 = minCostMemo(arr, i, k, dp);
            int cost2 = minCostMemo(arr, k + 1, j, dp);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
        }
        return dp[i][j] = ans;
    }

    private static int minCost(int[] arr, int i, int j) {
        if (i == j) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int cost1 = minCost(arr, i, k);
            int cost2 = minCost(arr, k + 1, j);
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finalCost=cost1+cost2+cost3;
            ans=Math.min(ans,finalCost);
        }
        return ans;

    }
}
