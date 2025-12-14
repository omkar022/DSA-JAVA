package interview;

public class SubArraySum {


    public static void main(String[] args) {
//        findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);

        findSubArray(new int[]{12, 5, 31, 9, 21, 8,40, 5}, 45);

//        findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);
    }

    private static void findSubArray(int[] arr, int target) {
        int n=arr.length;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum=arr[i];
            for (int j = i+1; j < n; j++) {
                sum=arr[j]+sum;
                if(sum==target){
                    for (int k = i; k <=j; k++) {
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }else if(sum>target){
                    break;
                }
            }
        }
    }

//    private static void findSubArray(int[] arr, int target) {
//        int n= arr.length;
//        int sum=0;
//        for (int i = 0; i < n; i++) {
//            sum=arr[i];
//            for (int j = i+1; j < n; j++) {
//                sum=arr[j]+sum;
//                if (target==sum){
//                    for (int k = i; k <=j ; k++) {
//                        System.out.print(arr[k]+" ");
//                    }
//                    System.out.println();
//                }
//                else if(sum>target){
//                    break;
//                }
//
//            }
//
//        }
//        ;
//    }

//    private static void findSubArray(int[] arr, int target) {
//        int n = arr.length;
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum=arr[i];
//            for (int j = i+1; j < n; j++) {
//                sum = sum + arr[j];
//                if (target == sum) {
//                    for (int k = i; k <= j; k++) {
//                        System.out.print(arr[k] + " ");
//                    }
//                    System.out.println();
//                } else if (sum> target ) {
//                    break;
//                }
//            }
//        }
//    }
}