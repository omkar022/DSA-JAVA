package dp;

public class Z1Knapp {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 1, 3};
        int targetSum = 10;
        System.out.println(targetSumExists(numbers, targetSum));


    }

    private static boolean targetSumExists(int[] numbers, int sum) {
        int n = numbers.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (numbers[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - numbers[i - 1]] || dp[i - 1][j];


                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }

        }
        print(dp);
        System.out.println();
        return dp[n][sum];
    }

    private static void print(boolean[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }


}
