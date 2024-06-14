package dp;

public class WildcardMatching {
    public static void main(String[] args) {
        String str1 = "aa";
        String str2 = "*";
        System.out.println(matchingChar(str1, str2));
    }

    private static boolean matchingChar(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int j = 1; j < n + 1; j++) {
            if (str2.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if ((str1.charAt(i - 1) == str2.charAt(j - 1)) || (str2.charAt(j - 1) == '?')) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else if(str2.charAt(j-1)=='*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                }else{
                    dp[i][j]=false;
                }
            }
        }

        return dp[m][n];
    }
}
