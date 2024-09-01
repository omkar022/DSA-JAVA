package stack;

import java.util.Stack;

public class PushAtBottomOfStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(s);
        pushAtBottom(s, 4);
        System.out.println(s);
    }

    private static void pushAtBottom(Stack<Integer> s, int data) {
        Stack<Integer> ns = new Stack<>();
        while (!s.isEmpty()) {
            ns.push(s.pop());
        }
        ns.add(data);

        while (!ns.isEmpty()) {
            s.push(ns.pop());
        }
    }
}
