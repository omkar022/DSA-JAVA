package graph;

import java.util.ArrayList;

public class HasPath {
    static int V = 7;

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        boolean[] vis = new boolean[V];

        System.out.println(hasPath(graph, 0, 5, vis));
    }

    private static boolean hasPath(ArrayList<Edge>[] graph, int s, int d, boolean[] vis) {
        if (s == d) {
            return true;
        }
        vis[s] = true;

        for (int i = 0; i < graph[s].size(); i++) {
            Edge e = graph[s].get(i);
            if (!vis[e.dest] && hasPath(graph, e.dest, d, vis)) {
                return true;
            }
        }

        return false;
    }

    private static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
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
