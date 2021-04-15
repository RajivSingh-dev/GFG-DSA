package Mathematics;

import java.util.Scanner;

public class All_Divisors_OF_no {
    static void divisors(int n)
    {
        //naive approach
       /* for (int i = 1; i <=n ; i++) {
            if (n%i==0)
                System.out.println(i);
        }*/
        //doesn't print output in sorted order
       /* for (int i = 1; i*i <=n  ; i++) {
                if (n%i==0)
                {
                    System.out.println(i);
                    if (i!=n/i)
                        System.out.println(n/i);
                }
        }*/
    //Print output in sorted order
        int i;
        for ( i = 1; i*i <n ; i++) {
            if (n%i==0)
                System.out.println(i);
        }
        for (; i>=1 ; i--) {
if (n%i==0)
{
    System.out.println(n/i);
}
        }




    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        divisors(n);
    }
}

