package Graph.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TpologicalSorting {
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
    }
    static void topologicalSorting(ArrayList<ArrayList<Integer>> adj,int V)
    {
int indegree[]=new int[V];
        for (int i = 0; i <V ; i++) {
            for (int x:adj.get(i))
indegree[x]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for (int i = 0; i <V ; i++) {
            if (indegree[i]==0)
            q.add(i);
        }

        while (!q.isEmpty())
        {
            int u=q.poll();
            System.out.print(u+" ");
            for (int x:adj.get(u)){
            if (--indegree[x]==0)
                q.add(x);
            }
        }
    }
    public static void main(String[] args) {
int v=5;
        ArrayList<ArrayList<Integer>> arrayList=new ArrayList<>();
        for (int i = 0; i <v ; i++) {
            arrayList.add(new ArrayList<>());
        }
        addEdge(arrayList,0,2);
        addEdge(arrayList,0,3);
        addEdge(arrayList,1,3);
        addEdge(arrayList,1,4);
        addEdge(arrayList,2,3);
        topologicalSorting(arrayList,v);
    }
}
