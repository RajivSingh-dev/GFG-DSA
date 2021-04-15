package Mathematics;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        int n=scanner.nextInt();
        boolean bool=true;
        //using stack
        /*  int m=n;
        while (n!=0)
        {
            stack.push(n%10);
            n=n/10;
        }

        while (!stack.isEmpty())
        {
            int temp=stack.pop();
            if (temp!=(m%10))
                bool=false;
            m=m/10;
        }*/
        int rev=0;
        int temp=n;
        while (temp!=0)
        {

            rev=rev*10+temp%10;
            temp=temp/10;
        }
        System.out.println(rev);
        if (rev==n)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
