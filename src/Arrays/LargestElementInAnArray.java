package Arrays;

import java.util.Scanner;

public class LargestElementInAnArray {
    static int solve(int a[],int n)
    {
        /*for (int i = 0; i < n; i++) {
            boolean bool = true;
            for (int j = 0; j < n; j++) {
                if (a[i] >=a[j])
                    continue;
                else {
                    bool = false;
                    break;
                }
            }
            if (bool) {
                return i;
            }
        } */

        int res=0;
        for (int i = 0; i <n ; i++) {
            if (a[i]>a[res]) {
                res = i;
            }
        }
    return res;
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