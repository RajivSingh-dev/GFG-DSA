package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {
    public static void main (String[] args)
    {
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
            Collections.reverse(al);
            for(int a:al)
                System.out.println(a+" ");
        }
    }
}
