package Mathematics;

import java.util.Scanner;

public class EuclideanforGCD {
    static int gcd(int a,int b)
    {
        //basic version
       /* while (a!=b)
        {
            if (a>b)
            {
                a=a-b;
            }
            else
                b=b-a;
        }
        return a;*/

        //Optimised Solution:
        if (b==0)
            return a;
        else
            return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int res=gcd(a,b);
        System.out.println(res);
    }
}
