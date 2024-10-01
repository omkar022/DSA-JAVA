package recursion;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String s = "bcabc";
        boolean[] arr = new boolean[26];
        removeDuplicates(s, 0, new StringBuilder(), arr);
    }

    private static void removeDuplicates(String s, int idx, StringBuilder sb, boolean[] arr) {
        if (idx == s.length()) {
            System.out.println(sb);
            return;
        }
        char curr = s.charAt(idx);
        if (arr[curr - 'a']) {
            removeDuplicates(s, idx + 1, sb, arr);
        } else {
            arr[curr - 'a'] = true;
            removeDuplicates(s, idx + 1, sb.append(curr), arr);
        }


    }
}
