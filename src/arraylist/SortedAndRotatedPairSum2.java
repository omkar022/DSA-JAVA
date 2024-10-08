package arraylist;

import java.util.ArrayList;

public class SortedAndRotatedPairSum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(twoSum(list, 16));
    }

    private static ArrayList<Integer> twoSum(ArrayList<Integer> list, int target) {
        int pivot = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }
        int lp = pivot + 1;
        int rp = pivot;


        ArrayList<Integer> ans = new ArrayList<>();
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                ans.add(lp);
                ans.add(rp);
                return ans;
            }
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % list.size();
            } else {
                rp = (rp - 1 + list.size()) % list.size();
            }
        }
        ans.add(-1);
        ans.add(-1);
        return ans;
    }
}
