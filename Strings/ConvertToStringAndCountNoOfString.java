package Strings;
import java.util.Scanner;
public class ConvertToStringAndCountNoOfString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//Method 1
        String x = Integer.toString(n);
        System.out.println(x);
//Method 2
        String s = "";
        s=s+n;
        System.out.println(s);
        System.out.println(s.length());

//Decimal conversion and count

        double d=sc.nextDouble();
        String ss="";
        ss=ss+d;
        System.out.println(ss);
        System.out.println(ss.length());

        sc.close();
    }
}
