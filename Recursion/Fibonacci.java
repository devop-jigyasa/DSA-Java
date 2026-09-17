package Recursion;
import java.util.Scanner;
public class Fibonacci {                          //nth fibonacci number
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fibo(n);
        System.out.println(ans);

        for(int i=0; i<=n; i++){
            System.out.print(fibo(i) + " ");
        }

        sc.close();
    }
    public static int fibo(int n){
        if(n==0||n==1) return n;
        return fibo(n-1)+fibo(n-2);
    }

    public static int fiboSeries(int n){
        if(n==0||n==1) return n;

        return fibo(n-1)+fibo(n-2);
    }
}
