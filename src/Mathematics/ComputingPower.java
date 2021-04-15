package Mathematics;

import java.util.Scanner;

public class ComputingPower {

    static int power(int x,int n)
    {
        //theta(n) solution
       /* int res=1;
        for (int i = 0; i <n ; i++) {
            res=res*x;

        }
        return res;*/
        // theta(log n) solution
        if (n==0)
            return 1;
        int temp=power(x,n/2);
        temp=temp*temp;
        if (n%2==0)
            return temp;
        else
            return temp*x;
    }
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int x=scanner.nextInt();
       int n=scanner.nextInt();
int res=power(x,n);
        System.out.println(res);
    }
}
