package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class LeftRotateByOne {
    static void solve(ArrayList<Integer> al)
    {
        int[] a = al.stream().mapToInt(i -> i).toArray();
        int n=al.size();
        int temp=al.get(0);
        al.set(n-1,temp);
        for (int i = 0; i <n-1 ; i++) {
          al.set(i,a[i+1]);
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> al = new ArrayList<Integer>(n);
            for (int i = 0; i < n; i++) {
                al.add(sc.nextInt());
            }

            solve(al);
            for (int a:al)
                System.out.println(a+" ");
        }
    }
}
