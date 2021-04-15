package Mathematics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sieve_Of_Eratosthenes {
   //normal method to calculate prime numbers number within a given number
    /* static boolean isPrime(int n)
    {
        if (n==1)
            return false;
        if (n==2 || n==3)
            return true;
        if (n%2==0 || n%3==0)
        {
            return false;
        }
        for (int i =5; i*i<=n; i+=6) {
           if(n%i==0 || n%(i+2)==0)
           {
               return false;
            }
        }
        return true;
    }*/
    static void sieve(int n)
    {

       if (n<=1)
           return;
        boolean isPrime[]=new boolean[n+1];
        Arrays.fill(isPrime,true);
        for (int i = 2; i*i <=n ; i++) {
if (isPrime[i])
{
   /*
   for (int j = 2*i; j <=n ; j=j+i) {
        isPrime[j]=false;
    }
    */
    //Better approach
    for (int j = i*i; j <=n ; j=j+i) {
        isPrime[j]=false;
    }
}
        }
        for (int i = 2; i <=n ; i++) {
            if (isPrime[i])
            System.out.println(i);        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
         //normal method to calculate prime numbers number within a given number
        //Time complexity : O(n*n^(1/2))
     /*   for (int i = 1; i <=n ; i++) {
            if (isPrime(i))
            {
                System.out.println(i);
            }
        }*/
        //Time complexity : O(n*log(logn))
        sieve(n);
    }
}
