package dp;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String str1 = "ABCDE";
        String str2 = "ABGCE";
        System.out.println(lcsTab(str1, str2));
    }

    private static int lcsTab(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];

        int max = 0;
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    max = Math.max(dp[i][j], max);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return max;
    }
}
