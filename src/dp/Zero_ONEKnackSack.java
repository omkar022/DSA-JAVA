package dp;

public class Zero_ONEKnackSack {
    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int W = 7;
        int[][] dp = new int[val.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }

        }
        System.out.println(maxProfitMemo(val, wt, W, val.length, dp));
        System.out.println(maxprofitTabu(val,wt,W));

    }

    private static int maxProfitMemo(int[] val, int[] wt, int w, int idx, int[][] dp) {

        if (w == 0 || idx == 0) {
            return 0;
        }
        if (dp[idx][w] != -1) {
            return dp[idx][w];
        }

        if (wt[idx - 1] <= w) {
            int ans1 = val[idx - 1] + maxProfitMemo(val, wt, w - wt[idx - 1], idx - 1, dp);
            int ans2 = maxProfitMemo(val, wt, w, idx - 1, dp);
            dp[idx][w] = Math.max(ans1, ans2);
        } else {
            dp[idx][w] = maxProfitMemo(val, wt, w, idx - 1, dp);

        }
        return dp[idx][w];


    }

    public static int maxprofitTabu(int[] val, int[] wt, int W) {
        int n = val.length;
        int[][] dp = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v=val[i-1];
                int w=wt[i-1];
                if (w <= j) {
                    int inclProfit = v + dp[i - 1][j-w];
                    int exclProfit = dp[i - 1][j];
                    dp[i][j]= Math.max(inclProfit,exclProfit);
                } else {
                    dp[i][j] = dp[i - 1][j];

                }
            }
        }

        return dp[n][W];
    }


}
