package backtracking;

public class GridWays {
    public static void main(String[] args) {
        int n = 3, m = 3;
        int[][] memo = new int[m][n];
        System.out.println(gridWays(0, 0, n, m, memo));
    }

    private static int gridWays(int i, int j, int n, int m, int[][] memo) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        if (i == n || j == m) {
            return 0;
        }

        if (memo[i][j] != 0) {
            return memo[i][j];
        }
        int ways1 = gridWays(i + 1, j, m, n, memo);
        int ways2 = gridWays(i, j + 1, m, n, memo);

        return memo[i][j] = ways1 + ways2;
    }
}
