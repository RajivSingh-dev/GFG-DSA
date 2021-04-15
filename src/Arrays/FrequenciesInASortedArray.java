package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FrequenciesInASortedArray {
   static void frequency(ArrayList<Integer> al)
   {
       int[] a = al.stream().mapToInt(i -> i).toArray();
     int freq=1;
     int i=1;
while (i<a.length)
{
    while ( i<a.length && a[i]==a[i-1])
    {
        i++;
        freq++;
    }
    System.out.println(a[i-1]+" "+freq);
    i++;
    freq=1;
}
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
            frequency(al);
        }
    }
}