package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    /*You are required to complete this function */
  static   int remove_duplicate(int a[], int n) {
        int res = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] != a[res - 1]) {
                a[res] = a[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> al = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                al.add(sc.nextInt());

            }
        }
    }
}