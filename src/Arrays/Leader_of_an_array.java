package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Leader_of_an_array {
    static void leader(int a[],int n)
    {
        //Naive
        /*for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if (a[i]<a[j])
break;
                if (j==n-1) {
                    System.out.println(a[i]+" ");
                }}
            if(i==n-1)
                System.out.println(a[i]);
        }*/
        //Efficient
  StringBuilder stringBuilder=new StringBuilder();
        ArrayList<Integer> arrayList=new ArrayList<>();
        stringBuilder.append(Integer.toString(a[n-1]));
        stringBuilder.reverse();
        int curr=a[n-1];
        for (int i = n-2; i >=0 ; i--) {
            StringBuilder sbf=new StringBuilder();
            if (curr<=a[i]) {
                curr = a[i];
                sbf.append(Integer.toString(curr));
                sbf.reverse();
        stringBuilder.append(" ");
            stringBuilder.append(sbf);
            }
        }
        System.out.print(stringBuilder.reverse());

    }
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader sc=new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();


            int a[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
leader(a,n);
            System.out.println();
        }
    }
}
