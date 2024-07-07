package heap;

import java.util.PriorityQueue;

public class NearbyCars {
    public static void main(String[] args) {
        int[][] pts = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int distSq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Pair(pts[i][0], pts[i][1], distSq, i));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("C" + pq.remove().idx + " ");
        }

    }

    static class Pair implements Comparable<Pair> {
        int x;
        int y;
        int distSq;
        int idx;

        public Pair(int x, int y, int distSq, int idx) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        public int compareTo(Pair p2) {
            return this.distSq - p2.distSq;
        }
    }
}
