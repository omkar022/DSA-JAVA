package interview;

public class RotatedPalindrome {

    // Helper function to check if a string is a palindrome
//    public static boolean isPalindrome(String s) {
//        int start = 0, end = s.length() - 1;
//        while (start < end) {
//            if (s.charAt(start) != s.charAt(end)) {
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
//    }

    // Function to check if a string is a rotated palindrome
//    public static boolean isRotatedPalindrome(String s) {
//        int n = s.length();
//        String rotatedString = s + s; // Concatenate string to itself
//        for (int i = 0; i < n; i++) {
//            String substring = rotatedString.substring(i, i + n);
//            if (isPalindrome(substring)) {
//                return true;
//            }
//        }
//        return false;
//    }

    public static void main(String[] args) {
        System.out.println(isRotatedPalindrome("aab")); // true (can be rotated to "aba")
        System.out.println(isRotatedPalindrome("abc")); // false
        System.out.println(isRotatedPalindrome("aaa")); // true (already a palindrome)
    }

    private static boolean isRotatedPalindrome(String s) {
        String d=s+s;
        int n=s.length();
        for (int i = 0; i < n; i++) {
            String ns=s.substring(i,i+n);
            if(isPalindrome(ns)){
                return true;
            }
        }
        return false;
    }

//    private static boolean isRotatedPalindrome(String s) {
//        String d=s+s;
//        int n=s.length();
//        for (int i = 0; i < n; i++) {
//            String ns=d.substring(i,i+n);
//            if(isPalindrome(ns)){
//                return true;
//            }
//
//        }
//        return false;
//
//    }

//    private static boolean isRotatedPalindrome(String s) {
//        int n=s.length();
//        String d=s+s;
//        for (int i = 0; i < n; i++) {
//            String ns=d.substring(i,i+n);
//            if(isPalindrome(ns)){
//                return true;
//            }
//        }
//        return false;
//    }

    private static boolean isPalindrome(String s) {
        int l=0,r=s.length()-1;
        while (l<r){
            if (s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;

        }
        return true;
    }
}
