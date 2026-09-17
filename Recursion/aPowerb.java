package Recursion;
import java.util.Scanner;
public class aPowerb {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(pow(a,b));
        System.out.println(power(a,b));

        sc.close();
    }
    static int pow(int a, int b){       // TC = o(b)
        if(b==0)return 1;
        return a*pow(a,b-1);
    }
    static int power(int a, int b){     //logarithmic time complexity - log(b)
        if(b==0)return 1;
        int call = power(a,b/2);
        if(b%2==0) return call*call;
        else return call*call*a;
    }
}
