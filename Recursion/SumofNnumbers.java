package Recursion;
import java.util.Scanner;
public class SumofNnumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
        System.out.println(summ(n));

        sc.close();
    }
    static int sum(int n){       //recursion without 
        return n*(n+1)/2;
    }
    static int summ(int n){      //recursion
        if(n==1) return 1;
        return n+summ(n-1); 
    }
}
