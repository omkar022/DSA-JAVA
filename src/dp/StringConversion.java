package dp;

//Convert string1 to string 2 with only insertion & deletion.Print no.of deletions & insertions
public class StringConversion {
    public static void main(String[] args) {
//        String str1 = "pear";
//        String str2 = "sea";
        String str1 = "abcdef";
        String str2 = "aceg";
        System.out.println(lcsTab(str1, str2));
        System.out.println(stringConvert(str1, str2));
    }

    private static int stringConvert(String str1, String str2) {
        int lcsLength = lcsTab(str1, str2);
        int deletion = str1.length() - lcsLength;
        System.out.println(deletion);
        int insertion = str2.length() - lcsLength;
        System.out.println(insertion);

        System.out.println();
        return insertion + deletion;

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

        return dp[str1.length()][str2.length()];
    }


}
