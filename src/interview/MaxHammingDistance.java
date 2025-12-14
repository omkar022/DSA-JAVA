package interview;

import java.util.Arrays;

public class MaxHammingDistance {

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 1};
        System.out.println(maxHammingDistance(arr1)); // Output: 2

        int[] arr2 = {2, 4, 8, 0};
        System.out.println(maxHammingDistance(arr2)); // Output: 4
    }

    private static int maxHammingDistance(int[] arr) {
        int n=arr.length;
        int concat[]=new int[2*n];
        for (int i = 0; i < n; i++) {
            concat[i]=arr[i];
            concat[i+n]=arr[i];
        }
        int max=0;
        for (int shift = 1; shift <n ; shift++) {
            int ham=0;
            for (int i = 0; i < n; i++) {
                if(arr[i]!=concat[shift+i]){
                    ham++;
                }
                max=Math.max(ham,max);
            }
        }
        return max;
    }

//    private static int maxHammingDistance(int[] arr) {
//        int n=arr.length;
//        int concat[]=new int[2*n];
//        for (int i = 0; i < n; i++) {
//            concat[i]=arr[i];
//            concat[i+n]=arr[i];
//        }
//        int max=0;
//        for (int shift = 1; shift < n; shift++) {
//            int ham=0;
//            for (int i = 0; i < n; i++) {
//                if(arr[i]!=concat[i+shift]){
//                    ham++;
//                }
//                max=Math.max(max,ham);
//            }
//        }
//        return max;
//    }

//    private static int maxHammingDistance(int[] arr) {
//        int n=arr.length;
//        int max=0;
//        int concat[]=new int[2*n];
//        for (int i = 0; i < n; i++) {
//            concat[i]=arr[i];
//            concat[i+n]=arr[i];
//        }
//        for (int shift = 1; shift <n ; shift++) {
//            int ham=0;
//            for (int i = 0; i < n; i++) {
//                if(arr[i]!=concat[i+shift]){
//                    ham++;
//                }
//            }
//            max=Math.max(max,ham);
//        }
//        return max;
//    }

//    private static int maxHammingDistance(int[] arr) {
//        int n= arr.length;
//        int []concat=new int[2*n];
//        for(int i=0;i<n;i++){
//            concat[i]=arr[i];
//            concat[i+n]=arr[i];
//        }
//        int max=0;
//        for (int shift = 1; shift <n ; shift++) {
//            int ham=0;
//            for (int i = 0; i < n; i++) {
//                if (arr[i]!=concat[i+shift]){
//                    ham++;
//                }
//
//            }
//            max=Math.max(max,ham);
//            if(max==n){
//                return max;
//            }
//
//        }
//        return max;
//    }

//    public static int maxHammingDistance(int[] arr) {
//        int n = arr.length;
//        int[] concatenated = new int[2 * n];
//
//        // Concatenate the array with itself
//        for (int i = 0; i < n; i++) {
//            concatenated[i] = arr[i];
//            concatenated[i + n] = arr[i];
//        }
//
//        System.out.println(Arrays.toString(concatenated));
//
//        int maxHamming = 0;
//
//        // Slide a window of size N and calculate Hamming distance
//        for (int shift = 1; shift < n; shift++) {
//            int hammingDistance = 0;
//            for (int i = 0; i < n; i++) {
//                if (arr[i] != concatenated[i + shift]) {
//                    hammingDistance++;
//                }
//            }
//            maxHamming = Math.max(maxHamming, hammingDistance);
//
//            // Maximum Hamming distance is N; exit early if reached
//            if (maxHamming == n) {
//                return maxHamming;
//            }
//        }
//
//        return maxHamming;
//    }
}
