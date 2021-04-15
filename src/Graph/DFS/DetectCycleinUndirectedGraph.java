package Graph.DFS;

import java.util.ArrayList;

public class DetectCycleinUndirectedGraph {
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static boolean DFSRec(ArrayList<ArrayList<Integer>> arrayList,int s,boolean[] visited,int parent)
    {
        visited[s]=true;
        for (int u:arrayList.get(s))
        {
            if (visited[u]=false)
                if (DFSRec(arrayList,u,visited,s))
                    return true;
               else if (u!=parent)
                    return true;

        }
        return false;
    }
static boolean DFS(ArrayList<ArrayList<Integer>> adj,int V)
{
    boolean visited[]=new boolean[V];

    for (int i = 0; i <V ; i++) {
        if (visited[i]==false)
            if (DFSRec(adj,i,visited,-1))
                return true;
                }
    return false;
}
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i <v ; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj,0,1);
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        addEdge(adj,2,3);
        addEdge(adj,2,4);
        addEdge(adj,4,5);
        DFS(adj,v);
    }
}
