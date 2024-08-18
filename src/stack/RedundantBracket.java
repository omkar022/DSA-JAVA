package stack;

import java.util.Stack;

public class RedundantBracket {
    public static void main(String[] args) {
        String str1 = "((a+b))";
        String str2 ="(a+b+(c+d))";
        System.out.println(checkRedundancy(str1));
    }

    public static boolean checkRedundancy(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                boolean hasOperator = false;
                while (s.peek() != '(') {
                    if (s.peek() == '+' || s.peek() == '-' || s.peek() == '*' || s.peek() == '/') {
                        hasOperator = true;
                    }
                    s.pop();
                }
                if (!s.isEmpty()) {
                    s.pop();
                }
                if (!hasOperator) {
                    return true;
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }
}
