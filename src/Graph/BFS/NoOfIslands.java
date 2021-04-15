package Graph.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NoOfIslands {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void BFS(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited)
    {
        Queue<Integer> q=new LinkedList<>();
        visited[s]=true;
        q.add(s);
        while (!q.isEmpty())
        {
            int u=q.poll();
           // System.out.print(u+" ");
            for (int v:adj.get(u))
            {
                if (visited[v]==false)
                {
                    visited[v]=true;
                    q.add(v);
                }
            }
        }
    }
    static int BFSDis(ArrayList<ArrayList<Integer>> adj,int v)
    {
        boolean visited[]=new boolean[v+1];

        int count=0;
        for (int i = 0; i <v ; i++) {
            if (visited[i]==false) {
                BFS(adj, i, visited);
            count++;
            }}
        return count;
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i <v ; i++) {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,2,3);
        addEdge(adj,1,3);
        addEdge(adj,4,5);
        addEdge(adj,5,6);
        addEdge(adj,4,6);

        System.out.println(BFSDis(adj,v));
    }
}
