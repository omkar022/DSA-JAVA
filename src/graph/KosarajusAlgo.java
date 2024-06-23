package graph;

import java.util.ArrayList;
import java.util.Stack;

//go to all vertex -strongly  connected components -directed
public class KosarajusAlgo {
    static int V = 5;

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));

    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        kosarajuSCCAlogo(graph);

    }

    public static void dfs(ArrayList<Edge>graph[],int curr,boolean vis[]){
        vis[curr]=true;
        System.out.print(curr+" ");
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
    }

    private static void kosarajuSCCAlogo(ArrayList<Edge>[] graph) {
        Stack<Integer> s = new Stack<>();
        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                topSortAlgo(graph, vis, i, s);
            }
        }

        ArrayList<Edge>[] transpose = new ArrayList[V];
        for (int i = 0; i < graph.length; i++) {
            vis[i]=false;
            transpose[i] = new ArrayList<>();
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e=graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest,e.src));

            }
        }

        while (!s.isEmpty()){
            int curr=s.pop();

            if(!vis[curr]){
                dfs(transpose,curr,vis);
            }
            System.out.println();
        }




    }

    private static void topSortAlgo(ArrayList<Edge>[] graph, boolean[] vis, int curr, Stack<Integer> s) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topSortAlgo(graph, vis, e.dest, s);
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
