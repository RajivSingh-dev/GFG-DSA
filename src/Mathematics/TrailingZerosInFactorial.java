package Mathematics;

import java.util.Scanner;

public class TrailingZerosInFactorial {
    static int trailingseros(int n)
    {
     //naive approach
     /*   int temp=1;
        for (int i = n; i >=1 ; i--) {
            temp=temp*i;
        }
        int res=0;
        while (temp%10==0)
        {
            res++;
            temp=temp/10;
        }*/

        //better approch
        int res=0;
        for (int i = 5; i <n ; i=i*5) {
            res=res+n/i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int result=trailingseros(n);
        System.out.println(result);
    }
}
