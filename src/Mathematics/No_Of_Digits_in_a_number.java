package Mathematics;

public class No_Of_Digits_in_a_number {
    static  int solve(int n)
    {
        int count=0;
        //iterative
       /* while (n!=0)
        {
            n=n/10;
            count++;
        }
        return count;*/
//Recursive solution:
        /*if (n==0)
            return 0;
        return 1+solve(n/10);
        */
        //Logarithmic solution
        return (int) Math.floor(Math.log10(n)+1);
    }
    public static void main(String[] args) {
        System.out.println(solve(1234));
    }
}
