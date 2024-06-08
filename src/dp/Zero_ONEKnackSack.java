package dp;

import java.util.Arrays;

public class Zero_ONEKnackSack {
    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int W = 7;
        int dp[][]=new int[val.length+1][W+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;
            }

        }

        System.out.println(maxProfit(val, wt, W, val.length,dp));
    }

    private static int maxProfit(int[] val, int[] wt, int w, int idx,int dp[][]) {

        if (w == 0 || idx == 0) {
            return 0;
        }
        if(dp[idx][w]!=-1){
            return dp[idx][w];
        }

        if (wt[idx-1] <= w) {
            int ans1=val[idx-1]+maxProfit(val, wt, w-wt[idx-1], idx - 1,dp);
            int ans2=maxProfit(val, wt, w, idx - 1,dp);
            dp[idx][w] =Math.max(ans1,ans2);
            return dp[idx][w];
        } else {
            dp[idx][w] = maxProfit(val, wt, w, idx - 1,dp);
            return dp[idx][w];

        }


    }
}
