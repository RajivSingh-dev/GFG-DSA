import java.util.Scanner;

public class Palindrome {
    static  boolean checkPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while (i<j)
        {
            if (s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;

        }
        return true;
    }

    static void solver(String s)
    {
if (s.length()<3)
    System.out.println("Impossible");
else if (s.length()==3)
{
    System.out.println(s.charAt(0));
    System.out.println(s.charAt(1));
    System.out.println(s.charAt(2));
}
else
{
   for (int i = 1; i <s.length()-1 ; i++) {
        if (checkPalindrome(s.substring(0,i)))
        {
            for (int j = i+1; j <s.length() ; j++) {
            if (checkPalindrome(s.substring(i,j)) && checkPalindrome(s.substring(j)))
            {
                System.out.println(s.substring(0,i));
                System.out.println(s.substring(i,j));
                System.out.println(s.substring(j));
                return;
            }
            }
        }
if (i==s.length()-2)
     System.out.println("Impossilbe");
    }
}

}
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        solver(s);
    }
}
