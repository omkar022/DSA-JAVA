package hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        System.out.println(union(arr1,arr2));
        System.out.println(intersection(arr1,arr2));
    }

    private static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer>arr=new ArrayList<>();
        HashSet<Integer>hs=new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(hs.contains(arr2[i])){
                arr.add(arr2[i]);
                hs.remove(arr2[i]);
            }

        }
        return arr;

    }

    private static HashSet union(int[] arr1, int[] arr2) {
        HashSet<Integer>hs=new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }
        return hs;
    }


}
