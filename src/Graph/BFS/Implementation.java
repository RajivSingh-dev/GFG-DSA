package Graph.BFS;

import java.util.ArrayList;
import java.util.Scanner;

public class Implementation {
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void printArray(ArrayList<ArrayList<Integer>> adj)
    {
        for (int i = 0; i <adj.size() ; i++) {
            for (int j = 0; j <adj.get(i).size() ; j++) {
                System.out.print(" "+adj.get(i).get(j));
            }
            System.out.println();
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
printArray(adj);
    }
}
