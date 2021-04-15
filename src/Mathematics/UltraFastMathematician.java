package Mathematics;

import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.next();
        String b=scanner.next();
        StringBuffer sbf=new StringBuffer("");
        for (int i = 0; i <a.length() ; i++) {
            if(a.charAt(i)!=b.charAt(i))
                sbf.append("1");
            else
                sbf.append("0");
        }
        System.out.println(sbf.toString());
    }
}
