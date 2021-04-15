package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class KadanesAlgorithmMaxSumSubarray {
    static void solve(ArrayList<Integer> al)
    {
        int n=al.size();
        int maxEnding=al.get(0);
        int res=al.get(0);
        for (int i = 1; i <n ; i++) {
            maxEnding=Math.max(maxEnding+al.get(i),al.get(i));
        res = Math.max(maxEnding,res);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();

            ArrayList<Integer> al=new ArrayList<Integer>();
            for(int i=0;i<n;i++)
            {
                al.add(sc.nextInt());
            }

            solve(al);
        }
    }
}
