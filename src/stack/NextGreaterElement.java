package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        long[] arr = {1, 3, 2, 4};
        int n = 4;
        System.out.println(Arrays.toString(nextLargerElement(arr, n)));
    }

    public static long[] nextLargerElement(long[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        long[] nextLarger = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextLarger[i] = -1;
            } else {
                nextLarger[i] = arr[s.peek()];
            }
            s.push(i);
        }
        return nextLarger;

    }
}
