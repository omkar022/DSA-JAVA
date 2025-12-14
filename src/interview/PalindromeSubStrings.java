package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class PalindromeSubStrings {
//    public static boolean isPalindrome(String input, int l, int r) {
//        while (l < r) {
//            if (input.charAt(l) != input.charAt(r))
//                return false;
//            l++;
//            r--;
//        }
//        return true;
//    }

    //    public static List<String> findAllPalindromeSubstrings(String input) {
//        List<String> palindrome = new ArrayList<String>();
//        for (int i = 0; i < input.length(); i++) {
//            for (int j = i; j < input.length(); j++) {
//                if (isPalindrome(input, i, j)) {
//                    palindrome.add(input.substring(i, j + 1));
//                }
//            }
//        }
//        return palindrome;
//    }
//    public static List<String> findAllPalindromeSubstrings(String s) {
//        List<String> ans = new ArrayList<>();
//        int n = s.length();
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                if (isPalindrome(s, i, j)) {
//                    ans.add(s.substring(i, j + 1));
//                }
////                ans.add(s.substring(i,j+1));
//            }
//        }
//        return ans;
//    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(findAllPalindromeSubstrings(s));
    }

    private static List<String> findAllPalindromeSubstrings(String s) {
        List<String>ans=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <s.length() ; j++) {
                if(isPalindrome(s,i,j)){
                    ans.add(s.substring(i,j+1));
                }
            }
        }
        return ans;
    }

//    private static List<String> findAllPalindromeSubstrings(String s) {
//        List<String>ans=new ArrayList<>();
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i; j <s.length() ; j++) {
//                if(isPalindrome(s,i,j)){
//                    ans.add(s.substring(i,j+1));
//                }
//            }
//        }
//        return ans;
//    }

    private static boolean isPalindrome(String s, int l, int r) {
        while (l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}