package Arrays;
import java.util.*;

public class MoveAllZerosToEnd {
    static void solve(ArrayList<Integer> al)
    {
        //Naive
    /*    for (int i = 0; i <al.size() ; i++) {
            if(al.get(i)==0)
            for (int j = i+1; j <al.size() ; j++) {
                if (al.get(j)!=0)
                    Collections.swap(al,i,j);
            }
        }*/
        //Efficient
        int[] a = al.stream().mapToInt(i -> i).toArray();
       int count=0;
        for (int i = 0; i < al.size() ; i++) {
            if(a[i]!=0)
            {
                int temp=a[i];
                a[i]=a[count];
                a[count]=temp;
                count++;
            }

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> al = new ArrayList<Integer>(n);
            for (int i = 0; i < n; i++) {
                al.add(sc.nextInt());
            }
            solve(al);
        for (int a:al)
            System.out.println(a+" ");
        }
    }
}
