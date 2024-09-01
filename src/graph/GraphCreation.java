package graph;

import java.util.ArrayList;

public class GraphCreation {
    static int V = 4;

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }


        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, -1));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));

        for (int i = 0; i < graph.length; i++) {

            for (Edge e : graph[i]) {
                System.out.print(e.src + " -> " + e.dest + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.print(e.src + " -> " + e.dest + " its weight " + " " + e.wt);
            System.out.println();
        }


    }

    static class Edge {
        int src;
        int dest;

        int wt;


        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;

        }


    }


}
