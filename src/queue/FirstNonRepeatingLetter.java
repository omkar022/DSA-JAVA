package queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingLetter {
    public static void main(String[] args) {
        String str = "aabccxb";
        System.out.println(firstNonRepeatLetter(str));
    }

    private static String firstNonRepeatLetter(String str) {

        Queue<Character> q = new LinkedList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            q.add(ch);

            while (!q.isEmpty() && map.get(q.peek()) > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                res.append('#');
            } else {
                res.append(q.peek());
            }
        }

        return res.toString();
    }
}
