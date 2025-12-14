package interview;

class Solution {
    // Function to check if a string is a palindrome
    private boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Function to check if a string is a rotated palindrome
//    public boolean isRotatedPalindrome(String str) {
//        int n = str.length();
//        if (n == 0) return false;
//
//        // Concatenate the string with itself
//        String doubled = str + str;
//
//        // Check all substrings of length n in the concatenated string
//        for (int i = 0; i < n; i++) {
//            String substring = doubled.substring(i, i + n);
//            if (isPalindrome(substring)) {
//                return true;
//            }
//        }
//        return false;
//    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String str1 = "aab";
        System.out.println(sol.isRotatedPalindrome(str1)); // Output: true

        String str2 = "abcde";
        System.out.println(sol.isRotatedPalindrome(str2)); // Output: false
    }

    private boolean isRotatedPalindrome(String str) {
        int n=str.length();
        if(n==0){
            return false;
        }
        String doubleStr=str+str;
        for (int i = 0; i < n; i++) {
            String newString=doubleStr.substring(i,i+n);
            if(isPalindrome(newString)){
                return true;
            }
        }
        return false;
    }
}
