package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class LeftRotateByD {
    //naive approach
/*    static void leftRotateByOne(int a[])
    {
        int temp=a[0];
        for (int i = 0; i <a.length-1 ; i++) {
            a[i]=a[i+1];
        }
        a[a.length-1]=temp;
    }
    static void solve(int a[],int n,int k)
    {
        for (int i = 0; i <k ; i++) {
            leftRotateByOne(a);
        }


    }*/
  //Better approach
    /*  static void solve(int a[],int n,int k)
    {
        int b[]=new int[k];
        for (int i = 0; i <k ; i++) {
b[i]=a[i];
        }
        for (int i = k; i <n ; i++) {
            a[i-k]=a[i];
        }
        for (int i = n-k; i <n ; i++) {
            a[i]=b[i-(n-k)];
        }
    }*/
    //Efficient
    static  void reverse(int[] a,int low,int high)
    {
        while (low<high)
        {
            int temp=a[low];
            a[low]=a[high];
            a[high]=temp;
            low++;
            high--;
        }
    }
    static void leftRotate(int a[],int n,int d)
    {
reverse(a,0,d-1);
reverse(a,d,n-1);
reverse(a,0,n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();   int k = sc.nextInt();

           int a[]=new int[n];
           for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }

            leftRotate(a,n,k);
            for (int i:a)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
