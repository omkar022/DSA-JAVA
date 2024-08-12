package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Chocola {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer[] costVer = {2, 1, 3, 1, 4};
        Integer[] costHor = {4, 1, 2};
        System.out.println(maxCut(n, m, costHor, costVer));

    }

    private static int maxCut(int n, int m, Integer[] costHor, Integer[] costVer) {
        int v = 0, h = 0;
        int vp = 1, hp = 1;
        int finalCost = 0;

        Arrays.sort(costVer, Comparator.reverseOrder());
        Arrays.sort(costHor, Comparator.reverseOrder());

        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] <= costHor[h]) {
                finalCost += (costHor[h] * vp);
                hp++;
                h++;

            } else {
                finalCost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < costHor.length) {
            finalCost += (costHor[h] * vp);
            hp++;
            h++;
        }
        while (v < costVer.length) {
            finalCost += (costVer[v] * hp);
            vp++;
            v++;
        }

        return finalCost;
    }

}
