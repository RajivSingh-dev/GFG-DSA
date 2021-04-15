package Graph.DFS;

import java.util.ArrayList;

public class DetectCycleinaDirectedGraph {
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
     //   adj.get(v).add(u);
    }
    static boolean DFSRec(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited,boolean[] rectSt)
    {
visited[s]=true;
rectSt[s]=true;
for (int u:adj.get(s))
{
        if(visited[u]==false)
        {  if(DFSRec(adj,u,visited,rectSt))
           return true;}
else if (rectSt[u]==true)
    return true;

}
rectSt[s]=false;
return false;
    }
    static boolean DFS(ArrayList<ArrayList<Integer>> adj,int V)
    {
        boolean visited[]=new boolean[V];
        boolean recST[]=new boolean[V];
        for (int i = 0; i <V ; i++) {
            if (visited[i]==false )
                if (DFSRec(adj,i,visited,recST))
                    return true;
            }

    return false;
        }

    public static void main(String[] args) {
        int v=6;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i <v ; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj,0,1);
        addEdge(adj,2,1);
        addEdge(adj,2,3);
        addEdge(adj,3,4);
        addEdge(adj,4,5);
        addEdge(adj,5,3);
        if(DFS(adj,v))
        System.out.println("Yes");
        else
            System.out.println("NO");
    }
}
