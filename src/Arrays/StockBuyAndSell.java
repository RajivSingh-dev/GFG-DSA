package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class StockBuyAndSell {
  static void solve(ArrayList<Integer> al)
  {
      int profit=0;
      int low=0;
      int high=0;
      boolean b=false;
      for (int i = 1; i <al.size() ; i++) {
          if (al.get(i) > al.get(i - 1)) {
              high++;
              profit += (al.get(i) - al.get(i - 1));
b=true;
          }
          if (al.get(i) < al.get(i - 1)){
              if (high>0)
              System.out.print("("+(i-high-1)+" "+(i-1)+")"+" ");
              high=0;
          }
          if (i==al.size()-1 && high>0)
          {
              System.out.print("("+(i-high+" "+i)+")"+" ");
          }
      }
  if (!b)
      System.out.print("No Profit");
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
            System.out.println();
    }
}}
