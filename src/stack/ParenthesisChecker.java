package stack;

import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        String str = "{([])}";
        System.out.println(ispar(str));
    }

    static boolean ispar(String x) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') || (s.peek() == '[' && ch == ']') || (s.peek() == '{' && ch == '}')) {
                    s.pop();
                } else {
                    return false;
                }

            }


        }
        return s.isEmpty();
    }
}
