package Graph.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectionofaCycleinanDirectedGraphusingKahnalgorithm {
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
adj.get(u).add(v);
    }
    static  boolean cycleDetection(ArrayList<ArrayList<Integer>> adj,int V)
    {
        int indegree[]=new int[V];
        for (int i = 0; i <V ; i++) {
            for (int u:adj.get(i))
indegree[u]++;
        }
        Queue<Integer> queue=new LinkedList<>();
        for (int i = 0; i <V ; i++) {
            if (indegree[i]==0)
                queue.add(i);
        }
int count=0;
        while (!queue.isEmpty())
        {
            int u= queue.poll();
            for (int v:adj.get(u))
            {
if (--indegree[v]==0)
    queue.add(v);
            }
count++;
        }
        return count!=V;
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i <v ; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj,0,1);
        addEdge(adj,4,1);
        addEdge(adj,3,1);
        addEdge(adj,2,3);
        addEdge(adj,1,2);
        System.out.println(cycleDetection(adj,v));
    }
}