package dp;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        System.out.println(lcs(str1, str2, str1.length(), str2.length()));
        System.out.println(lcsTab(str1, str2));
    }

    private static int lcsTab(String str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 1; i < str1.length() + 1; i++) {
            for (int j = 1; j < str2.length() + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[str1.length()][str2.length()];
    }

    private static int lcs(String str1, String str2, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
            return 1 + lcs(str1, str2, m - 1, n - 1);
        } else {
            return Math.max(lcs(str1, str2, m - 1, n), lcs(str1, str2, m, n - 1));
        }
    }

}
