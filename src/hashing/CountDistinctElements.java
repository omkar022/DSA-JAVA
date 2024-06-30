package hashing;

import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        int num[]={4,3,2,5,6,7,3,4,2,1};
        System.out.println(distinctCount(num));
    }

    private static int distinctCount(int[] num) {
        HashSet<Integer>s=new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            s.add(num[i]);
        }
        return s.size();
    }
}
