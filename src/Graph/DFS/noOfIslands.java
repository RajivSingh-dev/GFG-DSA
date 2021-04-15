package Graph.DFS;

import java.util.ArrayList;

public class noOfIslands {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static int DFS(ArrayList<ArrayList<Integer>> adj,int v)
    {
        int count=0;
        boolean[]  visited=new boolean[v];
        for (int i = 0; i <v ; i++) {
            if (visited[i]==false)
            {
                DFSRec(adj,i,visited);
                count++;
            }
        }
        return count;

    }
    static void DFSRec(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited)
    {
        visited[s]=true;
      //  System.out.print(s+" ");
        for (int u:adj.get(s))
        {
            if (visited[u]==false)
                DFSRec(adj,u,visited);
        }
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i <v ; i++) {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 3, 4);
        addEdge(adj, 5, 6);
        System.out.println( DFS(adj,v));
    }
}
