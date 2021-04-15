package Arrays;

import sun.font.DelegatingShape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class LongestAlternateEvenOddElements {
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
    static void solve(ArrayList<Integer> al)
    {
int max=1;
int sum=1;
int n=al.size();
        for (int i = 1; i <n ; i++) {
            if ((al.get(i)%2==0 && al.get(i-1)%2!=0)||(al.get(i)%2!=0) && al.get(i-1)%2==0) {
                sum++;
                max = Math.max(max, sum);
            }else
                sum=1;


        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            ArrayList<Integer> al=new ArrayList<Integer>();
            for(int i=0;i<n;i++)
            {
                al.add(sc.nextInt());
            }

            solve(al);
        }
    }
}
