package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Interleave2Halves {
    public static void main(String[] args) {
        int N = 4;

        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(4);
        q.add(3);
        q.add(1);

        System.out.println(rearrangeQueue(N, q));
    }

    public static ArrayList<Integer> rearrangeQueue(int N, Queue<Integer> q) {
        Queue<Integer> first = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < N / 2; i++) {
            first.add(q.remove());
        }

        while (!first.isEmpty()) {
            q.add(first.remove());
            q.add(q.remove());
        }

        while (!q.isEmpty()) {
            res.add(q.remove());
        }

        return res;
    }
}
