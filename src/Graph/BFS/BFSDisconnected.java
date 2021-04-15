package Graph.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedTransferQueue;

public class BFSDisconnected {
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
    System.out.print(u+" ");
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
    static void BFSDis(ArrayList<ArrayList<Integer>> adj,int v)
{
    boolean visited[]=new boolean[v+1];
    for (int i = 0; i <v ; i++) {
if (visited[i]==false)
    BFS(adj,i,visited);
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
        BFSDis(adj,v);
    }
}
