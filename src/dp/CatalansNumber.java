package dp;

public class CatalansNumber {
    public static void main(String[] args) {

        int n = 4;
        int[] dp = new int[n + 1];
        System.out.println(catalan(n, dp));
        System.out.println(catalanTab(n));
    }

    private static int catalanTab(int n) {

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;


        for (int i = 2; i < n + 1; i++) {
            int ans = 0;

            for (int j = 0; j < i; j++) {
                ans += dp[j] * dp[i - j - 1];
            }
            dp[i] = ans;
        }

        return dp[n];
    }

    private static int catalan(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = 0;
        if (dp[n] != 0) {
            return dp[n];
        }
        for (int i = 0; i < n; i++) {
            ans += catalan(i, dp) * catalan(n - i - 1, dp);
        }
        dp[n] = ans;
        return dp[n];
    }
}
