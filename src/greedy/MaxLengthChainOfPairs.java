package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainOfPairs {
    public static void main(String[] args) {
        int[][] pairs = {{1, 2}, {2, 3}, {3, 4}};
        System.out.println(maxLength(pairs));
    }

    private static int maxLength(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));
        int max = 1;
        int last = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > last) {
                max++;
                last = pairs[i][1];
            }
        }
        return max;
    }
}
