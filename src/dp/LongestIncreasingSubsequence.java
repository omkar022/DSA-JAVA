package dp;

import java.util.HashSet;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
//      int[] arr1 = {50, 3, 10, 7, 40, 80};
        int[] arr1 = {7, 7, 7, 7, 7, 7, 7};
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        int[] arr2 = new int[hs.size()];
        int i = 0;
        for (int set : hs) {
            arr2[i] = set;
            i++;
        }


        System.out.println();
        System.out.println(lis(arr1, arr2));
    }

    private static int lis(int[] arr1, int[] arr2) {

        int m = arr1.length;
        int n = arr2.length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {

                if (arr1[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
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
        System.out.println();

        return dp[m][n];
    }
}
