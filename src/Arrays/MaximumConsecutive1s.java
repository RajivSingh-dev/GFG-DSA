package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumConsecutive1s {
    static void solve(ArrayList<Integer> al)
    {
        int max=0;
        int temp=0;
        for (int i = 0; i <al.size()-1 ; i++) {
            if (al.get(i)==0)
                temp=0;
            else
            {
                temp++;
                max=Math.max(max,temp);
            }

        }
        System.out.println(max);;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s= Integer.toBinaryString(n);
            ArrayList<Integer> al=new ArrayList<Integer>();
            for(int i=0;i<s.length();i++)
            {
                al.add(s.charAt(i)-'0');
            }

            solve(al);
        }
    }

}
