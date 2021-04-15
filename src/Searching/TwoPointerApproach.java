package Searching;

import java.util.Scanner;

public class TwoPointerApproach {
    static boolean solver(int a[],int sum)
    {
        int left=0,right=a.length-1;
        while (left<=right)
        {
            if ((a[left]+a[right])==sum)
return true;
           else if ((a[left]+a[right])>sum)
               right--;
           else
               left++;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int a[]=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]= scanner.nextInt();
        }
        int sum=scanner.nextInt();
        boolean bool=solver(a,sum);
        System.out.println(bool);
    }
}
