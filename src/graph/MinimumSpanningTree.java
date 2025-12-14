package graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

//Undirected - Connected-Weight-Graph -without cycle - min edge wight
public class MinimumSpanningTree { //O(ElogE)
    static int V = 4;

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));


    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(primsAlgoMST(graph, 0));
//        ArrayList<Edge> mst = primsAlgoMST(graph, 0);
//        System.out.println("Edges in the Minimum Spanning Tree:");
//        for (Edge edge : mst) {
//            System.out.println("Edge: " + edge.src + " - " + edge.dest + " with weight: " + edge.wt);
//        }


    }

    //    private static int primsAlgoMST(ArrayList<Edge>[] graph, int src) {
    private static int primsAlgoMST(ArrayList<Edge>[] graph, int src) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        boolean[] vis = new boolean[V];
        ArrayList<Edge> mst = new ArrayList<>();

        int cost = 0;
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.node]) {
                vis[curr.node] = true;
                cost += curr.cost;
//                if (curr.edge != null) {
//                    mst.add(curr.edge);
//                }
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    if (!vis[e.dest]) {
                        pq.add(new Pair(e.dest, e.wt, e));
                    }
                }
            }
        }
        return cost;
//        return mst;

    }

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static class Pair implements Comparable<Pair> {
        int node;
        int cost;
        Edge edge;

        public Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        public Pair(int node, int cost, Edge edge) {
            this.node = node;
            this.cost = cost;
            this.edge = edge;
        }

        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }
}
