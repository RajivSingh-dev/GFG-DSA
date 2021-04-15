package Graph.DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class DepthFirstSearch {
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void DFS(ArrayList<ArrayList<Integer>> adj,int v,int s)
    {
boolean[]  visited=new boolean[v];
DFSRec(adj,s,visited);
    }
    static void DFSRec(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited)
    {
        visited[s]=true;
        System.out.print(s+" ");
        for (int u:adj.get(s))
        {
            if (visited[u]==false)
                DFSRec(adj,u,visited);
        }
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i <v ; i++) {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        DFS(adj,v,0);
    }
}
