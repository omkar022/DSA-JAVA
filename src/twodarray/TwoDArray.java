package twodarray;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int n = 3, m = 3;
        int[][] matrix = new int[n][m];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(search(matrix, 1));
    }

    public static boolean search(int[][] matrix, int key) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }
}
