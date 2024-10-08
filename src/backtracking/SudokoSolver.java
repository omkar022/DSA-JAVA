package backtracking;

public class SudokoSolver {
    public static void main(String[] args) {
        int[][] grid = {{0, 0, 8, 0, 0, 0, 0, 0, 0},
                {4, 9, 0, 1, 5, 7, 0, 0, 2},
                {0, 0, 3, 0, 0, 4, 1, 9, 0},
                {1, 8, 5, 0, 6, 0, 0, 2, 0},
                {0, 0, 0, 0, 2, 0, 0, 6, 0},
                {9, 6, 0, 4, 0, 5, 3, 0, 0},
                {0, 3, 0, 0, 7, 2, 0, 0, 4},
                {0, 4, 9, 0, 3, 0, 0, 5, 7},
                {8, 2, 7, 0, 0, 9, 0, 1, 3}};
        if (sudokuSolver(grid, 0, 0)) {
            printSudoku(grid);
        } else {
            System.out.println("No Solution");
        }

    }

    private static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean sudokuSolver(int[][] sudoku, int row, int col) {
        if (row == sudoku.length) {
            return true;
        }
        if (col == sudoku[0].length) {
            return sudokuSolver(sudoku, row + 1, col);
        }
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, row, col + 1);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, row, col + 1)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }

        }
        return false;
    }

    private static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        for (int i = 0; i < sudoku.length; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        for (int j = 0; j < sudoku.length; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }
}
