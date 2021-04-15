package Mathematics;

import java.util.Scanner;

public class FactorialOfnumber {
    static int fact(int n)
        {
      /*  if (n==0)
            return 1;
        return n*fact(n-1);*/
            int temp=1;
            for (int i = n; i >=1 ; i--) {
                temp=temp*i;
            }
            return temp;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fact(n));
    }
}
