package Searching;

import java.util.Scanner;

public class TripletWithGivenSum {
static boolean isPair(int a[],int left,int right,int sum) {
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
    static boolean tripletSum(int a[],int sum)
    {
        int n=a.length;
        for (int i = 0; i <n ; i++) {
            if (isPair(a,i+1,n-1,sum-a[i]))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];

        for (int i = 0; i <n ; i++) {
            a[i]=scanner.nextInt();
        }
        int sum = scanner.nextInt();
        boolean res=tripletSum(a,sum);

        System.out.println(res);
    }
    
}
