package graph;

import java.util.ArrayList;

public class CycleDetectionDirectedGraph {
    static int V = 4;

    public static void creationGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));


    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[V];
        creationGraph(graph);


        boolean[] vis = new boolean[V];
        boolean[] rec = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                boolean isCycle = cycleDetect(graph, 0, vis, rec);
                if (isCycle) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
                break;
            }
        }


    }

    private static boolean cycleDetect(ArrayList<Edge>[] graph, int curr, boolean[] vis, boolean[] rec) {
        vis[curr] = true;
        rec[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (rec[e.dest]) {
                return true;
            } else if (!vis[e.dest] && cycleDetect(graph, e.dest, vis, rec)) {
                return true;

            }

        }
        rec[curr] = false;
        return false;
    }

    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }

    }

}
