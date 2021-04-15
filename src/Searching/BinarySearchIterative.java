package Searching;

import java.util.Scanner;

public class BinarySearchIterative {
    static int binarysearch(int a[],int itemToSearch)
    {
        int low=0;
        int high=a.length-1;
        while (low<=high)
        {
            int mid=(low+high)/2;
            if (a[mid]==itemToSearch)
                return mid;
           else if (a[mid]>itemToSearch)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int n= scanner.nextInt();
        int a[]=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]= scanner.nextInt();
        }
        int itemToSearch= scanner.nextInt();
      int res=binarysearch(a,itemToSearch);
        System.out.println(res);
    }
}
