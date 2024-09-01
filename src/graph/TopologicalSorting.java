package graph;

import java.util.ArrayList;
import java.util.Stack;

//Directed Acyclic
public class TopologicalSorting {
    static int V = 6;

    public static void creationGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }


        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));


        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));

        graph[5].add(new Edge(5, 2));


    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[V];

        creationGraph(graph);
        topSort(graph);


    }

    private static void topSort(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[V];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                topSortUtil(graph, vis, i, s);
            }


        }
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    private static void topSortUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, Stack<Integer> s) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topSortUtil(graph, vis, e.dest, s);

            }
        }

        s.push(curr);

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
