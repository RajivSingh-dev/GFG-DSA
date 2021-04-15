package Mathematics;

import java.util.Scanner;

public class GCDofTWOnumbers {
    static int gcd(int a,int b)
    {
        int res=Math.min(a,b);
        while (res>0)
        {
            if(a%res==0 && b%res==0)
            {
                break;
            }
        res--;
        }
    return res;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
    int res=gcd(a,b);
        System.out.println(res);
    }
}
