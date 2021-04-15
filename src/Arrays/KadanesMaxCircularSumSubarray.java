package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class KadanesMaxCircularSumSubarray {
   static int minsolve(ArrayList<Integer> al)
   {
       int res=al.get(0);
       int minEnding=al.get(0);
       int n=al.size();
       for (int i = 0; i <n ; i++) {
          minEnding=Math.min(minEnding+al.get(i),al.get(i) );
          res=Math.min(res,minEnding);
       }
       return res;
   }
    static int maxsolve(ArrayList<Integer> al)
    {
        int res=al.get(0);
        int maxEnding=al.get(0);
        int n=al.size();
        for (int i = 1; i <n ; i++) {
            maxEnding=Math.max(maxEnding+al.get(i),al.get(i));
            res=Math.max(res,maxEnding);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
ArrayList<Integer> al=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                al.add(sc.nextInt());
            }
 int maxRes=maxsolve(al);
            System.out.println(maxRes);
 int minRes=minsolve(al);
            System.out.println(minRes);

        }
    }
}