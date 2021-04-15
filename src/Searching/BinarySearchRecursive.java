package Searching;

import java.util.Scanner;

public class BinarySearchRecursive {
    static int binarysearch(int a[],int itemToSearch,int low,int high)
    {
        if (low>high)
            return -1;
        int mid=(low+high)/2;
if (a[mid]==itemToSearch)
    return mid;
else if (a[mid]>itemToSearch)
    return binarysearch(a,itemToSearch,low,mid-1);
else
    return binarysearch(a,itemToSearch,mid+1,high);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int a[]=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]= scanner.nextInt();
        }
        int itemToSearch= scanner.nextInt();
        int low=0,high=a.length-1;
        int res=binarysearch(a,itemToSearch,low,high);
        System.out.println(res);
    }
}