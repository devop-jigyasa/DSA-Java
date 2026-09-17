package Recursion;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));

        sc.close();
    }
    static int fact(int n){
        if(n==0 || n==1) return 1;
        int ans = n*fact(n-1);
        return ans;
    }
}
