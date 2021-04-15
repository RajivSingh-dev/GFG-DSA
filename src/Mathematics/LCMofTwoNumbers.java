package Mathematics;

import java.util.Scanner;

public class LCMofTwoNumbers {
static int gcd(int a,int b)
{
    if (b==0)
        return a;
    else
        return gcd(b,a%b);
}
    static int lcm(int a,int b)
    {
        //Naive Solution
       /* int res=Math.max(a,b);
        while (true)
        {
            if (res%a==0 && res%b==0)
            return res;
            res++;
        }*/

        //Efficient solution
        return (a*b)/gcd(a,b);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int a=scanner.nextInt();
int b=scanner.nextInt();
    int res=lcm(a,b);
        System.out.println(res);
    }
}
