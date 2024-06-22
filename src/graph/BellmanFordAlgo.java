package graph;

import java.util.ArrayList;

// Short dist (include -ve) ,TimeComplexity-O(V.E) fails - negative weight cycle
public class BellmanFordAlgo {
    static int V = 5;

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));


        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        bellmanFord(graph, 0);

    }

    private static void bellmanFord(ArrayList<Edge>[] graph, int src) {
        int[] dist = new int[V];
        for (int i = 0; i < V; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        for (int k = 0; k < V - 1; k++) {//O(V)

            for (int i = 0; i < V; i++) {  //O(E)
                for (int j = 0; j < graph[i].size(); j++) {
                    Edge e = graph[i].get(j);
                    int u=e.src;
                    int v=e.dest;
                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+e.wt<dist[v]){
                        dist[v]=dist[u]+e.wt;
                    }
                }
            }
        }
        for (int i = 0; i < V; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();

    }

    static class Edge {
        static int V = 5;
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
}
