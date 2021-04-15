import java.util.ArrayList;
import java.util.Scanner;

public class Test {
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
    public static int numIslands(char[][] grid,int m,int n)
    {

        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        int V=grid.length;
        for(int i=0;i<V;i++)
            al.add(new ArrayList<Integer>());
        System.out.println(grid.length+" "+grid[0].length);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {

                if(grid[i][j]=='1')
                {
                    al.get(i).add(j);
            }
            }

        }
        System.out.println(al);

        int res=  DFS(al,V);
        return res;

    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();

       char[][] ch=new char[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m; j++) {
                ch[i][j]=scanner.next().charAt(0);
            }
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m ; j++) {

                System.out.println(ch[i][j]);

            }
        }
        System.out.println(numIslands(ch,m,n));
    }
}
