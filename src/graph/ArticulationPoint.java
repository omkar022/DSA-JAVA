package graph;

import java.util.ArrayList;

//disconnect graph if we remove main vertex -O(V+E)
public class ArticulationPoint {
    static int V = 6;

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }


        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));


    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        int[] dt = new int[V];
        int[] low = new int[V];
        boolean[] vis = new boolean[V];
        boolean[] ap = new boolean[V];

        int time = 0;
        int par = -1;

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                tarjanArticulationPoint(graph, vis, dt, low, time, i, par, ap);
            }
        }

        for (int i = 0; i < V; i++) {
            if (ap[i]) {
                System.out.println(i);
            }
        }

    }

    private static void tarjanArticulationPoint(ArrayList<Edge>[] graph, boolean[] vis, int[] dt, int[] low, int time, int curr, int par, boolean[] ap) {
        vis[curr] = true;
        int child = 0;

        dt[curr] = low[curr] = ++time;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                tarjanArticulationPoint(graph, vis, dt, low, time, e.dest, curr, ap);
                low[curr] = Math.min(low[curr], low[e.dest]);
                if (dt[curr] <= low[e.dest] && par != -1) {
//                    System.out.println(curr + " ");
                    ap[curr] = true;
                }
                child++;
            } else if (e.dest != par) {
                low[curr] = Math.min(low[curr], dt[e.dest]);
            }
        }


        if (par == -1 && child > 1) {
//            System.out.println(curr + " ");
            ap[curr] = true;
        }
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
