package Arrays;

import java.util.Scanner;

public class SecondLargestElementInArray {
    static int solve(int a[],int n)
    {
//Naive approach
        /*
   int res=0;
        for (int i = 0; i <n ; i++) {
            if (a[i]>a[res]) {
                res = i;
            }
        }
  //      System.out.println(res);
int secondLargest=-1;
        int idx=-1;
        for (int i = 0; i <n ; i++) {
            if (a[i] == a[res])
                continue;
            if (a[i] > secondLargest)
            {
                idx=i;
        secondLargest=a[i];
            }
        }
        return idx;*/
    //Efficient approach
int largest=0;
int res=-1;
        for (int i = 1; i <n ; i++) {
            if (a[i]>a[largest])
            {
                res=largest;
                largest=i;
            }
else if (a[i]!=a[largest])
            {
                if (res==-1 || a[i]>a[res])
                    res=i;
            }
        }
        return a[res];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();

        }
        int res=solve(a,n);
        System.out.println(res);
    }
}
