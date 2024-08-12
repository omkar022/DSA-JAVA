package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberOfCoins {
    public static void main(String[] args) {
        Integer[] denominations = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        Arrays.sort(denominations, Comparator.reverseOrder());
        System.out.println(min(denominations, 43));
    }

    private static ArrayList<Integer> min(Integer[] denominations, int amount) {
        int min = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for (int denomination : denominations) {
            while (amount >= denomination) {
                amount -= denomination;
                min++;
                res.add(denomination);
            }
        }
        System.out.println(min);
        return res;

    }
}
