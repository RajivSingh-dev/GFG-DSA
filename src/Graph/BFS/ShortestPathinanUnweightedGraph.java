package Graph.BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathinanUnweightedGraph {
static void addEdge(ArrayList<ArrayList<Integer>> arrayList,int u,int v)
{
    arrayList.get(u).add(v);
    arrayList.get(v).add(u);
}
static int[] BFS(ArrayList<ArrayList<Integer>> adj,int V,int s)
{
    int dist[]=new int[V];
    Arrays.fill(dist,Integer.MAX_VALUE);
    dist[s]=0;
    Queue<Integer> q=new LinkedList<>();
    boolean visited[]=new boolean[V];
    q.add(s);
    visited[s]=true;
    while (!q.isEmpty())
    {
        int u=q.poll();
        for ( int v:adj.get(u))
        {
            if (visited[v]==false)
            {
                dist[v]=dist[u]+1;
                visited[v]=true;
                q.add(v);
            }
        }
    }
    return dist;
}
    public static void main(String[] args) {
int v=4;
ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        for (int i = 0; i <v ; i++) {
       al.add(new ArrayList<Integer>());
        }
addEdge(al,0,1);
addEdge(al,0,2);
addEdge(al,1,2);
addEdge(al,1,3);
addEdge(al,2,3);
int a[]=BFS(al,v,0);
for (int value:a)
    System.out.print(value+" ");
}
}
