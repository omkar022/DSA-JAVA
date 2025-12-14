package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

//Shortest Path -fails -ve value -O(E+ElogV)
public class DijkstraAlgo {
    static int V = 6;

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));


    }

    public static void dijkstra(ArrayList<Edge>[] graph, int src) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        int[] dist = new int[V];

        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }

        }
        boolean[] vis = new boolean[V];

        pq.add(new Pair(0, 0));
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if (!vis[curr.node]) {

                vis[curr.node] = true;
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    if (dist[u] + e.wt < dist[v]) {
                        dist[v] = dist[u] + e.wt;
                        pq.add(new Pair(v, dist[v]));
                    }

                }
            }
        }
        for (int i = 0; i < V; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();


    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        dijkstra(graph, 0);


    }

//    private static  void dijkstra(ArrayList<Edge>[] graph, int src) {
//        boolean vis[]=new boolean[V];
//        PriorityQueue<Pair>pq=new PriorityQueue<>();
//        pq.add(new Pair(0,0));
//        int dist[]=new int[V];
//        for (int i = 0; i < V; i++) {
//            if (src!=i){
//                dist[i]=Integer.MAX_VALUE;
//            }
//        }
//
//        while (!pq.isEmpty()){
//            Pair curr=pq.remove();
//            if (!vis[curr.node]){
//                vis[curr.node]=true;
//                for (int i = 0; i < graph[curr.node].size(); i++) {
//                    Edge e=graph[curr.node].get(i);
//                    int u=e.src;
//                    int v=e.dest;
//                    int wt=e.wt;
//                    if (dist[u]+wt<dist[v]){
//                        dist[v]=dist[u]+wt;
//                        pq.add(new Pair(v,dist[v]));
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < V; i++) {
//            System.out.print(dist[i] + " ");
//        }
//        System.out.println();
//
//    }

    static class Pair implements Comparable<Pair> {
        int node;
        int dist;

        public Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }

        public int compareTo(Pair p2) {
            return this.dist - p2.dist; //ascending
        }
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
}
