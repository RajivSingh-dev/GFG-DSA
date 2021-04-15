package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumDifferenceProblem {
static int solve(ArrayList<Integer> al,int n)
{
    //Naive
 /*   int max=Integer.MIN_VALUE;
    for (int i = 0; i <n ; i++) {
        for (int j = i+1; j <n ; j++) {
                max=Math.max(max,al.get(j)-al.get(i));
        }
    }
    return max;*/
    int res=al.get(1)- al.get(0);
    int min=al.get(0);
    for (int i = 1; i <al.size() ; i++) {
        res=Math.max(res,al.get(i)-min);
        min=Math.min(al.get(i),min);
    }
    return res;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            ArrayList<Integer> al = new ArrayList<Integer>();
            for (int i = 0; i <n ; i++) {
                al.add(sc.nextInt());
            }
           int res= solve(al,n);
            System.out.println(res);
        }
    }
}
