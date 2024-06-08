package dp;

public class Zero_ONEKnackSack {
    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int W = 7;
        System.out.println(maxProfit(val, wt, W, val.length));
    }

    private static int maxProfit(int[] val, int[] wt, int w, int idx) {

        if (w == 0 || idx == 0) {
            return 0;
        }
        if (wt[idx-1] <= w) {
            int ans1=val[idx-1]+maxProfit(val, wt, w-wt[idx-1], idx - 1);
            int ans2=maxProfit(val, wt, w, idx - 1);
            return Math.max(ans1,ans2);
        } else {
            return maxProfit(val, wt, w, idx - 1);
        }


    }
}
